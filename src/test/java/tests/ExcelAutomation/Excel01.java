package tests.ExcelAutomation;

import org.testng.annotations.Test;
import pages.BlueRentalHomePage;
import pages.BlueRentalLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Excel01 {
 /*
     ==> Manual test yapıp adımlarımızı yazıyoruz
            --->Kullanıcı ad ve sifreleri:
                    gytqydijjtbpokmfbu@cazlq.com	Ruby.1*
                    wgh65009@omeie.com	Angel0418!
                    raj.khan@bluerentalcars.com	v7Hg_va^
                    pam.raymond@bluerentalcars.com	Nga^g6!


--------------------------------------ILK GIRIS--------------------------------------
        HOME PAGE DEYIZ
        home page logine tikla
        LOGIN PAGE DEYIZ
        kullanici adini gir(excelden al)
        kullanici sifresini git(excelden al)
        login page login buttonuna tikla
        user id ==> is display
        user id ==> click
        Log out
        ok

--------------------------------------2. GIRIS--------------------------------------
        HOME PAGE DEYIZ
        kullanici ID ye tikla                       --->>> try catch
        Logout linkine tikla                        --->>> try catch
        OK e tikla                (alert değildir)  --->>> try catch
        home page logine tikla                      --->>> try catch
        LOGIN PAGE DEYIZ
        kullanici adini gir(excelden al)
        kullanici sifresini git(excelden al)
        login page login buttonuna tikla

--------------------------------------3. GIRIS--------------------------------------
        HOME PAGE DEYIZ
        kullanici ID ye tikla
        Logout linkine tikla
        OK e tikla
        home page logine tikla
        LOGIN PAGE DEYIZ
        kullanici adini gir(excelden al)
        kullanici sifresini git(excelden al)
        login page login buttonuna tikla

--------------------------------------4. GIRIS--------------------------------------
        HOME PAGE DEYIZ
        kullanici ID ye tikla
        Logout linkine tikla
        OK e tikla
        home page logine tikla
        LOGIN PAGE DEYIZ
        kullanici adini gir(excelden al)
        kullanici sifresini git(excelden al)
        login page login buttonuna tikla
     */



    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    //    Bu metot login sayfasina gitmek icin kullanililacak
    ExcelUtils excelUtils;
    List<Map<String, String>> excelDatalari;

    @Test
    public void customerLogin() throws IOException {
        String path = ".\\src\\test\\java\\resource\\mysmoketestdata.xlsx";

        String sayfa = "customer_info";//sheet name

        excelUtils = new ExcelUtils(path, sayfa);

        excelDatalari = excelUtils.getDataList();

        // Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        //        home page logine tikla
        for (Map<String, String> w : excelDatalari) {
            /*
        HOME PAGE DEYIZ
        home page logine tikla
        LOGIN PAGE DEYIZ
        kullanici adini gir(excelden al)
        kullanici sifresini git(excelden al)
        login page login buttonuna tikla
        user id ==> is display
        screenshot
        user id ==> click
        Log out
        ok
        screenshot
             */          //Sayfaya git
            Driver.getDriver().get(ConfigReader.getProperty("app_url"));//HOME SAYFASINA

            blueRentalHomePage = new BlueRentalHomePage();

            blueRentalLoginPage = new BlueRentalLoginPage();

            blueRentalHomePage.loginLink.click();

            ReusableMethods.waitFor(3);// 1 saniye bekle

            blueRentalLoginPage.emailBox.sendKeys(w.get("username"));

            ReusableMethods.waitFor(3);

            blueRentalLoginPage.passwordBox.sendKeys(w.get("password"));

            ReusableMethods.waitFor(1);

            blueRentalLoginPage.loginButton.click();
            //            GIRIS YAPILDI

            ReusableMethods.waitFor(3);

            ReusableMethods.verifyElementDisplayed(blueRentalHomePage.userID);//ASSERTION

            ReusableMethods.waitFor(3);

            ReusableMethods.getScreenshot();

            ReusableMethods.waitFor(1);

            blueRentalHomePage.userID.click();

            ReusableMethods.waitFor(1);

            blueRentalHomePage.logOutLink.click();

            ReusableMethods.waitFor(1);

            blueRentalHomePage.OK.click();

            //giris isleminin basarili oldugunu gostermek ıcın Assertion yaptık

            //ReusableMethods.verifyElementDisplayed(blueRentalHomePage.userID);

            ReusableMethods.waitFor(1);

            //Her giristen sonra ekran goruntusu aldık

            ReusableMethods.getScreenshot();
        }
    }

}
