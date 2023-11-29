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

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.provideEmail("evgeniia.shitikova@testpro.io")
                .providePassword("TridY6F2")
                .clickSubmitBtn();
//        WebElement avatar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[class='avatar']")));
//        Assert.assertTrue(loginPage.getRegistrationLink().isDisplayed());
        Assert.assertTrue(homePage.getUserAvatar());
    }
    @Test
    public void loginInvalidCredentials(){
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.provideEmail("")
                .providePassword("TridY6F2")
                .clickSubmitBtn();
        Assert.assertTrue(loginPage.getRegistrationLink().isDisplayed());
    }

//    @Test
//    public void loginValidEmailPasswordTest(){
//        LoginPage loginPage = new LoginPage(driver);
//        HomePage homePage = new HomePage(driver);
//        loginPage.provideEmail("evgeniia.shitikova@testpro.io");
//        loginPage.providePassword("TridY6F2");
//        loginPage.clickSubmitBtn();
//        Assert.assertTrue(homePage.getUserAvatar().isDisplayed());
//    }

//    @Test
//    public void loginValidEmailPasswordTestByPageFactory(){
//        LoginPage loginPage = new LoginPage(driver);
//        HomePage homePage = new HomePage(driver);
//
//        loginPage.provideEmailToLogin("evgeniia.shitikova@testpro.io")
//                .providePasswordToLogin("TridY6F2")
//                .clickSubmitBtnLogin();
//
//        Assert.assertTrue(homePage.getUserAvatar().isDisplayed());
//    }
//
//    @Test
//    public void loginEmptyEmailPassword() {
//
////      Added ChromeOptions argument below to fix websocket error
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        String url = "https://testpro.io/";
//        driver.get(url);
//        Assert.assertEquals(driver.getCurrentUrl(), url);
//        driver.quit();
//    }

    public void waitForAnElementToBeVisible(String cssLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
    }
}
