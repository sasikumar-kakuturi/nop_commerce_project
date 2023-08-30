package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page extends Base_class{
	
	public Home_page(WebDriver driver) {
		super(driver);
	}
	//Elements
	@FindBy(xpath=("//a[text()='Register']"))
	WebElement txt_register;
	
	@FindBy(xpath="//div[@class='header']//li[2]")
	WebElement login;
	@FindBy(id="small-searchterms")
	WebElement search;
	@FindBy(xpath="//div[@class='search-box store-search-box']//button")
	WebElement searchbtn;
	@FindBy(xpath="//span[text()='Shopping cart']")
	WebElement shoppingcart;
	

	
	
	//Actions
	public void register()
	{
		txt_register.click();
	}
	
	public void login()
	{
		login.click();
	}
	public void search()
	{
		search.sendKeys("shoes");
	}
	public void searchbutton()
	{
		searchbtn.click();
	}
	public void shoppingcart()
	{
		shoppingcart.click();
	}

}
