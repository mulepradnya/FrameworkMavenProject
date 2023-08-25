package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignupPageObjects {
	
	WebDriver driver ;
	
	By FirstName = By.xpath("//input[contains(@name, 'UserFirstName')]");
	
	By LastName = By.xpath("//input[contains(@name, 'UserLastName')]");
	
	By Email = By.xpath("//input[contains(@name, 'UserEmail')]");
	
	By jobclick = By.xpath("//select[contains(@name, 'UserTitle')]");
	
	By companyName = By.xpath("//input[contains(@name, 'CompanyName')]");
	
	By employee = By.xpath("//select[contains(@name, 'CompanyEmployees')]");
	
	By textMessage = By.xpath("//*[@id='start-your-free-trial']/span");
	
	By Phone = By.xpath("//input[contains(@name, 'UserPhone')]");
	
	public SignupPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement enterFirst () {
		return driver.findElement(FirstName);	
	}
	
	public WebElement enterLast () {
		return driver.findElement(LastName);	
	}
	
	public WebElement enterEmail () {
		return driver.findElement(Email);	
	}
	
	public WebElement clickJob () {
		return driver.findElement(jobclick);	
	}
		
	public WebElement entercompany () {
		return driver.findElement(companyName);	
	}
	
	public WebElement enterEmployee () {
		return driver.findElement(employee);
	}
	
	public WebElement TextMessage () {
		return driver.findElement(textMessage);
	}
	
	public WebElement enterPhone () {
		return driver.findElement(Phone);	
	}
	

}
