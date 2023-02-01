package newPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		web.get("https://demo.actitime.com/login.do");
		web.manage().window().maximize();
		web.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		web.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
		web.findElement(By.xpath("//ul[@id='popup_menu_items_content']/li[7]")).click();
		web.findElement(By.className("i")).click();
		WebElement wb=web.findElement(By.xpath("//table[@class='leftAligned']/tbody/tr[1]/td"));
		String name=wb.getText();
		System.out.println(name);
		
		web.close();
		
		
	}
}
