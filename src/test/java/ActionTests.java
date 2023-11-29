
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.AllSongsPage;
import Pages.HomePage;
import Pages.LoginPage;

public class ActionTests extends BaseTest {
    @Test
    public void playSong(){

        //Login
        provideEmail("evgeniia.shitikova@testpro.io");
        providePassword("TridY6F2");
        clickSubmit();
        chooseAllSongsList();
        contextClickFirstSong();
        choosePlayOption();
        //Assertion
        Assert.assertTrue(isSongPlaying());
    }
    @Test
    public void hoverOverPlayBtn() {
        //login
        provideEmail("evgeniia.shitikova@testpro.io");
        providePassword("TridY6F2");
        clickSubmit();
        Assert.assertTrue(hoverPlay().isDisplayed());
    }

    public void chooseAllSongsList(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li a.songs"))).click();
    }

    public void contextClickFirstSong(){
        WebElement firstSongElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".all-songs tr.song-item:nth-child(1)")));
        actions.contextClick(firstSongElement).perform();
    }

    public void choosePlayOption(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.playback"))).click();
    }

    public boolean isSongPlaying(){
        WebElement soundBarVisualizer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid= 'sound-bar-play']")));
        return soundBarVisualizer.isDisplayed();
    }

    public WebElement hoverPlay() {
        //WebElement play = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid='play-btn']")));
        WebElement play = driver.findElement(By.cssSelector("[data-testid='play-btn']"));
        actions.moveToElement(play).perform();
        return  wait.until(ExpectedConditions.visibilityOf(play));
    }
}
