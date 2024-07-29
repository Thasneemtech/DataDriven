package page.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {
	WebDriver driver;
	
	//Locating email id text box
	@FindBy(name = "email")
	WebElement emailfield;
	
	//Locating password text box
	@FindBy(name ="pass")
	WebElement pswd;
	
	//Locating login button
	@FindBy(name = "login")
	WebElement loginbutton;
	
	public FbLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//actions
	
	//Specifying email and pswd
	public void setValues(String UN,String PWD) {
		emailfield.sendKeys(UN);
		pswd.sendKeys(PWD);
	}
	
	//Clicking on login button
	public void clickLoginBtn() {
		loginbutton.click();
	}
	

}
