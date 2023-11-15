package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }
    String txtFieldEmailCssLocator = "input[type='email']";

    //Locators using selenium page factory

    @FindBy(css = "[type='email']")
    WebElement emailTxtField;

    @FindBy(css = "[type='password']")
    WebElement passwordTxtField;

    @FindBy(css = "[type='submit']")
    WebElement submitLoginBtn;


    //Locators By
    private By emailField = By.cssSelector("input[type='email']");
    private By passwordField = By.cssSelector("input[type='password']");
    private By submitBtn = By.cssSelector("button[type='submit']");

    public void provideEmail(String email){
        findElement(emailField).sendKeys(email);
    }
    public void providePassword(String password){
        findElement(passwordField).sendKeys(password);
    }
    public void clickSubmit(){
        findElement(submitBtn).click();
    }


    //Helper Methods using Page Factory

    public LoginPage provideEmailToLogin(String email){
        emailTxtField.sendKeys(email);
        return this;
    }

    public LoginPage providePasswordToLogin(String password){
        passwordTxtField.sendKeys(password);
        return this;
    }

    public LoginPage clickSubmitBtnLogin(){
        submitLoginBtn.click();
        return this;
    }
}
