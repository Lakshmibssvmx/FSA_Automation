package org.ge.app.mobile_automation;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.ge.svmxlib.GenericLib;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class AppTest 
{
	public AndroidDriver driver = null;	
	@Test
   public void toTest()
   {
		 String sAppPath = GenericLib.sResources+"\\"+GenericLib.getCongigValue(GenericLib.sConfigFile, "APKNAME")+".apk";
		 File app = new File(sAppPath);
	   try {
		   DesiredCapabilities capabilities = new DesiredCapabilities();
		   capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		   capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		   capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "bb45d03c");
		   capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
		   capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		   capabilities.setCapability("appPackage", "com.servicemaxinc.svmxfieldserviceapp");
		   capabilities.setCapability("appActivity", "com.servicemaxinc.svmxfieldserviceapp.ServiceMaxMobileAndroid");
		   URL url=new URL("http://127.0.0.1:4723/wd/hub");
		   driver = new AndroidDriver(url,capabilities);
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   Thread.sleep(20000);
		   driver.findElementById("svmx_splash_signin").click();
		  
		   driver.findElementById("com.servicemaxinc.svmxfieldserviceapp:id/menu_host").click();
		   driver.findElementById("com.servicemaxinc.svmxfieldserviceapp:id/radio_sandbox").click();
		   
		  //driver..tap(1,350, 150, 1000);
		   driver.findElementById("username").sendKeys("vinod.tharavath@ge.com");
		   driver.findElementById("password").sendKeys("svmx1234");
		   driver.findElementById("Log In to Sandbox").click();
		   
		   
			   
	   }catch(Exception e){
           e.printStackTrace();
       } finally {
       }
   }
}
