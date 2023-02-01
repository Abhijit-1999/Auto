package newPack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SsofAmazon {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();

	d.get("https://www.amazon.in/");
	TakesScreenshot ts=(TakesScreenshot)d;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File("./SS/Amazon.jpg");
	FileUtils.copyFile(src, trg);
	d.close();
	
}
}
