package org.ge.svmxtests;

import org.ge.svmxlib.BaseLib;
import org.ge.svmxlib.GenericLib;
import org.ge.svmxobjects.LoginPO;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import io.appium.java_client.TouchAction;

public class SampleTest extends BaseLib
{
	LoginPO loginPo = null;
	String sTestCaseID=null;
	String sWorkOrderID=null;
	TouchAction touchAction=null;
	TouchAction tAction=null;
	TouchAction tAct=null;
	WebDriverWait wait=null;
	
	@BeforeClass
	public void initObjects()
	{
		loginPo= new LoginPO(driver) ;
	}
	
	@BeforeMethod
	public void launchingApp() throws Exception
	{
		try {
		//driver.launchApp();
		//loginPo.login();
		//Thread.sleep(600000);
		//Thread.sleep(GenericLib.iVHighSleep);
		
		wait = new WebDriverWait(driver, 30000);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Explore\"]")));
	    Thread.sleep(10000);
		Assert.assertTrue(loginPo.getEleCalendarIcn().isDisplayed(), "Failed to navigate to Calendar screen");
		}catch(Exception e)
		{
			NXGReports.addStep("@BeforeMethod: Failed to login and navigate to Calendar screen", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}

	//@AfterMethod
	public void closingApp()
	{
		driver.closeApp();
		
	}
	
	@Test(enabled=true)
	public void toEdit() throws Exception
	{
		sTestCaseID="RS_3807";
		sWorkOrderID="WO-00000900";//GenericLib.getExcelData(sTestCaseID, "WorkOrder"); 
		try {
		loginPo.getEleExploreIcn().click();
		loginPo.getEleAppiumSearchTxt().click();
		Thread.sleep(GenericLib.iHighSleep);
		try {
			loginPo.getEleResetFilterBtn().click();
		}catch(Exception e) {}
		loginPo.getEleSearchTxtFld().sendKeys(sWorkOrderID);
		loginPo.getEleSearchBtn().click();
		Thread.sleep(GenericLib.iHighSleep);
		Thread.sleep(GenericLib.iMedSleep);
		touchAction = new TouchAction(driver);
		touchAction.longPress(loginPo.getEleWOInfoIcn(sWorkOrderID)).release().perform();
		Thread.sleep(GenericLib.iMedSleep);
		Thread.sleep(GenericLib.iHighSleep);
		wait.until(ExpectedConditions.elementToBeClickable(loginPo.getEleActionsBtn()));
		loginPo.getEleActionsBtn().click();
		Thread.sleep(GenericLib.iMedSleep);
		
		int cnt=0;
		while(cnt<6)
		{
		tAction = new TouchAction(driver);
		tAction.longPress(500, 1135).moveTo(500, 140).release().perform();
		
		cnt++;
		}
		/*tAction.tap(76, 926).perform();
		Thread.sleep(6000);
		loginPo.getEleActionsBtn().click();
		Thread.sleep(GenericLib.iMedSleep);*/
		
		
		Thread.sleep(4000);
		Assert.assertTrue(loginPo.getEleAppiumEditWOLnk().isDisplayed(), "Appium Wizard is not dispalayed");
		System.out.println("Element is present");
		tAction.tap(500, 190).perform();
		
		Thread.sleep(30000);/*
		loginPo.getEleOrderTypeLst().click();
		Thread.sleep(5000);
		loginPo.getEleDepotRepairRdBtn().click();
		Thread.sleep(5000);
		loginPo.getEleOrderStatusLst().click();
		Thread.sleep(5000);
		loginPo.getEleOrderStatusRdBtn().click();
		Thread.sleep(5000);*/
		loginPo.getEleCountryLst().click();
		Thread.sleep(5000);
		loginPo.getEleCountryRdBtn().click();
		Thread.sleep(5000);
		
		loginPo.getEleCustomerDownRdBtn().click();
		loginPo.getEleAddBtn().click();
		
		Thread.sleep(5000);
		loginPo.getEleSaveBtn().click();
		
		//loginPo.getEleEditWOTxt().click();
		
		}catch(Exception e)
		{
			throw e;
		}
		   
	}
	
	@Test(enabled=false)
	public void to() throws Exception
	{
		sTestCaseID="RS_3807";
		sWorkOrderID="WO-00000900";//GenericLib.getExcelData(sTestCaseID, "WorkOrder"); 
		try {
		loginPo.getEleExploreIcn().click();
		loginPo.getEleAppiumSearchTxt().click();
		Thread.sleep(GenericLib.iHighSleep);
		try {
			loginPo.getEleResetFilterBtn().click();
		}catch(Exception e) {}
		loginPo.getEleSearchTxtFld().sendKeys(sWorkOrderID);
		loginPo.getEleSearchBtn().click();
		Thread.sleep(GenericLib.iHighSleep);
		Thread.sleep(GenericLib.iMedSleep);
		touchAction = new TouchAction(driver);
		touchAction.longPress(loginPo.getEleWOInfoIcn(sWorkOrderID)).release().perform();
		Thread.sleep(GenericLib.iMedSleep);
		Thread.sleep(GenericLib.iHighSleep);
		wait.until(ExpectedConditions.elementToBeClickable(loginPo.getEleActionsBtn()));
		loginPo.getEleActionsBtn().click();
		Thread.sleep(GenericLib.iMedSleep);
		
		int cnt=0;
		while(cnt<6)
		{
		tAction = new TouchAction(driver);
		tAction.longPress(500, 1135).moveTo(500, 140).release().perform();
		cnt++;
		}
		Thread.sleep(4000);
		Assert.assertTrue(loginPo.getEleAppiumWizardTxt().isDisplayed(), "Appium Wizard is not dispalayed");
		System.out.println("Element is present **************************");
		Thread.sleep(6000);
		try {
		 Point point = loginPo.getEleAppiumEditWOLnk().getLocation();
		 System.out.println(point);
		 
		 tAction = new TouchAction(driver);
		 tAction.tap(loginPo.getEleAppiumEditWOLnk(), 346, 1157).perform();
		//loginPo.getEleAppiumEditWOLnk().click();
				}catch(Exception e) {
			
		}
		Thread.sleep(30000);
		loginPo.getEleOrderTypeLst().click();
		Thread.sleep(5000);
		loginPo.getEleDepotRepairRdBtn().click();
		Thread.sleep(5000);
		loginPo.getEleOrderStatusLst().click();
		Thread.sleep(5000);
		loginPo.getEleOrderStatusRdBtn().click();
		Thread.sleep(5000);
		loginPo.getEleCountryLst().click();
		Thread.sleep(5000);
		loginPo.getEleCountryRdBtn().click();
		Thread.sleep(5000);
		//driver.getKeyboard().sendKeys(Keys.ENTER);
		
		loginPo.getEleCustomerDownRdBtn().click();
		
		//loginPo.getEleDepotRepairRdBtn().click();
		/*touchAction = new TouchAction(driver);
		touchAction.tap(loginPo.getEleDepotRepairRdBtn()).release().perform();
		*///loginPo.getEleDepotRepairRdBtn().click();
		Thread.sleep(5000);
		loginPo.getEleSaveBtn().click();
		
		//loginPo.getEleEditWOTxt().click();
		
		}catch(Exception e)
		{
			throw e;
		}
		   
	}
	
	
}
