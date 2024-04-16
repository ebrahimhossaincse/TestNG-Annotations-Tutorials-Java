package ebrahim.hossain.sqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeGroupsExample {
    WebDriver driver;

    @BeforeGroups(groups = {"webTests"})
    public void startChromeBrowser() {
        System.out.println("Before Groups: This will run before any test in the 'webTests' group.");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(groups = "webTests")
    public void firstTest() throws InterruptedException {
        driver.get("https://www.testingtherapy.com/");
        Thread.sleep(3000);
    }

    @Test(groups = "webTests")
    public void secondTest() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Thread.sleep(3000);
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
