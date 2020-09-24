package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
public static WebDriver BrowserLaunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\TestngProjectPractical\\driver\\chromedriver.exe");
	// create chromeDriver object
	driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	
	driver.get(" http://techfios.com/test/101/");
	
	return driver;
	
}


}
