package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trianing.waits.WaitTypes;

public class CheckOutPOM {
	
private WebDriver driver; 
	
	public CheckOutPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Integer vitae iaculis massa')]")
	private WebElement Product_Integer; 
	
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement Add_to_cart; 
	
	@FindBy(xpath="/html/body/ul/li/div/div/div[2]")
	private WebElement closebtn;
	
	
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li/h3/a/i")
	private WebElement Cart; 
	
	
	@FindBy(xpath="//*[contains(text(),'View Cart')]")
	private WebElement View_Cart; 
	
	@FindBy(xpath="//div[@class='pull-right']//a[contains(text(),'Checkout')]")
	private WebElement Check_out; 
	
	@FindBy(xpath="//*[contains(text(),'Checkout')]")
	private WebElement Check_out1; 
	
	@FindBy(xpath="//a[@id='search_button']")
	private WebElement magnifiericon;
	
	@FindBy(xpath="//input[@id='filter_keyword']")
	private WebElement searchbox;
	
	@FindBy(xpath="(//a[contains(text(),'Integer vitae iaculis massa')])[2]")
	private WebElement firstelement;
	
	@FindBy(xpath="//input[@type='submit'][@value='Continue']")
	private WebElement Continuebtn;
	
	@FindBy(xpath="//*[@id='button-payment-address']")
	private WebElement Continuebtn1;
	
	@FindBy(xpath="//p[@name='comment']")
	private WebElement comments_about_your_order;
	
	@FindBy(xpath="//input[@name='agree'][@value='1']")
	private WebElement Agree_chkbox;
	
	@FindBy(xpath="//input[@id='button-confirm']")
	private WebElement Confirm_order_btn;
	
		
	public void checkout_Before_Prelogin()
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOf(this.Product_Integer));
		this.Product_Integer.click();
		this.Add_to_cart.click();

		this.closebtn.click();

		Actions action2 = new Actions(driver);
		action2.moveToElement(this.Cart).build().perform();

		this.View_Cart.click();

		this.Check_out.click();
	
	}
	
	public void checkout_After_Prelogin()
	{
		this.magnifiericon.click();
		this.searchbox.sendKeys("integer");
		this.magnifiericon.click();
		this.firstelement.click();
		
		this.Add_to_cart.click();
		this.closebtn.click();
		Actions action2 = new Actions(driver);
		action2.moveToElement(this.Cart).build().perform();
		WebDriverWait wait2 = new WebDriverWait(driver,10);
		wait2.until(ExpectedConditions.visibilityOf(this.View_Cart));
		
		this.View_Cart.click();
		this.Check_out.click();
		WebDriverWait wait3 = new WebDriverWait(driver,10);
		wait3.until(ExpectedConditions.visibilityOf(this.Continuebtn1));
		this.Continuebtn1.click();
		WebDriverWait wait4 = new WebDriverWait(driver,10);
		wait4.until(ExpectedConditions.visibilityOf(this.Continuebtn1));
		this.Continuebtn1.click();
		this.comments_about_your_order.sendKeys("this product is nice");
		this.Agree_chkbox.click();
		this.Continuebtn.click();
		this.Confirm_order_btn.click();
	}
	

}
