package SeleniumEndtoEnd.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlayMusic {
	
	WebDriver driver;
	By playlist=By.className("IPVjkkhh06nan7aZK7Bx");
	By searchbox=By.cssSelector("input[role='searchbox']");
	public PlayMusic(WebDriver driver) {
		this.driver=driver;
	}
//	LunqxlFIupJw_Dkx6mNx
//	LunqxlFIupJw_Dkx6mNx
	
	public WebElement selectPlaylist() {
		return driver.findElement(playlist);
	}

	public WebElement typeSearchbox() {
		 return driver.findElement(searchbox);
		
	}
}
