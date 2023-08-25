package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import PageObjects.SignupPageObjects;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constant;

import org.openqa.selenium.support.ui.Select;

public class VerifySignUp extends BaseClass {
	
	@Test
	public void LoginPage () throws IOException {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	LoginPageObjects LOP = new LoginPageObjects (driver);
	
	LOP.ClickOntryforfree().click();
	
	SignupPageObjects signUp = new SignupPageObjects (driver);
	
	signUp.enterFirst().sendKeys(Constant.FirstName);
			
	signUp.enterLast().sendKeys(Constant.LastName);
	
	signUp.enterEmail().sendKeys(Constant.EmailId);
	
	signUp.clickJob().click();
	
	Select s = new Select (signUp.clickJob());
	s.selectByIndex(7);
	
	//selectdropdown(signUp.clickJob()).selectByIndex(7);
	
	CommonMethods.handleDropDown(signUp.clickJob(), 7);

	signUp.entercompany().sendKeys(Constant.EmailId);
	
	Select s1 = new Select (signUp.enterEmployee());
	s1.selectByIndex(4);
	
	//selectdropdown(signUp.enterEmployee()).selectByIndex(4);
	
	CommonMethods.handleDropDown(signUp.enterEmployee(), 4);
	
	signUp.enterPhone().sendKeys(Constant.Mobile);
		
	String ActualText1 = signUp.TextMessage().getText();
	String ExpectedText1 = "Start your free trial.";
	CommonMethods.handleAssertion(ActualText1, ExpectedText1);
	System.out.println("Text Message Assertion Passed");
	
	String ActualText = signUp.enterEmployee().getText();
	String ExpectedText = "Option1";
	CommonMethods.handleAssertion(ActualText, ExpectedText);
	
	}
	
}
