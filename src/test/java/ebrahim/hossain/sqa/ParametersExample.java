package ebrahim.hossain.sqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersExample {


    WebDriver driver;

    @BeforeMethod
    public void startChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Parameters("url")
    @Test
    public void firstTest(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);
        System.out.println("First Test: " + driver.getTitle());
    }

    @Parameters("url")
    @Test
    public void secondTest(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);
        System.out.println("Second Test: " + driver.getTitle());
    }
}
