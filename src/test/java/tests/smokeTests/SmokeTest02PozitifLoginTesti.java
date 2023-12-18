package tests.smokeTests;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.BlueRentalHomePage;
import pages.BlueRentalLoginPage;
import utilities.ATestBaseCross;
import utilities.ConfigReader;
import utilities.Driver;

public class SmokeTest02PozitifLoginTesti extends ATestBaseCross {

    BlueRentalHomePage blueRentalHomePage;   //class objeleri tepede olusturmak daha makul cunku diger Test de yazılırsa bulussun
    BlueRentalLoginPage blueRentalLoginPage;

    @Ignore
    @Test
    public void US100201_Admin_Login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        Thread.sleep(3000);

        blueRentalHomePage = new BlueRentalHomePage();

        blueRentalLoginPage = new BlueRentalLoginPage();

        blueRentalHomePage.loginLink.click();

        Thread.sleep(3000);

        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_email"));

        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_sifre"));

        blueRentalLoginPage.loginButton.click();

        Thread.sleep(3000);

        Assert.assertTrue(blueRentalHomePage.userID.isDisplayed());

        Driver.closeDriver();
    }



}
