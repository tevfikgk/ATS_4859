package com.ats.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ats.testbase.BaseClass;
import com.ats.utils.CommonMethods;

public class AccountManagementPage extends CommonMethods{
	
	
	@FindBy(xpath="//div[@data-test-id='user-menu']")
	public WebElement userMenu;
	
	@FindBy(xpath="//span[@data-test-id='manage-account']")
	public WebElement manageAccount;
	
	@FindBy(xpath="//div[@data-test-selector='profile-hover-info']")
	public WebElement uploadPhoto;
	
	@FindBy(xpath="//p[@class='sc-izvnbC ffnqLW']/following-sibling::button")
	public WebElement uploadPhoto2;
	
	
	@FindBy(xpath="//div[@data-test-selector='field-edit-full-name']")
	public WebElement fullName;
	
	@FindBy(xpath="//div[@data-test-selector='field-edit-public-name']")
	public WebElement publicName;
	
	@FindBy(xpath="//div[@data-test-selector='field-edit-job-title']")
	public WebElement jobTitle;
	
	@FindBy(xpath="//div[@data-test-selector='field-edit-department']")
	public WebElement department;
	
	@FindBy(xpath="//div[@data-test-selector='field-edit-organization']")
	public WebElement organization;
	
	@FindBy(xpath="//div[@data-test-selector='field-edit-based-in']")
	public WebElement basedIn;
	
	@FindBy(xpath="//div[@data-test-selector='field-edit-local-time']")
	public WebElement localTime;
	
	@FindBy(xpath="//div[@data-test-selector='field-edit-email-address']")
	public WebElement email;
	
	
	
	
	
	
	

	//div[@data-test-selector='user-menu-trigger']
	public AccountManagementPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
