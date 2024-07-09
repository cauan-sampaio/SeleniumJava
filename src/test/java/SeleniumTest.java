import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.Message;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {
    @BeforeTest
    public void Setup() throws InterruptedException{
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +  "/src/test/resources/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.selenium.dev/selenium/web/web-form.html");
        String title = webDriver.getTitle();
        System.out.println(title);
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        WebElement textBox = webDriver.findElement(By.name("my-text"));
       
        WebElement submitButton = webDriver.findElement(By.cssSelector("button"));
        textBox.sendKeys("Selenium");
        Thread.sleep(5000);
        submitButton.click();
        //webDriver.quit();
    }
}
