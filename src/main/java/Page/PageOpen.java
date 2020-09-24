package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class PageOpen {
	WebDriver driver;
	
	public PageOpen(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(how = How.NAME, using = "categorydata") WebElement addcategory;
	
	@FindBy(how = How.XPATH, using ="//input[@value='Add category']")WebElement Clickbuttonaddcatery;
	
	@FindBy(how = How.NAME, using = "categorydata") WebElement addduplicatcategory;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']") WebElement Clickbuttonadddupicatecatery;
	@FindBy(how = How.NAME, using = "due_month") WebElement DueDropmenuClick;
	
	
	// Methods  interact with add category
	
	public void AddcategoryField() throws InterruptedException {
		addcategory.sendKeys("New catgory");
		Thread.sleep(5000);
	}
	
	public void ClickonAddcategoryField() throws InterruptedException {
		Clickbuttonaddcatery.click();
		Assert.assertTrue(true, "Does New category display");
		System.out.println("Great!");
		Thread.sleep(5000);
		driver.navigate().back();
		
	}
	// Mehthods intect with Duplicate category
	public void DuplicatecategoryField() throws InterruptedException   {
		addduplicatcategory.sendKeys("New catgory");
		Thread.sleep(5000);
		
		
	}
	public void ClickonAddcategoryDuplicateField() {
		Clickbuttonadddupicatecatery.click();
		Assert.assertFalse(false);
		System.out.println("the category already exist");
		driver.navigate().back();
		
		
	}
	
	//Methods interact with Month drop down
	public void MonthDropDownField() {
		DueDropmenuClick.click();
	Assert.assertTrue(true, "Has all months");
		
		
	}
	
		
	
	
}
