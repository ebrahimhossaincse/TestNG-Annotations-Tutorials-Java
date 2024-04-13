package ebrahim.hossain.sqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AfterTestExample {
	
	protected static String url = "https://www.testingtherapy.com/";
	WebDriver driver;
	
	@Test
	public void openUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	@AfterTest
	public void closeChromeBrowser() {
		driver.quit();
	}
}
