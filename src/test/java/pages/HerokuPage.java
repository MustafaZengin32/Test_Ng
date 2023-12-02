package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuPage {

    public HerokuPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="username")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;

    @FindBy(id="flash")
    public WebElement successfullylogin;






}
