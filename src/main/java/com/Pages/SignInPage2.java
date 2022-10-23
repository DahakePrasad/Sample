package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage2 {
	
	@FindBy(how=How.XPATH,using="//input[@type='email']")
	private WebElement Email;
	

	@FindBy(how=How.XPATH,using="//input[@type='password']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[@id='next']")
	private WebElement SignIn;

	
	@FindBy(how=How.XPATH,using="//a[@id='createAccount']")
	private WebElement CreateAccount;


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getSignIn() {
		return SignIn;
	}


	public WebElement getCreateAccount() {
		return CreateAccount;
	}

	
	


}
