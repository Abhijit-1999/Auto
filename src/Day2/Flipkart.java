package Day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://www.google.com/");
	d.manage().window().maximize();
	d.findElement(By.name("q")).sendKeys("iphone");
	Thread.sleep(10);
	//d.findElement(By.xpath("//button[text()='No thanks']")).click();
	List<WebElement> auto=d.findElements(By.xpath("//span[text()='Apple iPhone 13']/../../../../.."));
	
	for(WebElement one:auto)
	{
		System.out.println(one.getText());
	}
	
	d.close();
	}
}