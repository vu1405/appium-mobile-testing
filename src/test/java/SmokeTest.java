
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URI;
import java.time.Duration;

public class SmokeTest {

    @Test
    public void testOpenSwagLabs() throws Exception {
        AndroidDriver driver = null;

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("appium:automationName", "UiAutomator2");
            caps.setCapability("appium:deviceName", "emulator-5554");
            caps.setCapability("appium:appPackage", "com.swaglabsmobileapp");
            caps.setCapability("appium:appActivity", ".SplashActivity");

            driver = new AndroidDriver(
                    URI.create("http://127.0.0.1:4723").toURL(), caps);

            driver.manage().timeouts()
                    .implicitlyWait(Duration.ofSeconds(5));

            WebElement username = driver.findElement(
                    AppiumBy.accessibilityId("test-Username"));

            Assert.assertTrue(
                    username.isDisplayed(),
                    "Khong hien thi o Username tren man hinh dang nhap");

            System.out.println(
                    "SMOKE TEST PASSED: Da mo Swag Labs va thay o Username");

        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
