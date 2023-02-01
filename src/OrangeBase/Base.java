package OrangeBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
	 public WebDriver d;
	 public Dataclass dc=new Dataclass();
	
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.manage().window().maximize();
	
	}
	@BeforeMethod
	public void login() throws IOException
	{
		d.get(dc.fromPropertiesfile("Url"));
		d.findElement(By.name("username")).sendKeys(dc.fromPropertiesfile("Username"));
		d.findElement(By.cssSelector("[type='password']")).sendKeys(dc.fromPropertiesfile("Pass"));
		d.findElement(By.cssSelector("[type='submit']")).click();
		dc.m1();
	}
	@AfterMethod
	public void logout()
	{
		d.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		d.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		d.close();
	}

}
