package day03_ClickHelper;

public class FirefoxTestEngine implements BrowserEngine{


    @Override
    public void startBrowser() {
        System.out.println("Starting GeckoDriver and opening Firefox...");
    }

    @Override
    public void stopBrowser() {
        System.out.println("Closing Firefox instance.");

    }
}
