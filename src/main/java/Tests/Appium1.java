package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import PageObjects.LoginScreen;
import PageObjects.MainScreen;
import PageObjects.MakePayment;
public class Appium1 {
	  public AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");

		capabilities.setCapability("deviceName","emulator-5554");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");



	   
	    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		MobileElement one =driver.findElement(By.id("com.android.calculator2:id/digit_1"));
		MobileElement plus =driver.findElement(By.id("com.android.calculator2:id/op_add"));
		MobileElement three =driver.findElement(By.id("com.android.calculator2:id/digit_3"));

		one.click();
		plus.click();
		three.click();

	}

	@Test
	public void testCal() throws Exception {
		LoginScreen logSc = new LoginScreen(driver);
		logSc.setUserName("company");
		logSc.setPassword("company");
		logSc.clickLogin();
		
		MainScreen mainPage = new MainScreen(driver);
		mainPage.clickPaymentButton();
		
		MakePayment mkPayment = new MakePayment(driver);
		mkPayment.makePayment("91000002", "Sandeep", "India", "0.5");
	}

	@AfterClass
	public void teardown(){
		//close the app
		driver.quit();
	}
	}
	


