package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	WebDriver driver;
	
	By username = By.xpath("//input[@id='username']");
	
	By password = By.xpath("//input[@name='pw']");
	
	By loginButton = By.xpath("//input[@id='Login']");
	
	By tryforfree = By.xpath("//a[@id='signup_link']");
	
	By errorText = By.xpath("//div[@id='error']");
	
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement enterUsername () {		
		return driver.findElement(username);		
	}
	
	public WebElement enterPassword () {		
		return driver.findElement(password);
	}
	
	public WebElement ClickOnLoginButton () {	
		return driver.findElement(loginButton);	
	}
	
	public WebElement ClickOntryforfree () {
		return driver.findElement(tryforfree);
	}
	
	public WebElement verifyError () {
		return driver.findElement(errorText);
	}
	
}
