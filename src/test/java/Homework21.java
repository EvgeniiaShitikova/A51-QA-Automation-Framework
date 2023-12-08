import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest{
//
//    String newPlayListName = "Renamed PlayList";
//
//    @Test
//    public void renamePlaylist(){
//
//        String updatedPlayList = "Updated playlist \"Renamed PlayList.\"";
//
//        //Login
//        provideEmail("evgeniia.shitikova@testpro.io");
//        providePassword("TridY6F2");
//        clickSubmit();
//        //double click
//        doubleClickPlayList();
//        //enter new name for playList
//        enterNewPlayListName();
//        //Assert
//        Assert.assertEquals(getRenamePlayListMsg(), updatedPlayList);
//    }
//
//    public void doubleClickPlayList() {
//        WebElement playListElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
//        actions.doubleClick(playListElement).perform();
//    }
//    public void enterNewPlayListName(){
//        WebElement playListInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name = 'name']")));
//        playListInputField.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
//        playListInputField.sendKeys(newPlayListName);
//        playListInputField.sendKeys(Keys.ENTER);
//    }
//    public String getRenamePlayListMsg(){
//        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
//        return notification.getText();
//    }
//
}
