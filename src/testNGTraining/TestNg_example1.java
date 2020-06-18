package testNGTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg_example1 {
	WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		 driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	}
	
	@Test
public void openBing() {
		
		driver.get("http://www.bing.com/");
		driver.manage().window().maximize();
	}
	
	@Test
public void openYahoo() {
		
		driver.get("http://www.yahoo.com/");
		driver.manage().window().maximize();
}
	
	@Test
public void openGoogle() {
		
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
}
}
