package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPOM {
	
private WebDriver driver; 
	
	public RegisterPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-user-o']")
	private WebElement account; 
	
	@FindBy(xpath="//*[contains(text(),'LOGIN / REGISTER')]")
	private WebElement Login_Register_link;
	
	@FindBy(xpath="(//*[contains(text(),'Register')])[2]")
	private WebElement registerbtn;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement Firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement Lastname;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement Telephone;
	
	@FindBy(xpath="//input[@name='address_1']")
	private WebElement Address1;
	
	@FindBy(xpath="//input[@name='address_2']")
	private WebElement Address2;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement City;
	
	@FindBy(xpath="//input[@name='postcode']")
	private WebElement PostCode;
	
	@FindBy(xpath="//select[@id='input-country']")
	private WebElement Countrydrpdwn;
	
	@FindBy(xpath="//select[@id='input-zone']")
	private WebElement Regionorstate;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@name='confirm']")
	private WebElement Password_Confirm;
	
	@FindBy(xpath="//input[@name='newsletter'][@value='0']")
	private WebElement Subscribe_radio;
	
	@FindBy(xpath="//input[@name='agree'][@value='1']")
	private WebElement Agree_chkbox;
	
	@FindBy(xpath="//input[@type='submit'][@value='Continue']")
	private WebElement Continuebtn;
	
	@FindBy(xpath="//input[@type='submit'][@value='Login']")
	private WebElement Loginbtn;
	
	@FindBy(xpath="//*[contains(text(),'Forgotten')]")
	private WebElement Forgottenpwlink;
	
	public void clickAccountlink() {
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(this.account).build().perform();
		
	}
	
	public void clickLoginregisterlink()
	{
		this.Login_Register_link.click();
	}

	public void clickRegisterbutton()
	{
		this.registerbtn.click();
	}
	
	public void completeregistration()
	{
		this.Firstname.sendKeys("manzoor");
		this.Lastname.sendKeys("mehadi");
		this.Email.sendKeys("manzoor23073@gmail.com");
		this.Telephone.sendKeys("9876543210");
		this.Address1.sendKeys("yeshwanthapur");
		this.Address2.sendKeys("bangalore");
		this.City.sendKeys("bangalore");
		this.PostCode.sendKeys("560022");
		Select select1 = new Select(Countrydrpdwn);
		select1.selectByVisibleText("India");
		Select select2 = new Select(Regionorstate);
		select2.selectByVisibleText("Karnataka");
		this.Password.sendKeys("manzoor1");
		this.Password_Confirm.sendKeys("manzoor1");
		this.Subscribe_radio.click();
		this.Agree_chkbox.click();
		this.Continuebtn.click();
		
	}
	
	public void enterloginEmail()
	{
		this.Email.sendKeys("manzoor23067@gmail.com");
	}
	
	public void enterloginPassword()
	{
		this.Password.sendKeys("manzoor1");
	}
	
	public void clickLoginbtn()
	{
		this.Loginbtn.click();
	}
	
	public void enterwrongloginPassword()
	{
		this.Password.sendKeys("manzoor5");
	}
	
	public void clickForgottenpwlink()
	{
		this.Forgottenpwlink.click();
	}
	
	public void clickContinuebutton()
	{
		this.Continuebtn.click();
	}
}
