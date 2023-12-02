package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GeeksPage;
import utilities.ConfigReader;
import utilities.Driver;


public class Day21TestNg01GeeksPageLoginTest {


    /*
    1. Sayfaya git
    2. Page Objesi Olustur
    3. Bu objeyi kullanarak o classdaki objelere ulas
    4. Assertion
    5. Close driver


     */
    @Test
    public void openSourceLogin()throws InterruptedException{

        Driver.getDriver().get(ConfigReader.getProperty("geeks_url"));


        Thread.sleep(5000);

        GeeksPage geeksPage=new GeeksPage();

        geeksPage.username.sendKeys(ConfigReader.getProperty("geeks_username"));
        geeksPage.password.sendKeys(ConfigReader.getProperty("geeks_password"));
        geeksPage.forgotPassword.click();

        Thread.sleep(3000);

        String expected = "Please enter your email address or userHandle.";

        String actual=geeksPage.yazi.getText();

        Assert.assertEquals(actual, expected);

        Driver.closeDriver();






    }

    }

