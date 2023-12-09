package tests;

import org.testng.annotations.*;

public class Day19TestNg03Anatations {
    //5 tane @Before , 5 tane @After Anotations var
    //Siralamasi : suite>tests>grup>class>method



    @Test
    public void test06(){
        System.out.println("Test06");
    }

    @Test
    public void test03(){
        System.out.println("Test03");
    }

    @Test
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

    //Siralamasi : suite>tests>grup>class>method
    //@BeforeSuite,  @BeforeTest , @BeforeClass ve After lar bu sira ile yalniz basta birer kez calisir
    //@BeforeGroup ve After versiyonu belirlenen test gruplarindan once sonra @BeforeMethod gibi calisir
    //@BeforeMethod ve After her test den once ve sonra calisir (jUNIT deki Before After gibi)

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite çalıştı");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test çalıştı");

    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before Groups çalıştı");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class çalıştı");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method çalıştı");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite çalıştı");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test çalıştı");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class çalıştı");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method çalıştı");

    }

}
