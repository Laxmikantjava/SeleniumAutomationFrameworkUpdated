package HomePgaeTest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HOmePage;
import Resources.Base;
import net.bytebuddy.asm.Advice.AllArguments;

public class SearchDevice extends Base {
	public SearchDevice() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	HOmePage hpage;
	String Ebayurl = "https://www.ebay.com";

	@BeforeTest
	public void setup() throws IOException {
		initialization();
		hpage = new HOmePage();
		launchAut(Ebayurl);

	}

	// Getting the title of the page
	@Test
	public void VerifyEbayTitlePage() {
		Assert.assertEquals(driver.getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
	}

	// search Mackbook
	@Test(enabled = true)
	public void searchMackbook() {
		HOmePage.inputSource.click();
	HOmePage.inputSource.sendKeys("Apple A1466 Macbook Air 13.3\" i7-4650U @ 1.7GHz - 8GB RAM - 256GB SSD");

		Select category = new Select(driver.findElement(By.id("gh-cat")));
		category.selectByVisibleText("Computers/Tablets & Networking");
		HOmePage.EbayGoSeach.click();

		// Verify that the page loads completely.

		// List<WebElement> AutoSuggest =
		// driver.findElements(By.xpath("//select[@id='gh-cat"));
		//
		// for(WebElement a : AutoSuggest) {
		// String allvalues = a.getText();
		// if (allvalues.equalsIgnoreCase("Computers/Tablets & Networking"))
		// a.click();
		//
		// }
		// String ValidateSrc = HOmePage.inputSource.getText();
		// System.out.println(ValidateSrc);

	}
	@Test(enabled = true)
	public void validateSearchresult() {
		 String searchresult = "Apple A1466 Macbook Air 13.3\" i7-4650U @ 1.7GHz - 8GB RAM - 256GB SSD";
		String validateFirstreslut = driver.findElement(By.xpath("//body/div[8]/div[4]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/a[1]/div[1]/span[1]")).getText();
		System.out.println(validateFirstreslut);
		if(validateFirstreslut.equalsIgnoreCase(searchresult)) {
			System.out.println("Firstreslut is same as searchresult");
		}
		else {
			System.out.println("Firstreslut is not same as searchresult");
		}
	}

	

}
