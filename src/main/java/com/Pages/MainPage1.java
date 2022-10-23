package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage1 {
	
	@FindBy(how=How.XPATH,using="//a[@id='header_sign_in']")
	private WebElement Register;
	
	@FindBy(how=How.XPATH,using="//a[@id='Home_Ancillary_9']")
	private WebElement Membership;
	
	@FindBy(how=How.XPATH,using="//a[@href='https://sameday.costco.com/?zipcode=98101']")
	private WebElement SameDay;
	
	@FindBy(how=How.XPATH,using="//a[@class='hidden-xs hidden-sm hidden-md']")
	private WebElement WhileSuppliesLast;
	
	@FindBy(how=How.XPATH,using="//a[@id='Home_Ancillary_8']")
	private WebElement Travel;

	public WebElement getRegister() {
		return Register;
	}

	public WebElement getMembership() {
		return Membership;
	}

	public WebElement getSameDay() {
		return SameDay;
	}

	public WebElement getWhileSuppliesLast() {
		return WhileSuppliesLast;
	}

	public WebElement getTravel() {
		return Travel;
	}
	


}
