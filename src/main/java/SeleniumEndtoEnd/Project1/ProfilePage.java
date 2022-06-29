package SeleniumEndtoEnd.Project1;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
	

	By user=By.xpath("//tbody/tr[1]");
	By email=By.xpath("//tbody/tr[2]");
	By dob=By.xpath("//tbody/tr[3]");
	By country=By.xpath("//tbody/tr[4]");
	By closepopup=By.id("onetrust-close-btn-container");
	
		 
		 public WebElement closePopup(WebDriver driver) {
			 return driver.findElement(closepopup);
		 }
		 
		 public WebElement getUser(WebDriver driver) {
			 return driver.findElement(user);
		 }
		 
		 public WebElement getEmail(WebDriver driver) {
			 return driver.findElement(email);
		 }
		 
		 public WebElement getDob(WebDriver driver) {
			 return driver.findElement(dob);
		 }
		 
		 public WebElement getCountry(WebDriver driver) {
			 return driver.findElement(country);
		 }
	}


