package ebrahim.hossain.sqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IgnoreExample {

	protected static String url = "https://www.testingtherapy.com/";
	WebDriver driver;

	@BeforeMethod
	public void startChromeBrowser() {
		System.out.println("Before Method: This will run before each test method.");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void firstTest() throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void secondTest() throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}
}
