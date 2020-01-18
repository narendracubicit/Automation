package crm.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FaceBookTest {
	
	
@Test
public void navigateToFaceBook() {
	WebDriverManager.chromedriver().setup();
	 
    //Create driver object for Chrome
    WebDriver driver = new ChromeDriver();
    
  //created page object using page factory
    FacebookLoginPage login_page=PageFactory.initElements(driver, FacebookLoginPage.class);
  		
  		//calling method in page object 
    login_page.login_to_facebook("hello@gmail.com", "sru@1234");	
    
}

}
