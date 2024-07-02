import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    void Setup(){
        System.setProperty("webdriver.gecko.driver",  "/usr/local/bin/");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.youtube.com/");
    }
}
