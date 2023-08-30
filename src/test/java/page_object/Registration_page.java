package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_page extends Base_class{

		public Registration_page(WebDriver driver) {
		super(driver);
		
	}
		//Elements
			@FindBy(id="gender-male")
			WebElement btn_gender;
			@FindBy(id="FirstName")
			WebElement txt_firstname;
			@FindBy(id="LastName")
			WebElement txt_lastname;
			@FindBy(xpath="//select[@name='DateOfBirthDay']//option[25]")
			WebElement birth_date;
			@FindBy(xpath="//select[@name='DateOfBirthMonth']//option[7]")
			WebElement birth_month;
			@FindBy(xpath="//select[@name='DateOfBirthYear']//option[89]")
			WebElement birth_year;
			@FindBy(id="Email")
			WebElement email;
			@FindBy(id="Company")
			WebElement company;
			@FindBy(id="Password")
			WebElement pw;
			@FindBy(id="ConfirmPassword")
			WebElement confirm_pw;
			@FindBy(id="register-button")
			WebElement btn_reg;
			@FindBy(xpath="//div[@class='buttons']//a")
			WebElement btn_continue;
			
			//Actions
		
			public void gender()
			{
				btn_gender.click();
			}
			public void firstname(String name)
			{
				txt_firstname.sendKeys(name);
			}
			public void lastname(String name)
			{
				txt_lastname.sendKeys(name);
			}
			public void birthdate()
			{
				birth_date.click();
			}
			public void birthmonth()
			{
				birth_month.click();
			}
			public void birthyear()
			{
				birth_year.click();
			}
			public void email(String useremail)
			{
				email.sendKeys(useremail);
			}
			public void companyname(String name)
			{
				company.sendKeys(name);
			}
			
			public void password(String pass)
			{
				pw.sendKeys(pass);
			}
			public void confirmpassword(String word)
			{
				confirm_pw.sendKeys(word);
			}
			public void btnregister()
			{
				btn_reg.click();
			}
			public void continuebutton()
			{
				btn_continue.click();
			}
			
	}


