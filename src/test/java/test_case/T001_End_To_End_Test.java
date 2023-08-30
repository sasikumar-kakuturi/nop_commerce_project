package test_case;

import org.testng.annotations.Test;

import page_object.Adidas_shoes;
import page_object.Check_out;
import page_object.Home_page;
import page_object.Login_page;
import page_object.Registration_page;
import page_object.Shoe_page;
import page_object.Shopping_cart;

public class T001_End_To_End_Test extends Base_test{
	@Test(priority=1)
	public void registration_test()
	{
		Home_page homepage=new Home_page(driver);
		homepage.register();
		
		Registration_page registrationpage=new Registration_page(driver);
		registrationpage.gender();
		registrationpage.firstname(randomstring());
		registrationpage.lastname(randomstring());
		registrationpage.birthdate();
		registrationpage.birthmonth();
		registrationpage.birthyear();
		String email=alphanumber();
		registrationpage.email(email);
		registrationpage.companyname(randomstring());
		String pass=randomalphanumber();
		registrationpage.password(pass);
		registrationpage.confirmpassword(pass);
		registrationpage.btnregister();
		registrationpage.continuebutton();
		//Login_page
		homepage.login();
		Login_page loginpage=new Login_page(driver);
		loginpage.loginemail(email);
		loginpage.loginpassword(pass);
		loginpage.loginbtn();
		
		//Search for shoes
		homepage.search();
		homepage.searchbutton();
		
		//shoes page
		Shoe_page sp=new Shoe_page(driver);
		sp.shoes();
		
		//adidas shoes
		Adidas_shoes as=new Adidas_shoes(driver);
		as.size();
		as.addtocart();
		
		homepage.shoppingcart();
		
		//shoppingcart
		Shopping_cart shoppingcart=new Shopping_cart(driver);
		shoppingcart.checkbox();
		shoppingcart.checkout();
		
		         //checkout
		//Shipping And Billing Address
		Check_out checkout=new Check_out(driver);
		checkout.country();
		checkout.state(randomstring());
		checkout.address(randomstring());
		checkout.zipcode(numeric());
		checkout.phonenumber(numericforphone());
		checkout.continuebutton();
		
		//Shipping Method 
		checkout.shippingmethod();
		
		//payment method
		checkout.paymentmethod();
		//payment information
		checkout.paymentinformation();
		//confirm order
		checkout.confirmorder();
		
		
		

		
		
		
		
		
		
		
		
	}



}
