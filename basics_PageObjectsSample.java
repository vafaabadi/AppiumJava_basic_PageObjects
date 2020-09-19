package PageObjects;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;




public class basics_PageObjectsSample extends basePageObjectsSample {
	
	
public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath, id, classname, androidUIautomator <<<<<<------- recommended elements to use for mobile automation
		// API Demos: Preference
		
		//referencing class HomePage.java
		HomePage HP = new HomePage(driver);
		HP.Preferences.click();
		PreferencesPage PP = new PreferencesPage(driver);
		PP.Dependencies.click();
		PreferencesDependencies PD = new PreferencesDependencies(driver);
		PD.WiFi.click();
		PD.WiFi.isSelected();									//to confirm Wifi is selected
		PD.WiFiSettings.click();			//XPath by index
		PD.WiFiName.sendKeys("Mobile Automation");
		PD.WiFiOK.get(1).click();   //picked by class name both buttons and used get to pick 2nd button and click on it
		
		
		
	}
	
	

}
