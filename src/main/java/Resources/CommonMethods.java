package Resources;

import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;

public class CommonMethods {
	
	public static void handleDropDown (WebElement element, int index) {
		
		Select select = new Select  (element);
		select.selectByIndex(index);		
	}
	
	public static void handleAssertion (String ActualText, String ExpectedText) {
		
		//Soft Assert
		SoftAssert assertion = new SoftAssert ();
		assertion.assertEquals(ActualText, ExpectedText);
		assertion.assertAll();
		
		//Hard Assert
		//assert.assertEquals(ActualText, ExpectedText);
				
	}
	
	
	
	
	
	
	
	

}
