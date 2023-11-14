
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllSongsPage;
import pages.HomePage;
import pages.LoginPage;

public class ActionTests extends BaseTest {
    @Test
    public void playSong() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        AllSongsPage songsPage = new AllSongsPage(driver);
        //Login
        loginPage.provideEmail("evgeniia.shitikova@testpro.io");
        loginPage.providePassword("TridY6F2");
        loginPage.clickSubmit();
        homePage.chooseAllSongsList();
        songsPage.contextClickFirstSong();
        songsPage.choosePlayOption();
        Thread.sleep(2000);
        //Assertion
        Assert.assertTrue(songsPage.isSongPlaying());
    }
    @Test
    public void hoverOverPlayBtn() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        //login
        loginPage.provideEmail("evgeniia.shitikova@testpro.io");
        loginPage.providePassword("TridY6F2");
        loginPage.clickSubmit();
        Thread.sleep(2000);
        Assert.assertTrue(homePage.hoverPlay().isDisplayed());
    }
}
