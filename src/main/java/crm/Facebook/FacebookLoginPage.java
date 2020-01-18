package crm.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookLoginPage {
	
	
	WebDriver driver;
	
	public FacebookLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name="email")
	@CacheLookup
	WebElement email;
	
	@FindBy(how=How.ID ,using="pass")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id='loginbutton']")
	@CacheLookup
	WebElement login_button;
	
	@FindBy(how=How.LINK_TEXT,using="Forgotten account?")
	@CacheLookup
	WebElement forgot_password_link;
	
	public void login_to_facebook(String uid,String pwd){
		driver.navigate().to("https://facebook.com");
		email.sendKeys(uid); 
		password.sendKeys(pwd);
		login_button.click(); } 

}
