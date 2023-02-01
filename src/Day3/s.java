package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class s {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.google.com/");
		WebElement dd=d.findElement(By.cssSelector("input.gLFyf"));
		Actions a=new Actions(d);
		
		a.keyDown(Keys.SHIFT).sendKeys(dd,"selenium").perform();
		a.keyUp(Keys.SHIFT).perform();
		a.keyDown(Keys.CONTROL).sendKeys(dd,"A",Keys.BACK_SPACE).perform();
		a.keyUp(Keys.CONTROL).perform();
		a.keyDown(Keys.SHIFT).sendKeys(dd,"abhijit").perform();
	}

}
