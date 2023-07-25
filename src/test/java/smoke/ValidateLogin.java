package smoke;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateLogin extends BaseTest {
	
	@Test
	public void validateLoginTest() throws InterruptedException
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.openBrowser();
		
		app.type("usernameTextBox", "reyaz0607");
		
		Thread.sleep(3000);
		
		app.type("passwordTextBox", "reyaz123");
		
		Thread.sleep(3000);
		
		app.click("loginButton");
		
		Thread.sleep(3000);
		
	}

}
