package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adidas_shoes extends Base_class{
	public Adidas_shoes(WebDriver driver) {
		super(driver);
	}
	 
	@FindBy(xpath="//option[text()='10']")
	WebElement size;
	@FindBy(id="add-to-cart-button-25")
	WebElement addtocart;
	
	
	
	
	//action
	public void size()
	{
		size.click();
	}
	public void addtocart()
	{
		addtocart.click();
	}

	

}
