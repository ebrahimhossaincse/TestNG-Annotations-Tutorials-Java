package ebrahim.hossain.sqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AfterMethodExample {

	protected static String firstUrl = "https://www.testingtherapy.com/";
	protected static String secondUrl = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
	
	WebDriver driver;

	@AfterMethod
	public void fetchTitle() {
		System.out.println("After Method: This will run after each test method.");
		System.out.println("Title: "+driver.getTitle());
		driver.close();
	}

	@Test
	public void firstTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(firstUrl);
		Thread.sleep(3000);
	}

	@Test
	public void secondTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(secondUrl);
		Thread.sleep(3000);
	}
}
