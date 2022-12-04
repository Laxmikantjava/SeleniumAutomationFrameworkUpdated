package HomePgaeTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HOmePage;
import Resources.Base;

public class ValidateFilter extends Base {

	public ValidateFilter() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	HOmePage hpage;
	String URL = "https://www.ebay.com";

	@BeforeTest
	public void setup() throws IOException {
		initialization();
		hpage = new HOmePage();
		launchAut(URL);

	}

	// Getting the title of the page
	@Test
	public void accesproductwithFilter() throws InterruptedException {

		HOmePage.goElectronicPage.click();
		HOmePage.cellphonespage.click();
		HOmePage.cellphoneSmartphonePage.click();
		HOmePage.AllNetwprk.click();
		HOmePage.Screensize.click();
		HOmePage.Screensizechefilter.click();

		HOmePage.pricefilter.click();
		HOmePage.Minpricevalue.sendKeys("699");
		HOmePage.Maxpricevalue.sendKeys("999");
		Thread.sleep(3000);
		HOmePage.locationfilter.click();
		HOmePage.selectLocationcountry.click();
		HOmePage.applyallfilter.click();
		// JavascriptExecutor jse =(JavascriptExecutor) driver;
		// jse.executeScript("window.scrollBy(0,200)");

	}

	@Test
	public void filterValidation() {
		String validateFilter = driver.findElement(By.xpath("//span[contains(text(),'3 filters applied')]")).getText();
		System.out.println(validateFilter);
	}

}