package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Check_out extends Base_class{
	
	public Check_out(WebDriver driver) {
		super(driver);
	}
	//Billing And Shipping Address
	@FindBy(xpath="//option[text()='India']")
	WebElement country;
	@FindBy(id="BillingNewAddress_City")
	WebElement state;
	@FindBy(id="BillingNewAddress_Address1")
	WebElement address;
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement zipcode;
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement phonenumber;
	@FindBy(xpath="//button[@onclick='Billing.save()']")
	WebElement continuebutton;
	
	//Shipping Method
	@FindBy(xpath="//button[@onclick='ShippingMethod.save()']")
	WebElement shippingmethod;
	
	//Payment Method
	@FindBy(xpath="//button[@class='button-1 payment-method-next-step-button']")
	WebElement paymentmethod;
	
	//payment information
	@FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")
	WebElement paymentinformation;
	
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement confirmorder;
	
	
	
	
	//actions of shipping and billing Address
	
	public void country()
	{
		country.click();
	}
	public void state(String statename)
	{
		state.sendKeys(statename);
	}
	public void address(String addressname)
	{
		address.sendKeys(addressname);
	}
	public void zipcode(String zipnumber)
	{
		zipcode.sendKeys(zipnumber);
	}
	public void phonenumber(String phone)
	{
		phonenumber.sendKeys(phone);
	}
	public void continuebutton()
	{
		continuebutton.click();
	}
	
	//actions of shipping method
	public void shippingmethod()
	{
		shippingmethod.click();
	}
	//actions of Payment method
	public void  paymentmethod()
	{
		paymentmethod.click();
	}
	//actions of Payment information
	public void  paymentinformation()
	{
		paymentinformation.click();
	}
	//actions of confirm order
	public void confirmorder()
	{
		confirmorder.click();
	}

}
