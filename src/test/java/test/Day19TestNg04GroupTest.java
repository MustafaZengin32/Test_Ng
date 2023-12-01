package test;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Day19TestNg04GroupTest {

    @BeforeGroups("group1")
    public void beforeGroup1() {
        System.out.println("Before Group 1");
    }

    @Test(groups = "group1")
    public void testMethod1() {
        System.out.println("Test Method 1");
    }

    @Test(groups = "group1")
    public void testMethod2() {
        System.out.println("Test Method 2");
    }

    @AfterGroups("group1")
    public void afterGroup1() {
        System.out.println("After Group 1");
    }

    @BeforeGroups("group2")
    public void beforeGroup2() {
        System.out.println("Before Group 2");
    }

    @Test(groups = "group2")
    public void testMethod3() {
        System.out.println("Test Method 3");
    }

    @Test(groups = "group2")
    public void testMethod4() {
        System.out.println("Test Method 4");
    }

    @AfterGroups("group2")
    public void afterGroup2() {
        System.out.println("After Group 2");
    }


}
