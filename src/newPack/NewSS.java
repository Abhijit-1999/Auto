package newPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSS {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.get("https://www.amazon.in/");
		web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		web.manage().window().fullscreen();
		File src=web.findElement(By.id("gw-card-layout")).getScreenshotAs(OutputType.FILE);
		File trg=new File("./SS/newFull.png");
		FileUtils.copyFile(src, trg);
		
		web.close();
		
	}

}
