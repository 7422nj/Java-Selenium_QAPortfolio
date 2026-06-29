package day04_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurePage extends BasePage{

        // 1. Locate the green success flash message alert box
        @FindBy(id = "flash")
        private WebElement flashAlert;

        // 2. Locate the Logout button using a CSS selector anchor tag
        @FindBy(css = "a.button.secondary.radius")
        private WebElement logoutButton;

        public SecurePage(WebDriver driver) {
            super(driver);
        }

        // 3. Action: Get the text of the success banner to assert against
        public String getAlertText() {
            waitForVisibility(flashAlert); // Using our new explicit wait!
            return flashAlert.getText();
        }

        // 4. Action: Click logout
        public void clickLogout() {
            waitForVisibility(logoutButton);
            logoutButton.click();
        }

    }

