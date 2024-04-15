package ebrahim.hossain.sqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FactoryExample {

	protected static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	private WebDriver driver;

	@BeforeClass
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
	}

	@Test(dataProvider = "loginData")
	public void testLogin(String username, String password) throws InterruptedException {
		WebElement usernameElement = driver.findElement(By.name("username"));
		WebElement passwordElement = driver.findElement(By.xpath("//input[@name='password']"));
		

		// Fill in the form
		usernameElement.sendKeys(username);
		passwordElement.sendKeys(password);

		// Submit the form
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();
		Thread.sleep(5000);

		// Check if login was successful
		WebElement successMessage = driver.findElement(By.xpath("//header[@class='oxd-topbar']/div[1]/div[1]/span/h6"));
		Assert.assertEquals(successMessage.getText(), "Dashboard");
	}

	@DataProvider(name = "loginData")
	public Object[][] loginData() {
		return new Object[][] { { "admin", "admin123" } };
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
