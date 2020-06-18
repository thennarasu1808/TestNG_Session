package testNGTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg_Sample {
	WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void openGoogle() {
		
				driver.get("http://www.google.com/");
	
	}
	
	@Test(priority=1)
	public void openGmail() {
		
		driver.get("http://www.gmail.com/");

	}

	
}
