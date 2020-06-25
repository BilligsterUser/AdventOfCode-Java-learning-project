package org.haffson.adventofcode.days.day06;


import java.awt.Point;
import java.util.*;

public class Area {
    private List<Point> pos = new ArrayList<>();

    private int[][] field;

    Area(String[] coordinates) {
        this.parseInputAndInitField(coordinates);
    }

    private void parseInputAndInitField(String[] coordinates) {
        int max_x = 0;
        int max_y = 0;
        for (String coordinate : coordinates) {
            String[] test = coordinate.split(", ");
            int x = Integer.parseInt(test[0]);
            int y = Integer.parseInt(test[1]);

            if (x > max_x) max_x = x;
            if (y > max_y) max_y = y;
            pos.add(new Point(y, x));
        }

        this.field = new int[max_y + 1][max_x + 1];
        initField();
    }

    private void initField() {
        for (int i = 0; i < pos.size(); i++) {
            this.field[pos.get(i).x][pos.get(i).y] = i + 1;
        }
    }

    public int getLargestAreaSize() {
        int[][] area = calculateAreas();
        Integer[] notInfiniteAreas = getNotInfiniteAreas(area);
        return getLargestNotInfiteArea(notInfiniteAreas, area);
    }

    private int getLargestNotInfiteArea(Integer[] notInfiniteAreas, int[][] area){

        Map<Integer, Integer> sizeMap = new HashMap<>();

        for(int i = 0; i < notInfiniteAreas.length; i++){
            for (int x = 0; x < area.length; x++) {
                for (int y = 0; y < area[x].length; y++) {
                    if(notInfiniteAreas[i].equals(area[x][y])){
                        if(sizeMap.containsKey(notInfiniteAreas[i])){
                            int value = sizeMap.get(notInfiniteAreas[i]);
                            sizeMap.put(notInfiniteAreas[i], ++value);
                        }else{
                            sizeMap.put(notInfiniteAreas[i], 1);
                        }
                    }
                }
            }
        }

        Optional<Map.Entry<Integer, Integer>> maxEntry = sizeMap.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
        return maxEntry.get().getValue().intValue();

    }

    private Integer[] getNotInfiniteAreas(int[][] areas){

        Set<Integer> valueSet = new HashSet<>();

        for (int x = 0; x < areas.length; x++) {
            for (int y = 0; y < areas[x].length; y++) {
                valueSet.add(areas[x][y]);
            }
        }

        for (int x = 0; x < areas.length; x++) {
            if(x == 0 || x == areas.length - 1){
                for (int y = 0; y < areas[x].length; y++) {
                        valueSet.remove(areas[x][y]);
                }
            }
        }

        valueSet.remove(0);

        for (int x = 0; x < areas.length; x++) {
                for (int y = 0; y < areas[x].length; y++) {
                    if(y == 0 || x == areas.length - 1){
                        valueSet.remove(areas[x][y]);
                }
            }
        }

        return valueSet.toArray(new Integer[valueSet.size()]);

    }


    private int[][] calculateAreas() {
        int[][] tempField = Arrays.stream(this.field).map(int[]::clone).toArray(int[][]::new);

        System.out.println("FIRST");
        this.fieldToString(tempField);

        for (int x = 0; x < tempField.length; x++) {
            for (int y = 0; y < tempField[x].length; y++) {
                Map<Point, Integer> map = new HashMap<Point, Integer>();
                for (int i = 0; i < pos.size(); i++) {
                    map.put(pos.get(i), calculateDistance(pos.get(i).x, x, pos.get(i).y, y));
                }


                Optional<Map.Entry<Point, Integer>> minEntry = map
                .entrySet()
                .stream()
                .min(Comparator.comparing(Map.Entry::getValue));

                int countOccurrence = Collections.frequency(map.values(), minEntry.get().getValue());

                if(countOccurrence == 1)  {
                    Point minPoint = minEntry.get().getKey();
                    tempField[x][y] = field[minPoint.x][minPoint.y];
                } else {
                    tempField[x][y] = 0;
                }
            }
        }

        System.out.println("SECOND");
        this.fieldToString(tempField);
        return tempField;
    }

    private void fieldToString(int[][] fieldCopy) {
        for (int x = 0; x < fieldCopy[0].length; x++) {
            for (int y = 0; y < fieldCopy.length; y++) {
                System.out.print("" + fieldCopy[y][x] + " | ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");
    }

    private int calculateDistance(int x0, int x1, int y0, int y1) {
        return Math.abs(x1 - x0) + Math.abs(y1 - y0);
    }


}
