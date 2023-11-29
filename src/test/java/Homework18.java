import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Pages.HomePage;
import Pages.LoginPage;

public class Homework18 extends BaseTest{
    @Test
    public void playSong(){

        navigateToPage();
        provideEmail("evgeniia.shitikova@testpro.io");
        providePassword("TridY6F2");
        clickSubmit();
        clickPlay();
        Assert.assertTrue(isSongPlaying());
    }
    public void clickPlay(){
        WebElement playNextButton = driver.findElement(By.cssSelector("[data-testid='play-next-btn']"));
        WebElement playButton = driver.findElement(By.cssSelector("[data-testid='play-btn']"));

        playNextButton.click();
        playButton.click();
    }
    public boolean isSongPlaying(){
        WebElement soundBar = driver.findElement(By.cssSelector("[data-testid='sound-bar-play']"));
        return soundBar.isDisplayed();
    }
}
