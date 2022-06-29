package SeleniumEndtoEnd.Project1;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HomePageAfterLoginTest extends GlobalVariables {
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void homePageAfterLoginTest() throws IOException {

		WebDriver driver=initializeDriver();
		HomePageAfterLogin hp2=new HomePageAfterLogin();
		LoginPage2 lp=new LoginPage2(driver);
		driver.get(prop.getProperty("loginpage"));
//		HomePageTest hp=new HomePageTest();
//		hp.homePageLogin();
		driver.manage().window().maximize();
		lp.username().sendKeys("musicologomenes70@gmail.com");
		lp.password().sendKeys("Ronaldo7$");
		lp.loginButton().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		hp2.profileButton(driver).click();
		hp2.profile(driver).click();
		driver.quit();
		
	}
	
	
}
