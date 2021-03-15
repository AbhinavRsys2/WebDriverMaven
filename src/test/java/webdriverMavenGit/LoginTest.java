package webdriverMavenGit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setup(){
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void login()
	{
		driver.get("https://gmail.com");
		System.out.println("The title of page is -> "+driver.getTitle());
		System.out.println("code will now be pushed");
		System.out.println("code will now be pushed");
	}
}
