package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


//Preferences page objects listed here

public class PreferencesPage {
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement Dependencies;
	//define Constructor
	public PreferencesPage(AndroidDriver driver) 
	{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

		
		
}
