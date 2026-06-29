package day03_ClickHelper;

public class ClickHelper_TestSuite {

    public static void main(String[] args) {

        ClickHelper helper = new ClickHelper();

        helper.clickElement("Login Button");
        helper.clickElement("Dashboard Link",2);
        helper.clickElement("Tricky Checkbox",true);

        /////////////////////////////////////////////////////////////////////////////

        //BrowserEngine driver = new ChromeTestEngine();
        BrowserEngine driver = new FirefoxTestEngine();
        driver.startBrowser();
        driver.stopBrowser();
    }
}
