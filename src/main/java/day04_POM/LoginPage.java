package day04_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    // 1. Private Locators (Declared at the CLASS LEVEL, not inside a method)
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    @FindBy(id = "flash")
    private WebElement errorFlashAlert;

    // 2. Constructor passing the driver to the parent BasePage
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // 3. Public Action Methods
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    // Combined action for convenience
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    // Custom debug flow method (Fixed variables to use the actual WebElements)
    public void loginFlow(String username) {
        System.out.println("Entering text into field: " + username);
        enterUsername(username);
        System.out.println("Clicking element: " + loginButton.toString());
        clickLogin();
    }
    // Grab the error text
    public String getErrorMessage() {
        waitForVisibility(errorFlashAlert);
        return errorFlashAlert.getText();
    }
}