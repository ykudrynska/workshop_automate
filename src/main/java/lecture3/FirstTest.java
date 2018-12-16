package lecture3;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;

public class FirstTest {

    public static AndroidDriver<MobileElement> driver;
    private static AppiumDriverLocalService service;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        service = AppiumDriverLocalService.buildDefaultService();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion","7.0");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("applicationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "io.appium.android.apis");
        capabilities.setCapability("appActivity", ".ApiDemos");
        File appFile = new File("/Users/ykudrynska/GitHub/workshop_automate/app/ApiDemos-debug.apk");
        capabilities.setCapability("app", appFile.getAbsolutePath());
        driver = new AndroidDriver<MobileElement>(service.getUrl(), capabilities);
        Thread.sleep(10000);




    }
}
