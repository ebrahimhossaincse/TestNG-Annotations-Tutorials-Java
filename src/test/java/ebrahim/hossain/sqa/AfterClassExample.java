package ebrahim.hossain.sqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AfterClassExample {
	
	protected static String url = "https://www.testingtherapy.com/";
	WebDriver driver;
	
	@Test
	public void openUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	@AfterClass
	public void closeChromeBrowser() {
        System.out.println("After Class: This will run after all test methods in this class.");
		driver.quit();
	}
}
