package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day21TestNg03HerokuLoginTest {

   @Test
    public void test() throws InterruptedException {
       Driver.getDriver().get(ConfigReader.getProperty("heroku_url"));

       Thread.sleep(3000);

       HerokuPage herokuPage=new HerokuPage();

       herokuPage.username.sendKeys(ConfigReader.getProperty("heroku_username"));

       herokuPage.password.sendKeys(ConfigReader.getProperty("heroku_password"));

       herokuPage.login.click();

       Thread.sleep(3000);

       Assert.assertTrue(herokuPage.successfullylogin.isDisplayed());








   }
}
