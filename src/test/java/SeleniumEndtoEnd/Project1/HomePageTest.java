package SeleniumEndtoEnd.Project1;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageTest extends GlobalVariables {

	@Test
	public void homePageLogin() throws IOException {
		WebDriver driver=initializeDriver();
		driver.get(prop.getProperty("homepage"));
//		driver.manage().window().maximize();
		HomePage hp=new HomePage();
		hp.loginLink(driver).click();
		driver.quit();
	}
}
