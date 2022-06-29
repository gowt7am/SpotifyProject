package SeleniumEndtoEnd.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	By loginlink=By.cssSelector("button[data-testid='login-button']");
	public WebElement loginLink(WebDriver driver) {
		return driver.findElement(loginlink);
	}
}
