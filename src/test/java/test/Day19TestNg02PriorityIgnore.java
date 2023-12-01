package test;

import org.testng.annotations.*;

public class Day19TestNg02PriorityIgnore {

    //TestNg normalde kural olarak natural order a gore calisir , methodlar alfabatik siraya gore calisir
    //Ancak biz bu siralamayi degistirebiliriz , bunun icin :
    // @Test(priority=1) yazarak kucuk numaradan buyuge gore testleri calistiririz
    // @Test() icinde priority yazmazsa sifir kabul edilir, yani priority yazmayan natural order a tabidir once calisir
    //Burada testler 1 3 4 5 6 2 olarak calisir , 6 ve 2 disindaki testler de priority yazmaz yani 0 dir
    //Bu sebeple ilk olarak calisir , sonra priority ile sira calisir

    @Test(priority = 1)
    public void test06(){
        System.out.println("Test06");
    }

    @Test
    public void test03(){
        System.out.println("Test03");
    }

    @Test(priority = 2)
    public void test02(){
        System.out.println("Test02");
    }

    @Test
    public void test04(){
        System.out.println("Test04");
    }

    @Test
    public void test05(){
        System.out.println("Test05");
    }

    @Test
    public void test01(){
        System.out.println("Test01");
    }

    //Ignore yazarsak o testi gormezden gelir , islem yapmaz
    @Ignore
    @Test
    public void test07(){
        System.out.println("Test07");
    }

    //Enable false da ignore islevi gorur
    //Sonra kullaniriz diye silmeyip ignore ya da enable false yapariz
    @Test(enabled = false)
    public void test08(){
        System.out.println("Test08");
    }

    //priority yi - ile baslatirsak priorty olmayan yani sifir olan testlerden de once calisir
    //Burada ilk en kucuk olan yani -9 olan calisir sonra -5 olana calisir , sonra 0 olan yani yazilmayanlar calisir,
    //Daha sonra da pozitif olanlar calisir

    @Test(priority = -5)
    public void test09(){
        System.out.println("Test09");
    }

    @Test(priority = -9)
    public void test010(){
        System.out.println("Test010");
    }






}
