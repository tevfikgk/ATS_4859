package com.ats.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ats.utils.CommonMethods;
import com.ats.testbase.BaseClass;

public class LoginPage extends CommonMethods{

@FindBy(id="gray_link")
public WebElement login;
	
@FindBy(id="username")
public WebElement userEmail;

@FindBy(id="login-submit")
public WebElement loginSubmit1;

@FindBy(id="password")
public WebElement password;

@FindBy(id="login-submit")
public WebElement loginSubmit2;

@FindBy(id="login-submit")
public WebElement userMenu;

public LoginPage() {
	PageFactory.initElements(BaseClass.driver, this);
}
}
