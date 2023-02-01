package Day1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	WebDriver driver;
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public void url()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}
	public String gettitle()
	{
		String name1=driver.getTitle();
		//System.out.println(name1);
		return name1;
		
		
	}
	public void close() {
		driver.close();
	}
	
	
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.launchbrowser();
		d.url();
		
		String name=d.gettitle();
		System.out.println(name);

		
		d.close();
		
	
		
	}
}
