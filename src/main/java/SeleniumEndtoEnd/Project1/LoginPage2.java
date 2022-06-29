package SeleniumEndtoEnd.Project1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage2 {

	By username=By.id("login-username");
	By password=By.id("login-password");
	By loginbutton=By.id("login-button");
	private WebDriver driver;
	
	public  LoginPage2(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement username() {
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement loginButton() {
		return driver.findElement(loginbutton);
	}
}
