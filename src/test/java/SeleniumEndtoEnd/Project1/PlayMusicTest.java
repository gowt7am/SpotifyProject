package SeleniumEndtoEnd.Project1;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PlayMusicTest extends GlobalVariables{
	
	@Test
	public void testMusic() throws IOException, InterruptedException {
		WebDriver driver=initializeDriver();
		driver.get(prop.getProperty("loginpage"));
		LoginPage2 lp=new LoginPage2(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.username().sendKeys(prop.getProperty("username"));
		lp.password().sendKeys(prop.getProperty("password"));
		lp.loginButton().click();
		PlayMusic pl=new PlayMusic(driver);
		pl.selectPlaylist().click();
		pl.typeSearchbox().sendKeys("hi");
		Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.className("KAuXIg8XQPSRMRqTjvAD"));
		for(WebElement option:options) {
			if(option.getText().contains("Hiphop Tamizha")) {
				System.out.println("hi");
				option.findElement(By.cssSelector("div[aria-label='See more Hiphop Tamizha']")).click();
				break;
			}
		}
		Thread.sleep(2000);
		System.out.println(driver.findElements(By.cssSelector("button[data-testid='add-to-playlist-button']")).size());
		System.out.println(driver.findElements(By.xpath("//div[@class='JUa6JJNj7R_Y3i4P8YUX']/div[@role='presentation']/div[@role='row']")).size());
//		driver.findElement(By.cssSelector("button[data-testid='add-to-playlist-button']")).click();
//		List<WebElement> options2=driver.findElements(By.cssSelector("button[data-testid='add-to-playlist-button']"));
//		for(WebElement opt:options2) {
//			if(driver.findElement(null))
//			
//		}

	}

	
}
