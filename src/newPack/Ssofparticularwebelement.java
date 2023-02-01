package newPack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ssofparticularwebelement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		WebElement wb=d.findElement(By.xpath("//h2[contains(text(),'Pay your credit')]"));
		File scr=wb.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Ss/pricular.png");
		FileUtils.copyFile(scr, trg);
		
		d.close();
		
		
	}

}
