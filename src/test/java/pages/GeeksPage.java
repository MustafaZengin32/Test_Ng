package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GeeksPage {

    //    Page Objelerini bu sinifda buluruz
    //    1. constructor
    public GeeksPage(){

    //        PageFactory seleniumdan gelen ve bu sayfa elementlerini baslangic degeri vermek etmek icin kullanilir
    //        Bu sekilde Sayfa objeleri cagrildiginda null pointer exception alinmaz

        PageFactory.initElements(Driver.getDriver(),this);

    }


    //    PAGE OBJELERINI OLUSTUR
    //    GELENEKSEL  : public WebElement username = Driver.getDriver().findElement(By.name("username"));

    //FinBy () icine Webelement in path ini yazar xpath , id ="....." seklinde

    @FindBy(id="luser")
    public WebElement username;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement password;

    @FindBy(xpath ="//button[text()='Sign In']")
    public WebElement loginBotton;

    @FindBy(xpath ="//a[text()='Forgot Password']")
    public WebElement forgotPassword;

    @FindBy(xpath ="//p[text()='Please enter your email address or userHandle.']")
    public WebElement yazi;








}
