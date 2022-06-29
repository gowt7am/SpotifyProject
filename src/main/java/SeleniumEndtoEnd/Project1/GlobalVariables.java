package SeleniumEndtoEnd.Project1;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalVariables {

	static Properties prop;
	public static WebDriver initializeDriver() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Java Bootcamp\\Project1\\src\\main\\java\\GlobalVariables");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			return driver;
			
				}

		return null;
		
	}
}
