package ebrahim.hossain.sqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeTestExample {
	
	protected static String url = "https://www.testingtherapy.com/";
	WebDriver driver;

	@BeforeTest
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void openUrl() {
		driver.get(url);
		driver.close();
	}
}
