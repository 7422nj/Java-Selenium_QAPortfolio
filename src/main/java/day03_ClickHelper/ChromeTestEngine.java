package day03_ClickHelper;

public class ChromeTestEngine implements BrowserEngine {
    @Override
    public void startBrowser() {
        System.out.println("Starting GeckoDriver and opening Chrome browser...");
    }

    @Override
    public void stopBrowser() {
        System.out.println("Closing Chrome instance.");
    }

}

