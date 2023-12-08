import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {

    @Test
    public void loginSuccessTest() {

        LoginPage loginPage = new LoginPage(getThreadLocal());
        HomePage homePage = new HomePage(getThreadLocal());

        loginPage.provideEmail("evgeniia.shitikova@testpro.io")
                .providePassword("TridY6F2")
                .clickSubmitBtn();
        Assert.assertTrue(homePage.getUserAvatar());
    }
    @Test
    public void loginInvalidCredentials(){
        LoginPage loginPage = new LoginPage(getThreadLocal());

        loginPage.provideEmail("")
                .providePassword("TridY6F2")
                .clickSubmitBtn();
        Assert.assertTrue(loginPage.getRegistrationLink().isDisplayed());
    }
}
