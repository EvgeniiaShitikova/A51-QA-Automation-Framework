package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".avatar")
    private WebElement userAvatarIcon;
    // userAvatarIcon: Represents the user avatar element on the page.


    @FindBy(css = ".show.success")
    private WebElement notification;
    // notification: Represents the element on the page displaying a notification or message.

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }
// This is the constructor of the "HomePage" class that takes a WebDriver object as a parameter
// and invokes the constructor of the superclass (parent class) with this parameter.
// The constructor is used to initialize the object of the class when an instance is created.

    public boolean getUserAvatar() {
        return userAvatarIcon.isEnabled();
    }
// The "getUserAvatar" method returns a boolean value (true or false)
// depending on whether the "userAvatarIcon" element is enabled.
// If the element is enabled, the method returns true; otherwise, it returns false.

    public boolean notificationText() {
        findElement(notification);
        return notification.isDisplayed();
    }
// It uses the "findElement" method to locate the "notification" element.
// It returns a boolean value (true or false) depending on whether the "notification" element is displayed on the page.
// If the element is displayed, the method returns true; otherwise, it returns false.
}
