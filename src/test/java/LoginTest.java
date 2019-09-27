import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp(){
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		
	}

	@Test
	public void doLogin() {
		
		driver.get("https://gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
}
