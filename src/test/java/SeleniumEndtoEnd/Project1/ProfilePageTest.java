package SeleniumEndtoEnd.Project1;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProfilePageTest extends GlobalVariables{

	
	@SuppressWarnings("deprecation")
	@Test
	public void profileDetails() throws IOException, InterruptedException {
		
		WebDriver driver=initializeDriver();
		HomePageAfterLogin hp2=new HomePageAfterLogin();
		LoginPage2 lp=new LoginPage2(driver);
		driver.get("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F");
		driver.manage().window().maximize();
		lp.username().sendKeys(prop.getProperty("username"));
		lp.password().sendKeys(prop.getProperty("password"));
		lp.loginButton().click();
		hp2.profileButton(driver).click();
		hp2.profile(driver).click();
		ProfilePage pp=new ProfilePage();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		@SuppressWarnings("unused")
		String ParentTab=it.next();
		String childTab=it.next();
		driver.switchTo().window(childTab);
		pp.closePopup(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(pp.getUser(driver).getText());
		System.out.println(pp.getEmail(driver).getText());
		System.out.println(pp.getDob(driver).getText());
		System.out.println(pp.getCountry(driver).getText());
		driver.quit();
	}
	
	
}
