import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Homework17 extends BaseTest {
//    @Test
//    public void addSongToPlaylist() throws InterruptedException{
//
//        String expectedSongAddedMessage = "Added 1 song into \"MyPlaylist.\"";
//
//        navigateToPage();
//        provideEmail("evgeniia.shitikova@testpro.io");
//        providePassword("TridY6F2");
//        clickSubmit();
//        Thread.sleep(2000);
//        searchSong("Episode2");
//        clickViewAll();
//        selectFirstSongResult();
//        clickAddTooButton();
//        choosePlayList();
//        Assert.assertEquals(getAddToPlaylistSuccessMsg(), expectedSongAddedMessage);
//    }
//
//    public void searchSong(String name) throws InterruptedException{
//        WebElement searchField = driver.findElement(By.cssSelector("[type='search']"));
//        searchField.sendKeys(name);
//        Thread.sleep(2000);
//    }
//    public void clickViewAll() throws InterruptedException{
//        WebElement viewAll = driver.findElement(By.xpath("//button[@data-test='view-all-songs-btn']"));
//        viewAll.click();
//        Thread.sleep(2000);
//    }
//    public void selectFirstSongResult() throws InterruptedException{
//        WebElement firstSong = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item']"));
//        firstSong.click();
//        Thread.sleep(2000);
//    }
//    public void clickAddTooButton() throws InterruptedException{
//        WebElement addTooButton = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//button[@data-test='add-to-btn']"));
//        addTooButton.click();
//        Thread.sleep(2000);
//    }
//    public void choosePlayList() throws InterruptedException {
//        WebElement playList = driver.findElement(By.xpath("//*[@id=\"songResultsWrapper\"]/header/div[3]/div/section[1]/ul/li[5]"));
//        playList.click();
//        Thread.sleep(2000);
//    }
//    public String getAddToPlaylistSuccessMsg(){
//        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
//        return notification.getText();
//    }
//    public void navigateToPage() {
//        driver.get(url);
//    }
//
//    public void navigateToLoginPage(String BaseURL){
//        getDriver().get(BaseURL);
//    }
//    protected void provideEmail(String email) {
//
//        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='email']")));
//        emailField.clear();
//        emailField.sendKeys(email);
//    }
//    protected void providePassword(String password) {
//        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='password']")));
//        passwordField.clear();
//        passwordField.sendKeys(password);
//    }
//    protected void clickSubmit() {
//        WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type='submit']")));
//        submit.click();
//    }
}
