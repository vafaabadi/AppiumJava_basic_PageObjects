package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class PreferencesDependencies {

	//define Constructor
	public PreferencesDependencies(AndroidDriver driver) 
	{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(id="android:id/checkbox")
	public WebElement WiFi;
	
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement WiFiSettings;
	
	@AndroidFindBy(className="android.widget.EditText")
	public WebElement WiFiName;
	
	@AndroidFindBy(className="android.widget.Button")
	public List<WebElement> WiFiOK;
	
	
	
	
}
