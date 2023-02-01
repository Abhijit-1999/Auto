package OrangeTestscript;

import OrangeBase.Base;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1 extends Base {
	@Test
	public void m1()
	{
		d.findElement(By.className("oxd-main-menu")).click();
		d.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[3]")).click();
	}
}
