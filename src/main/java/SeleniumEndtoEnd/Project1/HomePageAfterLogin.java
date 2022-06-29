package SeleniumEndtoEnd.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageAfterLogin {

	By profilebutton=By.className("odcjv30UQnjaTv4sylc0");
	By profile=By.className("wC9sIed7pfp47wZbmU6m");
	public WebElement profileButton(WebDriver driver) {
		return driver.findElement(profilebutton);
	}
	
	public WebElement profile(WebDriver driver) {
		return driver.findElement(profile);
	}
	
}
