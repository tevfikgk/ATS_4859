package com.ats.steps;

import com.ats.pages.AccountManagementPage;
import com.ats.utils.CommonMethods;

import cucumber.api.java.en.When;

public class AccountManagement extends CommonMethods {

	AccountManagementPage accountManage = new AccountManagementPage();

	@When("I navigate account page")
	public void i_navigate_account_page() throws InterruptedException {
		accountManage.userMenu.click();
		Thread.sleep(3000);
		accountManage.manageAccount.click();
	}

	@When("I upload photo")
	public void i_upload_photo() throws InterruptedException {
		//Thread.sleep(3000);
		//accountManage.uploadPhoto.click();
		//Thread.sleep(3000);
		//jsClick(accountManage.uploadPhoto2);
		// accountManage.uploadPhoto2.sendKeys("C:\\Users\\tevfi\\Desktop\\Git3\\tg.jpg");
	}

	@When("I confirm full name, public name, job title, department, organization, based in, local time")
	public void i_confirm_full_name_public_name_job_title_department_organization_based_in_local_time() {
		//accountManage.fullName.clear();
		accountManage.fullName.sendKeys("Tevfik");
		
	}

	@When("Validate that local time and email update is disable")
	public void validate_that_local_time_and_email_update_is_disable() {

	}

}
