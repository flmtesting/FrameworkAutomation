package regression;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLogin extends BaseTest {
	
	@Test
	public void validateLoginTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0607");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(3000);
	}

}
