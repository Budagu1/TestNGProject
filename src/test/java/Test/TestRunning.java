package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.PageOpen;
import Util.BrowserFactory;

public class TestRunning {
	
	WebDriver driver;
	
	
   @Test
public void Test() throws InterruptedException {
	 driver= BrowserFactory.BrowserLaunch();
	 PageOpen p= PageFactory.initElements(driver,PageOpen.class);
	 p.AddcategoryField();
	 p.ClickonAddcategoryField();
	 p.DuplicatecategoryField();
	 p.ClickonAddcategoryDuplicateField();
	p.MonthDropDownField();
	 
	
}
}
