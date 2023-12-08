package test.dataProvider;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.BlueRentalHomePage;
import pages.BlueRentalLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class DataProviderTest02 {

    @DataProvider(name="testcase01")
    public Object[][] customerData(){
        Object[][] musteriBilgileri = {
                {"gytqydijjtbpokmfbu@cazlq.com", "Ruby.1*"},
                {"wgh65009@omeie.com", "Angel0418!"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^" },
                {"pam.raymond@bluerentalcars.com", "Nga^g6!"}
        };
        return musteriBilgileri;
    }
    //    TEST
    @Ignore
    @Test(dataProvider = "testcase01")
    public void dataProviderTest1(String email, String password){
        System.out.println("EMAIL : "+email+" | SIFRE : "+password);
    }
    //    BU 4 CUSTOMER DATALARI ILE LOGIN TESTI YAPALIM
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;

    @Test(dataProvider ="customerData")
    public void data1(String email, String password) throws IOException {

        //        Sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));//HOME SAYFASINA

        blueRentalHomePage.loginLink.click();

        blueRentalHomePage= new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();

        ReusableMethods.waitFor(1);// 1 saniye bekle
        blueRentalLoginPage.emailBox.sendKeys(email);
        ReusableMethods.waitFor(1);
        blueRentalLoginPage.passwordBox.sendKeys(password);
        ReusableMethods.waitFor(1);
        blueRentalLoginPage.loginButton.click();
        //            GIRIS YAPILDI
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(blueRentalHomePage.userID);//ASSERTION
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot();
        ReusableMethods.waitFor(1);
        blueRentalHomePage.userID.click();
        ReusableMethods.waitFor(1);
        blueRentalHomePage.logOutLink.click();
        ReusableMethods.waitFor(1);
        blueRentalHomePage.OK.click();

    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}
