package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    //Locators
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

    public void login(){
        provideEmail("evgeniia.shitikova@testpro.io");
        providePassword("TridY6F2");
        clickSubmit();
    }
}
