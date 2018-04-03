package org.ge.svmxlib;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseLib {
	{
		System.setProperty("KIRWA.reporter.config",	GenericLib.sResources+"\\KIRWA.properties");

	}
	public AndroidDriver driver = null;	
	DesiredCapabilities capabilities = null;
	String sAppPath = null;
	File app = null;
	@BeforeSuite
	public void startServer()
	{
		
	}
	
	@BeforeTest
	public void setAPP() throws Exception
	{
	try { 
		   sAppPath = GenericLib.sResources+"\\"+GenericLib.getCongigValue(GenericLib.sConfigFile, "APKNAME")+".apk";
		   app = new File(sAppPath);
		   capabilities = new DesiredCapabilities();
		   capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		   capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		   capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "bb45d03c");
		   capabilities.setCapability("noReset", true);
		   //capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		   capabilities.setCapability("appPackage", "com.servicemaxinc.svmxfieldserviceapp");
		   capabilities.setCapability("appActivity", "com.servicemaxinc.svmxfieldserviceapp.ServiceMaxMobileAndroid");
		   URL url=new URL("http://127.0.0.1:4723/wd/hub");
		   driver = new AndroidDriver(url,capabilities);
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   Thread.sleep(20000);
		   NXGReports.setWebDriver(driver);
		   NXGReports.addStep("App is launched successfully", LogAs.PASSED, null);
		  // driver.closeApp();
			
	} catch (Exception e) {
		NXGReports.addStep("Failed to LAUNCH the App", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}   
	}   
	
	
	
	
}
