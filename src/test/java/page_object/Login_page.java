package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page extends Base_class {
	
	public Login_page(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(id="Email")
	WebElement Email;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(xpath="//div[@class='buttons']//button[@class='button-1 login-button']")
	WebElement login;
	
	//Actions
		public void loginemail(String email)
		{
			Email.sendKeys(email);
		}
		public void loginpassword(String pass)
		{
			password.sendKeys(pass);
		}
		public void loginbtn()
		{
			login.click();
		}
	

}
