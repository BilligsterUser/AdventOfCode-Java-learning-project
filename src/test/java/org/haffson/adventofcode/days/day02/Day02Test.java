package org.haffson.adventofcode.days.day02;

import org.haffson.adventofcode.utils.FileReaders;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class Day02Test {

    // @MockBean
    private FileReaders fileReaders =new FileReaders();

    /* @Test
    public void testGetDay() {
        Day02 day02 = new Day02(fileReaders);
        int expectedResult = 1;
        int actualResult = day02.getDay();
        Assert.assertEquals(expectedResult, actualResult);
    }*/

    @Test
    public void testGetDay() {
        Day02 day02 = new Day02(new String[0]);
        int expectedResult = 2;
        int actualResult = day02.getDay();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFileReaders_readFile() {
        String expectedResult = "mvgowxqubnhaefjslkjlrptzyi\npvgowlqubnhaefmslkjdrpteyi\novgowoqubnhaefmslkjnrptzyi\ncvgowxqubnrxefmslkjdrptzyo\ncvgowxqubnhaefmsokjdrprzyf\ncvgowxqubnhjeflslkjgrptzyi\ncvgowxqvbnhaefmslkhdrotzyi\nhvgowxqmbnharfmslkjdrptzyi\ncvgoaxqubqhaefmslkjdrutzyi\ncvxowxqdbnhaefmslkjdgptzyi\ncvgikxqubnhaefmslkjdrptzyz\ncvgnwxqubnhaqfjslkjdrptzyi\ncqgowxqubnhaecmslkjgrptzyi\ncvpowxqucnhaefmslkjdrptzyz\nfvuoexqubnhaefmslkjdrptzyi\nsvgowxqubnhaefmsvkjdrttzyi\ncvgowxqubnhaefmblkjdfpbzyi\ncvkoyxqubnhaefsslkjdrptzyi\nbvgowxqublhaefmslkjdrptzfi\nxvgewxqubnhaefmslkjdrztzyi\ncvgowxqubzhaefmslkkrrptzyi\ncvgowxqubnhaefmslkudruuzyi\ncvgowxqubnhaefmvlkjdrptwyl\ncvgoyxqubnhaefmslkjvrotzyi\ncvgowxoubnhaewmslkjdrpbzyi\ncvgowxgubnhaefmslijdrptzxi\nlvgowxqkbnhaefmslkjdrptzqi\nxvgowxqubyhaefmflkjdrptzyi\nwvnowxgubnhaefmslkjdrptzyi\ncvgowxguwnhaefhslkjdrptzyi\ncvgowfquxnhaefmdlkjdrptzyi\ncvgywxqubnuaefmsldjdrpfzyi\ncvkowxqzbrhaefmslkjdrptzyi\ncviowxzubnhaefmslkjdrptqyi\ncvgowxqubnhaefmsozjdrptzyc\ncvglwxuubnhaewmslkjdrptzyi\ncvgowxquknhaebmsfkjdrptzyi\nvvgowxqubnhaesmslkjdrptzri\ncvgowxoubndaefmslkjdrftzyi\ncvgowxqubghaefmslkjdeptzyw\ncvgowxqubnhaetmhlkjdrpvzyi\ncvgowmquunhaefmslkjdrptzyt\ncvgooxqpbniaefmslkjdrptzyi\ncvgowxqubnhaeumslkjdkptiyi\ncvgrwxqsbnhaemmslkjdrptzyi\ncvrowxqubnhaefmslkjdrctcyi\ndvgcwxqubnhaefmslkjdrptzyq\ncugowxqubnhasfmmlkjdrptzyi\ncwgowxqobzhaefmslkjdrptzyi\ncvgowxquwnhaefmulkjdrptbyi\nnvgowxqmbnhaefmslyjdrptzyi\ncvgowxqubniakvmslkjdrptzyi\ncvyowxqubnhaefmslejdrptzyx\ncvgobxqubghaefeslkjdrptzyi\ncvgowxiubnhaebmslkjdfptzyi\ncvgosbqubnhaefmslkvdrptzyi\ncvgpwxqubnhaefvslkjdrptzyh\ncvgowxqubnyaefmslgjdsptzyi\ncvgowxqubnhaefmslkjdrprzzp\ncvgowxqubwhaemmslkjdrpazyi\ncvgowxqpbnhaemmslkjdrpczyi\ncvgoqxqubnhaelmslkjdrptzye\ncvgowxqubnhaefmslbjdrttzvi\ncvgowxqubnhlefmslkvurptzyi\ncvgowxqujngaefmslktdrptzyi\ncvgowxqubnhaefmsckjdcwtzyi\ncvcowxqubnhaetmslkjorptzyi\njvnowxqubnhaefmslkjdrptzyf\ncygowxqkbnhaefmslejdrptzyi\ncvmowxqubnhaefmslkjdritzoi\ncvgowxqubnpaefmslkjdrpnnyi\ncvgowxqubnhaefmolkjdrpnzyy\nuvgowxoubnhaefmslkjdrptzvi\ncvgowxbabehaefmslkjdrptzyi\ncvgokxqubnhaefmsckjdrjtzyi\ncvgoxwqubahaefmslkjdrptzyi\ncvgowxqusnhaefmslijdrptyyi\ncvgowxqubmhaeqmslkxdrptzyi\ncvgouxhubnhaefmslkjdrjtzyi\ncvgowxqubnhaefmslrjdqptzyk\ncvgowxiublhaefsslkjdrptzyi\ncvgowxqubnxgefmslkadrptzyi\novgowxqugshaefmslkjdrptzyi\ncvgowxquznhaeemslsjdrptzyi\ncvkowxqubnhaeomslkjdeptzyi\ncvgvwxqubxhaefmslkjdrptzyu\ncvglwxqybnhaefmslkjdrptzyb\ncvgowxqubnlfwfmslkjdrptzyi\ncvaowxqubnhaefmslkjdrvtzbi\ncvgowxqubnrmefaslkjdrptzyi\ncvgowxqubnhaefmsnkjdfpwzyi\ncvgawxqmbnhaefmsykjdrptzyi\nchgowmqubnhaefmslkjdrptwyi\ncogowxqubnhaefmslkjxrptzri\ncvgohxqubnoaesmslkjdrptzyi\ncvdowxqubnhaofmslkjdrpvzyi\nvvgowrqubnhaefmslkjdrpthyi\ncvgowxquknhuefmslkjdoptzyi\ncvyowxeubnhaefmslhjdrptzyi\ncvglwxqubnhaefmslkjdrptdyq\ncvgowxqubnhaefmsikgdrptayi\ncvgowxqubnhaefjhlkjdrpczyi\ncvgzwxkubnhaefmslkjdjptzyi\ncxgowxqubnhaefmslkjdrptwyy\ncvgowxqubnhaefeslkjdrmqzyi\ncvgowxvubnhaefmilijdrptzyi\ncvgowxqzbthaeomslkjdrptzyi\ncvgowhqubndaefmglkjdrptzyi\ncvgowxvubnhaeamylkjdrptzyi\ncvgowiqubnhgefmslkjdrctzyi\ncvgowxqubchaefmslksdritzyi\ncvgowxqubnhaefmsnkjdreyzyi\ncvgowxqubihaefmslkgdrutzyi\ncvgowxqjbnhaeamslkjdrptzwi\ncvgowxzubnhaefmsxkjdrrtzyi\ncvgowxqubyhaetmslnjdrptzyi\ncvgowxquhnhaebmslkjdxptzyi\ncvgowxqubnhanfmslujdxptzyi\ncvgowxqublhnefaslkjdrptzyi\ncvgmwxqtbnhaefmslkjsrptzyi\njvgowxqubnhaeamslkjdrpmzyi\ncvgowxqubhiaefmsljjdrptzyi\nsvgowxqubnhaefmswkjdrpozyi\ncvgowxqebnhaeqmslkjdiptzyi\ncveowxqubnhayzmslkjdrptzyi\ncvglwxqubnhaefmxlkjdiptzyi\ncvgowkqubdhaefmszkjdrptzyi\ncvgowxkxbnhaeffslkjdrptzyi\ncugowxqubnnaefmslujdrptzyi\ncqgowxwubnhaepmslkjdrptzyi\ncvgowxqubnhayfmmlkjwrptzyi\ncvgowxquenhaefmsskxdrptzyi\ncvgowxqubnhiefmsrkjdtptzyi\nmvgowxkubnhaefmjlkjdrptzyi\ncvgowkquunhaefmglkjdrptzyi\ncvgowxqubqhaexmslgjdrptzyi\njvgowxqubnhaefmslkjddptlyi\ncvgiwxqubnhaefmslkjdpptmyi\nczgowxqubntaevmslkjdrptzyi\ncvgotmqubnhaefmslkjdrpazyi\ncvgowxtubnhaefmslkqdtptzyi\ncvbowxqhnnhaefmslkjdrptzyi\ncvgowkqubshaefmstkjdrptzyi\ncvgowqqrbnaaefmslkjdrptzyi\ncvgoixqubnhaefmslkjdrpmryi\ncvgoxxqubnhaeimsxkjdrptzyi\ncvgowxqubzhaebmslkjyrptzyi\ncjgewxqubnhaefsslkjdrptzyi\ncvgowxqdbnkaefmslwjdrptzyi\ncvgowxqzbnhaeamslkjdrftzyi\ncvgoixqubnsaewmslkjdrptzyi\ncvgswxqubnhaxfmslkjdrptzni\ncvwowxmubnhgefmslkjdrptzyi\ncvggwxqubnhaefmslqjdbptzyi\ncvgzwxqjbnhaefaslkjdrptzyi\ncvgowzqubnharfmspkjdrptzyi\ncvgowxqubnhawfmslkjdeptzyb\ncvuowequbnhaefmslkjdrntzyi\ngvgowxqubnxaefmslkjdrjtzyi\ncvgowxqubnhmetmsldjdrptzyi\ncvgowxqubnhamfmsqkjdrptyyi\ncvgoqxqubnhaefmslkjtrpazyi\ncvgoexqubhhaefmslkjdrhtzyi\ncvgowwqubnhaeflslkjdrptzyf\ncvgowlpubnhaefmslkjdrptvyi\ncvgowxouunhaebmslkjdrptzyi\ncvdowhqubnhaefmslijdrptzyi\ncvgowxqubnkatfmslkjdrhtzyi\ncvgowxqpbnhxeumslkjdrptzyi\ncvgowxqubnhaefmsukjjrptzyn\ncvgowxqubnhmefmslzjdrvtzyi\ncvtowxqubihaefmclkjdrptzyi\nchgowcqubnhayfmslkjdrptzyi\ncvguwxqubnhaefmblkjarptzyi\ncvgowoqubnhaefmsikjdrytzyi\ncvgkwxqubnhaefmslkjdrptchi\ncvhowxqubnhaefmslkjdrvlzyi\ncvlowxfubnhaefmslkjkrptzyi\ncvgowxqubhhaefoslkjdrytzyi\ncvgowxsubqhaefmslpjdrptzyi\ncvgowxpubnhaefmslhjdrptzyb\ncvgowxqubnhrefmjlkddrptzyi\ncvgowxqubnhaxfmykkjdrptzyi\nmvgowxqubnhakfmslkjdrptnyi\ncwgowxqubnhaffmslkadrptzyi\nchgowxquwnhaefmslsjdrptzyi\ncvgowxqubnhaefmslkjdwpnsyi\ncvgawxqubnhaefmslkldyptzyi\ncvgowxqubnhiefmslkjdiprzyi\ncvgkqxqubnhaefcslkjdrptzyi\ncvgovoqubnhaefmslkjdrpuzyi\ncvgowxqubnhaefmszkjdrjtzyk\ncvgopxqubnhaefmslkjdqpnzyi\ncvgtwxqubnhaefmslkjnrptzri\ncvgowxqurnhaedmslfjdrptzyi\ncvpowxqubnhaefmswkjdrltzyi\ncvgowxqujnpaefmslkjdrptdyi\ncvgowgqubnhzifmslkjdrptzyi\nlvgowxqubnhaenmslkjdbptzyi\nebgowxqubnhaeymslkjdrptzyi\ncvgowxtubqhaefmslkedrptzyi\ncvgowxqubshaesmslkjdrptryi\ncvgowxqubnhaefmflkjmrpkzyi\ncvgowxqubngaefmslkjdrytzgi\ncvgowxqubnhaefmslklhzptzyi\ncveowxqubnhgefmslkjdrpezyi\ncvgowxqubnhaeomslkjdrqtzym\ncvgowxqubzhaefmslwjdrptfyi\ncmgowxqubnhaefmsdkjdrptzui\ncvlowxqubnhaefmslsjdrptzwi\ncvhowxpubnhaefmslkjhrptzyi\ncveosxqurnhaefmslkjdrptzyi\ncvgowxqubnhaefgsdkjdrptjyi\ncvgvwxqubnhaefmslzjdmptzyi\ncviowxqubnhalfmslkjdrptzyr\ncvgowxqubchqefmslkjdrptzoi\ncvgownqubnhaefmsyktdrptzyi\ncvgywxqubnuaefmslkjdrpfzyi\ncvgobxqunnhaefmslkjdrptzbi\ncvgowxqubshaefgslkjdrxtzyi\ncvghwxqubnhaefmslkjdrbtmyi\ncvhowxqubnhaefmslkjdrpnzys\ncvgowxqubnmaefmslejdrptzyq\ncvmrwxqubnhaefmslkjdrpzzyi\ncvgowxqubshaefmslkfdrptzyu\ncvgowqqubnhaefmslkodrpjzyi\ncvgnwnquknhaefmslkjdrptzyi\ncvgowxquxnhacfmflkjdrptzyi\novgowxqubnhaefmslkjmrmtzyi\ncvgowxqubneaefmslkedrptzqi\ncvgowxqubphweflslkjdrptzyi\ncvgowxqudnhaefmplkjdrptdyi\ncvwowxbubnhaefmslkjurptzyi\ncvgowxtubnhaefmslkjdrwwzyi\ncvgowxqubnhkefmslajdrptzyn\ncvgowxqxbphaefmslkjdrptzsi\ncvgowxquenhaefmslmjwrptzyi\nzvgowdqubnhaeftslkjdrptzyi\ncsgowxqubnhgefmslkjdrptzyy\ncvgolxqubahaefmslkjdrpvzyi\ncvgoqxquhwhaefmslkjdrptzyi\ncvgawxqubghaefmsrkjdrptzyi\ncvgozxqubnhaefmslkwdfptzyi\ncvgowxqubnhaefmslhjdkptzzi\ncvnowxqubnhaefmsqkjdrptqyi\ncvpowxqubnhaefmslkpdrptdyi\ncvgowxoubnhaermslkjdrctzyi\ncvgowxqubnheefmslkjdrctzyr\ncvgowxqunnhaqfhslkjdrptzyi\ncvgowxqulnhaefmslrjdrntzyi\n";
        String actualResult = fileReaders.readFile("input/day2/input");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testFileReaders_readFileAsStrArr() {
        String[] expectedResult = new String[]{"mvgowxqubnhaefjslkjlrptzyi","pvgowlqubnhaefmslkjdrpteyi","ovgowoqubnhaefmslkjnrptzyi","cvgowxqubnrxefmslkjdrptzyo","cvgowxqubnhaefmsokjdrprzyf","cvgowxqubnhjeflslkjgrptzyi","cvgowxqvbnhaefmslkhdrotzyi","hvgowxqmbnharfmslkjdrptzyi","cvgoaxqubqhaefmslkjdrutzyi","cvxowxqdbnhaefmslkjdgptzyi","cvgikxqubnhaefmslkjdrptzyz","cvgnwxqubnhaqfjslkjdrptzyi","cqgowxqubnhaecmslkjgrptzyi","cvpowxqucnhaefmslkjdrptzyz","fvuoexqubnhaefmslkjdrptzyi","svgowxqubnhaefmsvkjdrttzyi","cvgowxqubnhaefmblkjdfpbzyi","cvkoyxqubnhaefsslkjdrptzyi","bvgowxqublhaefmslkjdrptzfi","xvgewxqubnhaefmslkjdrztzyi","cvgowxqubzhaefmslkkrrptzyi","cvgowxqubnhaefmslkudruuzyi","cvgowxqubnhaefmvlkjdrptwyl","cvgoyxqubnhaefmslkjvrotzyi","cvgowxoubnhaewmslkjdrpbzyi","cvgowxgubnhaefmslijdrptzxi","lvgowxqkbnhaefmslkjdrptzqi","xvgowxqubyhaefmflkjdrptzyi","wvnowxgubnhaefmslkjdrptzyi","cvgowxguwnhaefhslkjdrptzyi","cvgowfquxnhaefmdlkjdrptzyi","cvgywxqubnuaefmsldjdrpfzyi","cvkowxqzbrhaefmslkjdrptzyi","cviowxzubnhaefmslkjdrptqyi","cvgowxqubnhaefmsozjdrptzyc","cvglwxuubnhaewmslkjdrptzyi","cvgowxquknhaebmsfkjdrptzyi","vvgowxqubnhaesmslkjdrptzri","cvgowxoubndaefmslkjdrftzyi","cvgowxqubghaefmslkjdeptzyw","cvgowxqubnhaetmhlkjdrpvzyi","cvgowmquunhaefmslkjdrptzyt","cvgooxqpbniaefmslkjdrptzyi","cvgowxqubnhaeumslkjdkptiyi","cvgrwxqsbnhaemmslkjdrptzyi","cvrowxqubnhaefmslkjdrctcyi","dvgcwxqubnhaefmslkjdrptzyq","cugowxqubnhasfmmlkjdrptzyi","cwgowxqobzhaefmslkjdrptzyi","cvgowxquwnhaefmulkjdrptbyi","nvgowxqmbnhaefmslyjdrptzyi","cvgowxqubniakvmslkjdrptzyi","cvyowxqubnhaefmslejdrptzyx","cvgobxqubghaefeslkjdrptzyi","cvgowxiubnhaebmslkjdfptzyi","cvgosbqubnhaefmslkvdrptzyi","cvgpwxqubnhaefvslkjdrptzyh","cvgowxqubnyaefmslgjdsptzyi","cvgowxqubnhaefmslkjdrprzzp","cvgowxqubwhaemmslkjdrpazyi","cvgowxqpbnhaemmslkjdrpczyi","cvgoqxqubnhaelmslkjdrptzye","cvgowxqubnhaefmslbjdrttzvi","cvgowxqubnhlefmslkvurptzyi","cvgowxqujngaefmslktdrptzyi","cvgowxqubnhaefmsckjdcwtzyi","cvcowxqubnhaetmslkjorptzyi","jvnowxqubnhaefmslkjdrptzyf","cygowxqkbnhaefmslejdrptzyi","cvmowxqubnhaefmslkjdritzoi","cvgowxqubnpaefmslkjdrpnnyi","cvgowxqubnhaefmolkjdrpnzyy","uvgowxoubnhaefmslkjdrptzvi","cvgowxbabehaefmslkjdrptzyi","cvgokxqubnhaefmsckjdrjtzyi","cvgoxwqubahaefmslkjdrptzyi","cvgowxqusnhaefmslijdrptyyi","cvgowxqubmhaeqmslkxdrptzyi","cvgouxhubnhaefmslkjdrjtzyi","cvgowxqubnhaefmslrjdqptzyk","cvgowxiublhaefsslkjdrptzyi","cvgowxqubnxgefmslkadrptzyi","ovgowxqugshaefmslkjdrptzyi","cvgowxquznhaeemslsjdrptzyi","cvkowxqubnhaeomslkjdeptzyi","cvgvwxqubxhaefmslkjdrptzyu","cvglwxqybnhaefmslkjdrptzyb","cvgowxqubnlfwfmslkjdrptzyi","cvaowxqubnhaefmslkjdrvtzbi","cvgowxqubnrmefaslkjdrptzyi","cvgowxqubnhaefmsnkjdfpwzyi","cvgawxqmbnhaefmsykjdrptzyi","chgowmqubnhaefmslkjdrptwyi","cogowxqubnhaefmslkjxrptzri","cvgohxqubnoaesmslkjdrptzyi","cvdowxqubnhaofmslkjdrpvzyi","vvgowrqubnhaefmslkjdrpthyi","cvgowxquknhuefmslkjdoptzyi","cvyowxeubnhaefmslhjdrptzyi","cvglwxqubnhaefmslkjdrptdyq","cvgowxqubnhaefmsikgdrptayi","cvgowxqubnhaefjhlkjdrpczyi","cvgzwxkubnhaefmslkjdjptzyi","cxgowxqubnhaefmslkjdrptwyy","cvgowxqubnhaefeslkjdrmqzyi","cvgowxvubnhaefmilijdrptzyi","cvgowxqzbthaeomslkjdrptzyi","cvgowhqubndaefmglkjdrptzyi","cvgowxvubnhaeamylkjdrptzyi","cvgowiqubnhgefmslkjdrctzyi","cvgowxqubchaefmslksdritzyi","cvgowxqubnhaefmsnkjdreyzyi","cvgowxqubihaefmslkgdrutzyi","cvgowxqjbnhaeamslkjdrptzwi","cvgowxzubnhaefmsxkjdrrtzyi","cvgowxqubyhaetmslnjdrptzyi","cvgowxquhnhaebmslkjdxptzyi","cvgowxqubnhanfmslujdxptzyi","cvgowxqublhnefaslkjdrptzyi","cvgmwxqtbnhaefmslkjsrptzyi","jvgowxqubnhaeamslkjdrpmzyi","cvgowxqubhiaefmsljjdrptzyi","svgowxqubnhaefmswkjdrpozyi","cvgowxqebnhaeqmslkjdiptzyi","cveowxqubnhayzmslkjdrptzyi","cvglwxqubnhaefmxlkjdiptzyi","cvgowkqubdhaefmszkjdrptzyi","cvgowxkxbnhaeffslkjdrptzyi","cugowxqubnnaefmslujdrptzyi","cqgowxwubnhaepmslkjdrptzyi","cvgowxqubnhayfmmlkjwrptzyi","cvgowxquenhaefmsskxdrptzyi","cvgowxqubnhiefmsrkjdtptzyi","mvgowxkubnhaefmjlkjdrptzyi","cvgowkquunhaefmglkjdrptzyi","cvgowxqubqhaexmslgjdrptzyi","jvgowxqubnhaefmslkjddptlyi","cvgiwxqubnhaefmslkjdpptmyi","czgowxqubntaevmslkjdrptzyi","cvgotmqubnhaefmslkjdrpazyi","cvgowxtubnhaefmslkqdtptzyi","cvbowxqhnnhaefmslkjdrptzyi","cvgowkqubshaefmstkjdrptzyi","cvgowqqrbnaaefmslkjdrptzyi","cvgoixqubnhaefmslkjdrpmryi","cvgoxxqubnhaeimsxkjdrptzyi","cvgowxqubzhaebmslkjyrptzyi","cjgewxqubnhaefsslkjdrptzyi","cvgowxqdbnkaefmslwjdrptzyi","cvgowxqzbnhaeamslkjdrftzyi","cvgoixqubnsaewmslkjdrptzyi","cvgswxqubnhaxfmslkjdrptzni","cvwowxmubnhgefmslkjdrptzyi","cvggwxqubnhaefmslqjdbptzyi","cvgzwxqjbnhaefaslkjdrptzyi","cvgowzqubnharfmspkjdrptzyi","cvgowxqubnhawfmslkjdeptzyb","cvuowequbnhaefmslkjdrntzyi","gvgowxqubnxaefmslkjdrjtzyi","cvgowxqubnhmetmsldjdrptzyi","cvgowxqubnhamfmsqkjdrptyyi","cvgoqxqubnhaefmslkjtrpazyi","cvgoexqubhhaefmslkjdrhtzyi","cvgowwqubnhaeflslkjdrptzyf","cvgowlpubnhaefmslkjdrptvyi","cvgowxouunhaebmslkjdrptzyi","cvdowhqubnhaefmslijdrptzyi","cvgowxqubnkatfmslkjdrhtzyi","cvgowxqpbnhxeumslkjdrptzyi","cvgowxqubnhaefmsukjjrptzyn","cvgowxqubnhmefmslzjdrvtzyi","cvtowxqubihaefmclkjdrptzyi","chgowcqubnhayfmslkjdrptzyi","cvguwxqubnhaefmblkjarptzyi","cvgowoqubnhaefmsikjdrytzyi","cvgkwxqubnhaefmslkjdrptchi","cvhowxqubnhaefmslkjdrvlzyi","cvlowxfubnhaefmslkjkrptzyi","cvgowxqubhhaefoslkjdrytzyi","cvgowxsubqhaefmslpjdrptzyi","cvgowxpubnhaefmslhjdrptzyb","cvgowxqubnhrefmjlkddrptzyi","cvgowxqubnhaxfmykkjdrptzyi","mvgowxqubnhakfmslkjdrptnyi","cwgowxqubnhaffmslkadrptzyi","chgowxquwnhaefmslsjdrptzyi","cvgowxqubnhaefmslkjdwpnsyi","cvgawxqubnhaefmslkldyptzyi","cvgowxqubnhiefmslkjdiprzyi","cvgkqxqubnhaefcslkjdrptzyi","cvgovoqubnhaefmslkjdrpuzyi","cvgowxqubnhaefmszkjdrjtzyk","cvgopxqubnhaefmslkjdqpnzyi","cvgtwxqubnhaefmslkjnrptzri","cvgowxqurnhaedmslfjdrptzyi","cvpowxqubnhaefmswkjdrltzyi","cvgowxqujnpaefmslkjdrptdyi","cvgowgqubnhzifmslkjdrptzyi","lvgowxqubnhaenmslkjdbptzyi","ebgowxqubnhaeymslkjdrptzyi","cvgowxtubqhaefmslkedrptzyi","cvgowxqubshaesmslkjdrptryi","cvgowxqubnhaefmflkjmrpkzyi","cvgowxqubngaefmslkjdrytzgi","cvgowxqubnhaefmslklhzptzyi","cveowxqubnhgefmslkjdrpezyi","cvgowxqubnhaeomslkjdrqtzym","cvgowxqubzhaefmslwjdrptfyi","cmgowxqubnhaefmsdkjdrptzui","cvlowxqubnhaefmslsjdrptzwi","cvhowxpubnhaefmslkjhrptzyi","cveosxqurnhaefmslkjdrptzyi","cvgowxqubnhaefgsdkjdrptjyi","cvgvwxqubnhaefmslzjdmptzyi","cviowxqubnhalfmslkjdrptzyr","cvgowxqubchqefmslkjdrptzoi","cvgownqubnhaefmsyktdrptzyi","cvgywxqubnuaefmslkjdrpfzyi","cvgobxqunnhaefmslkjdrptzbi","cvgowxqubshaefgslkjdrxtzyi","cvghwxqubnhaefmslkjdrbtmyi","cvhowxqubnhaefmslkjdrpnzys","cvgowxqubnmaefmslejdrptzyq","cvmrwxqubnhaefmslkjdrpzzyi","cvgowxqubshaefmslkfdrptzyu","cvgowqqubnhaefmslkodrpjzyi","cvgnwnquknhaefmslkjdrptzyi","cvgowxquxnhacfmflkjdrptzyi","ovgowxqubnhaefmslkjmrmtzyi","cvgowxqubneaefmslkedrptzqi","cvgowxqubphweflslkjdrptzyi","cvgowxqudnhaefmplkjdrptdyi","cvwowxbubnhaefmslkjurptzyi","cvgowxtubnhaefmslkjdrwwzyi","cvgowxqubnhkefmslajdrptzyn","cvgowxqxbphaefmslkjdrptzsi","cvgowxquenhaefmslmjwrptzyi","zvgowdqubnhaeftslkjdrptzyi","csgowxqubnhgefmslkjdrptzyy","cvgolxqubahaefmslkjdrpvzyi","cvgoqxquhwhaefmslkjdrptzyi","cvgawxqubghaefmsrkjdrptzyi","cvgozxqubnhaefmslkwdfptzyi","cvgowxqubnhaefmslhjdkptzzi","cvnowxqubnhaefmsqkjdrptqyi","cvpowxqubnhaefmslkpdrptdyi","cvgowxoubnhaermslkjdrctzyi","cvgowxqubnheefmslkjdrctzyr","cvgowxqunnhaqfhslkjdrptzyi","cvgowxqulnhaefmslrjdrntzyi"};
        String[] actualResult = fileReaders.readFileAsStrArr("input/day2/input");
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void test_firstPart_returnsExpectedResult() {
        String[] strArr=new String[]{"abcdef","bababc","abbcde","abcccd","aabcdd","abcdee","ababab"};
        Day02 day02 = new Day02(strArr);
        String expectedResult = "Part 1 - Checksum: " + 12;
        String actualResult = day02.firstPart();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_secondPart_returnsExpectedResult() {
        String[] strArr=new String[]{"abcde","fghij","klmno","pqrst","fguij","axcye","wvxyz"};
        Day02 day02 = new Day02(strArr);
        String expectedResult = "Part 2 - CommonLetters: fgij";
        String actualResult = day02.secondPart();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
