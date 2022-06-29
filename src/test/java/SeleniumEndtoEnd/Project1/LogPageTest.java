package SeleniumEndtoEnd.Project1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogPageTest extends GlobalVariables {

	@SuppressWarnings("deprecation")
	@Test
	public void logPageTest() throws IOException, InterruptedException {
//		driver.get("https://open.spotify.com/");
//		HomePage h=new HomePage();
//		h.loginLink(driver).click();
		WebDriver driver=initializeDriver();
		driver.get(prop.getProperty("loginpage"));
		LoginPage2 lp=new LoginPage2(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.username().sendKeys(prop.getProperty("username"));
		lp.password().sendKeys(prop.getProperty("password"));
		lp.loginButton().click();
		driver.quit();
	}
}
