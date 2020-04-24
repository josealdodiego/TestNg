package com.josealdo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.core.sym.Name;
import com.josealdo.core.CorePage;
import com.josealdo.driver.TLDriverFactory;

public class PageRegister  extends  CorePage<PageRegister>{
	
	
	public PageRegister() {
		this.driver = TLDriverFactory.getDriver();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(name = "firstName")
	private WebElement inputName;
	
	@FindBy(name = "lastName")
	private WebElement inputLastName;
	
	@FindBy(name = "phone")
	private WebElement inputPhone;
	
	
	@FindBy(name = "userName")
	private WebElement inputUserName;
	
	@FindBy(name = "address1")
	private WebElement inputAddress1;
	
	@FindBy(name = "city")
	private WebElement inputCity;
	
	@FindBy(name = "state")
	private WebElement inputState;
	
	@FindBy(name = "postalCode")
	private WebElement inputPostalCode;
	

	@FindBy(name = "country")
	private WebElement selectCountry;
	
	
	@FindBy(name = "email")
	private WebElement inputEmail;
	
	
	@FindBy(name = "password")
	private WebElement inputpassword;
	
	
	@FindBy(name = "confirmPassword")
	private WebElement inputConfirmPassword;
	
	@FindBy(name = "submit")
	private WebElement bntLogin;
	
	
	 
	
	
	
	public PagRegisterSucess contactInformation(String name, String lastName, String phone, 	String userName,
			String address1, String city, String state,	String postalCode, String country,
			String email, String password,	String confirmPassword) 
	{
		preencherCampo(inputName, name);	
		preencherCampo(inputLastName, lastName);	
		preencherCampo(inputPhone, phone);
		preencherCampo(inputUserName, userName);
		preencherCampo(inputAddress1, address1);	
		preencherCampo(inputCity, city);	
		preencherCampo(inputState, state);
		preencherCampo(inputPostalCode, postalCode);
		selectElementByVisibleText(selectCountry, country);
		preencherCampo(inputEmail, email);
		preencherCampo(inputpassword, password);
		preencherCampo(inputConfirmPassword, confirmPassword);
		click(bntLogin);
		return new PagRegisterSucess();
		
	}
}




