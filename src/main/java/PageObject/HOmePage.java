package PageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.Base;

public class HOmePage extends Base {

	
		public HOmePage() throws IOException{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="gh-ac")
		public static WebElement inputSource;
		
		
		@FindBy(id="gh-btn")
		public static WebElement EbayGoSeach;
		
		@FindBy(linkText="Electronics")
		public static WebElement goElectronicPage;
		
		
		@FindBy(xpath="//span[contains(text(),'Cell Phones & Accessories')]")
		public static WebElement cellphonespage;
		
				
		
				

				@FindBy(xpath="//a[contains(text(),'Cell Phones & Smartphones')]")
		public static WebElement cellphoneSmartphonePage;
				
				
				@FindBy(xpath="//body[1]/div[4]/div[4]/div[3]/div[1]/section[1]/div[1]/div[2]/button[1]/span[1]")
				public static WebElement AllNetwprk;
				
				@FindBy(xpath="//body/div[@id='refineOverlay']/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[8]/span[1]")
				public static WebElement Screensize;
				
				@FindBy(id="c3-subPanel-Screen%20Size_5.0%20-%205.4%20in_cbx")
				public static WebElement Screensizechefilter;
				
				
				@FindBy(id="c3-mainPanel-price")
				public static WebElement pricefilter;
				
				@FindBy(xpath="//body/div[@id='refineOverlay']/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/ul[1]/li[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
				public static WebElement Minpricevalue;
				
				@FindBy(xpath="//body/div[@id='refineOverlay']/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/ul[1]/li[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
				public static WebElement Maxpricevalue;
				
				@FindBy(id="c3-mainPanel-location")
				public static WebElement locationfilter;
				
				@FindBy(xpath="//body/div[@id='refineOverlay']/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[2]/span[1]/span[1]/input[1]")
				public static WebElement selectLocationcountry;
				
			
				@FindBy(xpath="//body/div[@id='refineOverlay']/div[2]/div[1]/form[1]/div[3]/div[2]/button[1]")
				public static WebElement applyallfilter;
	}

