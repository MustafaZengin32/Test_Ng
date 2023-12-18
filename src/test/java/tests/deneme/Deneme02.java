package tests.deneme;

import org.testng.annotations.Test;

public class Deneme02 {

    @Test
    public void test04(){

        System.out.println("Test 04 Calisti");
    }

    @Test(groups = "group1")
    public void test05(){
        System.out.println("Test 05 Calisti");
    }

    @Test
    public void test06(){
        System.out.println("Test 06 Calisti");
    }
}
