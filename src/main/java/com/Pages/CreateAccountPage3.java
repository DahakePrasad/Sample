package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountPage3 {

	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='newPassword']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//input[@id='reenterPassword']")
	private WebElement ConfirmPassword;
	
	@FindBy(how=How.XPATH,using="//button[@id='continue']")
	private WebElement CreateAccount;

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getCreateAccount() {
		return CreateAccount;
	}
	
	
	
}

