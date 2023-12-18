package tests.smokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentalHomePage;
import pages.BlueRentalLoginPage;
import utilities.ATestBaseCross;
import utilities.ConfigReader;
import utilities.Driver;

public class SmokeTest03NegativeLoginTest extends ATestBaseCross {


    /*
       --> Name:
           ==> US100208_Negative_Login
       --> Description:
           ==> Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
       --> Acceptance Criteria
           ==> Customer email: fake@bluerentalcars.com
           ==> Customer password: fakepass
           ==> Error:
               - User with email fake@bluerentalcars.com not found

    */
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;

    @Test
    public void US100208_Negative_Login() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        Thread.sleep(5000);

        blueRentalHomePage = new BlueRentalHomePage();

        blueRentalLoginPage = new BlueRentalLoginPage();

        blueRentalHomePage.loginLink.click();

        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("fake_email"));

        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("fake_pass"));

        blueRentalLoginPage.loginButton.click();

        Thread.sleep(5000);

        Assert.assertEquals(blueRentalLoginPage.error_message_1.getText(),"User with email fake@bluerentalcars.com not found");

    }


}
