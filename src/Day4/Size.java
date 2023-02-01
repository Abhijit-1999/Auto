package Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Size {
	@Test
	public void m(){
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.actitime.com/login.do");
		d.manage().window().maximize();
		
//		Options op=d.manage();
//		Window win=op.window();
		
	//	win.setPosition(p);
//		Point p=new Point(122,344);
//		d.manage().window().setPosition(p);
//		
//		Dimension d1=new Dimension(200,988);
//		d.manage().window().setSize(d1);
	
		WebElement name=d.findElement(By.name("username"));
		Point loc=name.getLocation();
		System.out.println(loc);
		
		Dimension size=name.getSize();
		System.out.println(size);
		Rectangle re=name.getRect();
		System.out.println(re.height);
		
		
		d.manage().window().maximize();
		d.manage().window().setPosition(loc);
		
	}
}


















