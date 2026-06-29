package day04_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_TestSuite {
    private WebDriver driver;
    private LoginPage loginPage;
    private SecurePage securePage; // Declare our new page object

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        loginPage = new LoginPage(driver);
        securePage = new SecurePage(driver); // Instantiate the secure page
    }

    @Test(priority = 1)
    public void testSuccessfulLoginAndLogout() {
        // Log in
        loginPage.login("tomsmith", "SuperSecretPassword!");

        // Assert we reached the dashboard by checking the banner text
        String alertText = securePage.getAlertText();
        Assert.assertTrue(alertText.contains("You logged into a secure area!"),
                "Success banner text mismatch! Found: " + alertText);

        // Log out
        securePage.clickLogout();

        // Assert we are safely back on the login page
        String logoutAlertText = loginPage.getErrorMessage();
        Assert.assertTrue(logoutAlertText.contains("You logged out of the secure area!"),
                "Logout banner text mismatch! Found: " + logoutAlertText);
    }

    @Test(priority = 2)
    public void testInvalidLoginFields() {
        // Attempt login with incorrect credentials
        loginPage.login("invalidUser", "wrongPassword!");

        // Assert that the red error banner appears and contains correct text
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("Your username is invalid!"),
                "Error banner text mismatch! Found: " + errorMessage);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}