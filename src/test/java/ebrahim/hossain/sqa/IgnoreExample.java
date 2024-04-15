package ebrahim.hossain.sqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IgnoreExample {

	protected static String url = "https://www.testingtherapy.com/";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Ignore
	public void firstTest() throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
	}

	@Test
	public void secondTest() throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}
}
