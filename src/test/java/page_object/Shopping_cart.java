package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping_cart extends Base_class{
	public Shopping_cart(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="termsofservice")
	WebElement checkbox;
	@FindBy(id="checkout")
	WebElement checkout;
	
	
	//actions
	public void checkbox()
	{
		checkbox.click();
	}
	public void checkout()
	{
		checkout.click();
	}
	

}
