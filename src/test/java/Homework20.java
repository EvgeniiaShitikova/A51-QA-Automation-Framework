import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework20 extends BaseTest{

    @Test
    public void deletePlaylist(){
        String expectedPlayListDeletedMsg = "Deleted playlist \"My PlayList.\"";

        provideEmail("evgeniia.shitikova@testpro.io");
        providePassword("TridY6F2");
        clickSubmit();
        openPlayList();
        clickDeletePlayList();
        clickOkDeletePlayList();

        Assert.assertEquals(getPlayListDeletedMsg(), expectedPlayListDeletedMsg);
    }

    public void openPlayList() {
        WebElement playlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
        playlist.click();
    }
    public void clickDeletePlayList(){
        WebElement deletePlayList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-delete-playlist")));
        deletePlayList.click();
    }
    public void clickOkDeletePlayList(){
        WebElement okDeletePlayList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ok")));
        okDeletePlayList.click();
    }
    public String getPlayListDeletedMsg() {
        WebElement notificationMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return notificationMsg.getText();
    }
}
