package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shoe_page extends Base_class {
	public Shoe_page(WebDriver driver) {
		super(driver);
	}
	 
	@FindBy(xpath="//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]")
	WebElement shoes;
	
	
	
	//actions
	public void  shoes()
	{
		shoes.click();
	}


}
