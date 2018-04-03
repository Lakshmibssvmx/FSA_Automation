package org.ge.svmxobjects;

import org.ge.svmxlib.GenericLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class LoginPO
{		AppiumDriver driver = null;
		public static String sParentWnd = null;
		public static String sDCWnd = null;
		public LoginPO(AppiumDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(id="com.servicemaxinc.svmxfieldserviceapp:id/menu_host")
		private WebElement eleMenuIcn;
		public WebElement getEleMenuIcn() 
		{
			return eleMenuIcn;
		}
		
		@FindBy(id="svmx_splash_signin")
		private WebElement eleSignInBtn;
		public WebElement getEleSignInBtn() 
		{
			return eleSignInBtn;
		}
		@FindBy(id="com.servicemaxinc.svmxfieldserviceapp:id/radio_sandbox")
		private WebElement eleSandBxRdBtn;
		public WebElement getEleSandBxRdBtn() 
		{
			return eleSandBxRdBtn;
		}
		@FindBy(id="username")
		private WebElement eleUsernameTxtFld;
		public WebElement getEleUsernameTxtFld() 
		{
			return eleUsernameTxtFld;
		}
		@FindBy(id="password")
		private WebElement elePasswordTxtFld;
		public WebElement getElePasswordTxtFld() 
		{
			return elePasswordTxtFld;
		}
		@FindBy(id="Log In to Sandbox")
		private WebElement eleLoginSandBxBtn;
		public WebElement getEleLoginSandBxBtn() 
		{
			return eleLoginSandBxBtn;
		}
		
		@FindBy(id="oaapprove")
		private WebElement eleAllowBtn;
		public WebElement getEleAllowBtn() 
		{
			return eleAllowBtn;
		}
		
		@FindBy(xpath="//android.view.View[@content-desc='Calendar']")
		private WebElement eleCalendarIcn;
		public WebElement getEleCalendarIcn() 
		{
			return eleCalendarIcn;
		}
		
		@FindBy(xpath="//android.view.View[@content-desc='Explore']")
		private WebElement eleExploreIcn;
		public WebElement getEleExploreIcn() 
		{
			return eleExploreIcn;
		}
		
		@FindBy(xpath="//android.view.View[@content-desc='AppiumSearch']")
		private WebElement eleAppiumSearchTxt;
		public WebElement getEleAppiumSearchTxt() 
		{
			return eleAppiumSearchTxt;
		}
		@FindBy(xpath="//android.widget.EditText[@text='Search']")
		private WebElement eleSearchTxtFld;
		public WebElement getEleSearchTxtFld() 
		{
			return eleSearchTxtFld;
		}
		
		@FindBy(xpath="//android.view.View[@content-desc='Search']")
		private WebElement eleSearchBtn;
		public WebElement getEleSearchBtn() 
		{
			return eleSearchBtn;
		}
		
		private WebElement eleWOInfoIcn;
		public WebElement getEleWOInfoIcn(String sWorkOrderID) 
		{
			eleWOInfoIcn=(MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc='"+sWorkOrderID+"']"));
			return eleWOInfoIcn;
		}
			
		@FindBy(id="ext-svmx-button-201")
		private WebElement eleOpenRecordBtn;
		public WebElement getEleOpenRecordBtn() 
		{
			return eleOpenRecordBtn;
		}
		
		@FindBy(xpath="//android.view.View[@content-desc='Actions']")
		private WebElement eleActionsBtn;
		public WebElement getEleActionsBtn() 
		{
			return eleActionsBtn;
		}
		
		@FindBy(xpath="//android.view.View[@content-desc='Reset filter']")
		private WebElement eleResetFilterBtn;
		public WebElement getEleResetFilterBtn() 
		{
			return eleResetFilterBtn;
		}
		
		@FindBy(xpath="//android.view.View[@content-desc='Edit Work Order']")
		private WebElement eleEditWOTxt;
		public WebElement getEleEditWOTxt() 
		{
			return eleEditWOTxt;
		}
		
		@FindBy(xpath="//android.view.View[@content-desc='Work Order Wizard']")
		private WebElement eleWOWizardTxt;
		public WebElement getEleWOWizardTxt() 
		{
			return eleWOWizardTxt;
		}
		@FindBy(xpath="//android.view.View[@content-desc='AppiumWizard']")
		private WebElement eleAppiumWizardTxt;
		public WebElement getEleAppiumWizardTxt() 
		{
			return eleAppiumWizardTxt;
		}
		
		@FindBy(xpath="//android.view.View[@content-desc='Custom URL']")
		private WebElement eleCustomURLTxt;
		public WebElement getEleCustomURLTxt() 
		{
			return eleCustomURLTxt;
		}
		
		//@FindBy(xpath="//android.view.View[@index='16']//[@content-desc='Appium_Edit_Work_Order']")
		@FindBy(xpath="//android.view.View[@index='16']")
		
		private WebElement eleAppiumEditWOLnk;
		public WebElement getEleAppiumEditWOLnk() 
		{
			return eleAppiumEditWOLnk;
		}
		
		@FindBy(xpath="//android.widget.Button[@resource-id='svmx_finalize']")
		private WebElement eleDoneBtn;
		public WebElement getEleDoneBtn() 
		{
			return eleDoneBtn;
		}
		
		@FindBy(xpath="//android.widget.EditText[@text='Field Service']")
		private WebElement eleOrderTypeLst;
		public WebElement getEleOrderTypeLst() 
		{
			return eleOrderTypeLst;
		}
		
		@FindBy(xpath="//android.view.View[@resource-id='ext-thumb-2']")
		private WebElement eleCustomerDownRdBtn;
		public WebElement getEleCustomerDownRdBtn() 
		{
			return eleCustomerDownRdBtn;
		}
		
		@FindBy(xpath="//android.widget.EditText[@text='Open']")
		private WebElement eleOrderStatusLst;
		public WebElement getEleOrderStatusLst() 
		{
			return eleOrderStatusLst;
		}
		
		@FindBy(xpath="//android.widget.EditText[@text='--None--']")
		private WebElement eleCountryLst;
		public WebElement getEleCountryLst() 
		{
			return eleCountryLst;
		}
		
		@FindBy(xpath="//android.view.View[@content-desc='Save']")
		private WebElement eleSaveBtn;
		public WebElement getEleSaveBtn() 
		{
			return eleSaveBtn;
		}
		
		@FindBy(xpath="//android.view.View[@content-desc='Add']")
		private WebElement eleAddBtn;
		public WebElement getEleAddBtn() 
		{
			return eleAddBtn;
		}
		
		@FindBy(xpath="//android.widget.CheckedTextView[@index='1']")
		private WebElement eleDepotRepairRdBtn;
		public WebElement getEleDepotRepairRdBtn() 
		{
			return eleDepotRepairRdBtn;
		}
		
		@FindBy(xpath="//android.widget.CheckedTextView[@index='6']")
		private WebElement eleOrderStatusRdBtn;
		public WebElement getEleOrderStatusRdBtn() 
		{
			return eleOrderStatusRdBtn;
		}
		
		@FindBy(xpath="//android.widget.CheckedTextView[@index='2']")
		private WebElement eleCountryRdBtn;
		public WebElement getEleCountryRdBtn() 
		{
			return eleCountryRdBtn;
		}
		
		@FindBy(xpath="//android.widget.EditText[@resource-id='ext-element-2998']")
		private WebElement eleBillingTypeLst;
		public WebElement getEleBillingTypeLst() 
		{
			return eleBillingTypeLst;
		}
		
		public void login() throws Exception
		{
			try{
			getEleSignInBtn().click();
			getEleMenuIcn().click();
			getEleSandBxRdBtn().click();
			new TouchAction(driver).tap(350, 150);
			getEleUsernameTxtFld().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "USERNAME"));
			getElePasswordTxtFld().sendKeys(GenericLib.getCongigValue(GenericLib.sConfigFile, "PASSWORD"));
			getEleLoginSandBxBtn().click();
			getEleAllowBtn().click();
			}catch(Exception e)
			{
				throw e;
			}
		}
		
		public boolean findWizard(WebElement eleWizard)
		{
		Boolean bEle = false;
		try{
			if(eleWizard.isDisplayed()) {
				eleWizard.click();
				System.out.println("Element is found");
				bEle = true;}
		}catch(Exception e) {
			bEle = false;
			System.out.println("Element not found");
		}
		System.out.println(bEle);
		return bEle;
		
		}
		
}
