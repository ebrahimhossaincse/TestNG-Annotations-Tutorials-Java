package ebrahim.hossain.sqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AfterSuiteExample {
	
	protected static String url = "https://www.testingtherapy.com/";
	WebDriver driver;
	
	@Test
	public void openUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	@AfterSuite
	public void closeChromeBrowser() {
		System.out.println("After Suite: This will run after all tests in the suite.");
		driver.quit();
	}
}
