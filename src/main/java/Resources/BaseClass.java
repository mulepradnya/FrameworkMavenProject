package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class BaseClass {
	
	public WebDriver driver;
	
	public void initializeBrowser () throws IOException {
		
		//This is to access file
		//C:\\Users\\Owner\\eclipse-workspace\\MavenProject
		FileInputStream fis = new FileInputStream (System.getProperty("User.dir")+"\\src\\main\\java\\Resources\\Data.properties");
		
		//Read the file data
		Properties prop = new Properties ();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver ();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver ();
		}
		else {
			System.out.println("Please select corret browser to run test cases");
		}

		
	}
	
	public Select selectdropdown (WebElement element) {
		Select s1 = new Select (element);
		return s1;
	}
	
	@BeforeMethod
	public void openApplication () throws IOException {
		initializeBrowser ();		
		driver.get("https://login.salesforce.com/?locale=in");		
	}
	
	@AfterMethod
	public void CloseApplication () throws IOException {
		driver.close();		
	}
	
	
}
