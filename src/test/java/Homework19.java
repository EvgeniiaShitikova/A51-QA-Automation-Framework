import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest{
//
//    @Test
//    public void deletePlaylist() throws InterruptedException {
//        String expectedPlayListDeletedMsg = "Deleted playlist \"My PlayList.\"";
//
//        provideEmail("evgeniia.shitikova@testpro.io");
//        providePassword("TridY6F2");
//        clickSubmit();
//        openPlayList();
//        clickDeletePlayList();
//        clickOkDeletePlayList();
//
//        Assert.assertEquals(getPlayListDeletedMsg(), expectedPlayListDeletedMsg);
//    }
//
//    public void openPlayList() {
//        WebElement playlist = driver.findElement(By.cssSelector(".playlist:nth-child(3)"));
//        playlist.click();
//    }
//    public void clickDeletePlayList() throws InterruptedException{
//        WebElement deletePlayList = driver.findElement(By.cssSelector(".btn-delete-playlist"));
//        deletePlayList.click();
//        Thread.sleep(2000);
//    }
//    public void clickOkDeletePlayList() throws InterruptedException{
//        WebElement okDeletePlayList = driver.findElement(By.cssSelector(".ok"));
//        okDeletePlayList.click();
//        Thread.sleep(2000);
//    }
//    public String getPlayListDeletedMsg() {
//        WebElement notificationMsg = driver.findElement(By.cssSelector("div.success.show"));
//        return notificationMsg.getText();
//    }
}