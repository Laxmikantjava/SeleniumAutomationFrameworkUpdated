package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver;

	public static Properties prop = new Properties();

	public Base() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Resources/data.prop");

		prop.load(fis);
	}
		public static void initialization() throws FileNotFoundException{
		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\ECLIPSE-OXYGEN\\SelProject\\drivers\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		// return driver;

	}
	
	public static void launchAut(String url) {
		driver.get(url);
	}
}