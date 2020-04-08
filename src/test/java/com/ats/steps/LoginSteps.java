package com.ats.steps;

import com.ats.pages.LoginPage;
import com.ats.testbase.BaseClass;
import com.ats.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {
	LoginPage login;

	@Given("I open browser and navigate to Attlasian web page.")
	public void i_open_browser_and_navigate_to_Attlasian_web_page() {
		BaseClass.setUp();
	}

	@When("I enter  valid email and password")
	public void i_enter_valid_email_and_password() {
		login =  new LoginPage();
		jsClick(login.login);
		login.userEmail.sendKeys("tevfikgk38@gmail.com");
		login.loginSubmit1.click();
		
		
	}

	@When("click the login button")
	public void click_the_login_button() {
		login.password.sendKeys("tevfikGOK1973");
		login.loginSubmit2.click();
	}

	@Then("I successfully login.")
	public void i_successfully_login() {
		Boolean userEnabled = login.userMenu.isDisplayed();
		System.out.println(userEnabled);
	}

}
