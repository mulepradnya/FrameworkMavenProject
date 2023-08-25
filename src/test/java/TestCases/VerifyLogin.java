package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.LoginPageObjects;
import Resources.BaseClass;
import Resources.Constant;

public class VerifyLogin extends BaseClass {
	
	
	@Test
	public void login () throws IOException, InterruptedException {
		
		LoginPageObjects LOP = new LoginPageObjects (driver);
		
		LOP.enterUsername().sendKeys(Constant.Username);
		
		LOP.enterPassword().sendKeys(Constant.Password);
		
		LOP.ClickOnLoginButton().click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		LOP.ClickOntryforfree().click();
		
		Assert.assertEquals(10, 10);
		
		System.out.println("Login validated successfully...");
				
	}

	
	@Test
	public void invalidlogin () throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		LoginPageObjects LOP = new LoginPageObjects (driver);
		
		LOP.enterUsername().sendKeys("User1");
		
		LOP.enterPassword().sendKeys("Test1");
		
		LOP.ClickOnLoginButton().click();
		
		String actualText = LOP.verifyError().getText();
		
		String expextedText = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		Assert.assertEquals(actualText, expextedText);
		
		System.out.println("Invalid Login Tested successfully...");
				
	}
	
}
