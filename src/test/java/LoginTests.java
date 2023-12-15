import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginSuccessTest()  throws InterruptedException {

        LoginPage loginPage = new LoginPage(getThreadLocal());
        HomePage homePage = new HomePage(getThreadLocal());

        loginPage.provideEmail("evgeniia.shitikova@testpro.io")
                .providePassword("TridY6F2")
                .clickSubmitBtn();

        Thread.sleep(2000);
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
    @Test
    public void loginInvalidPassword(){
        LoginPage loginPage = new LoginPage(getThreadLocal());

        loginPage.provideEmail("evgeniia.shitikova@testpro.io")
                .providePassword("")
                .clickSubmitBtn();
        Assert.assertTrue(loginPage.getRegistrationLink().isDisplayed());
    }
}