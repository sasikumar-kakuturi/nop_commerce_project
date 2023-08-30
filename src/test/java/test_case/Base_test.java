package test_case;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_test {
	public WebDriver driver;
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}
	public String randomstring()
	{
		String name=RandomStringUtils.randomAlphabetic(5);
		return(name);
	}
	
	public String randomalphanumber()
	{
		String pass=RandomStringUtils.randomAlphabetic(4);
		String word=RandomStringUtils.randomNumeric(3);
		return(pass+"@"+word);
	}
	public String alphanumber()
	{
		String gmail=RandomStringUtils.randomAlphanumeric(8);
		return(gmail+"@gmail.com");
	}
	public String numeric()
	{
		String zip=RandomStringUtils.randomNumeric(6);
		return(zip);
	}
	public String numericforphone()
	{
		String phone=RandomStringUtils.randomNumeric(10);
		return(phone);
	}

}
