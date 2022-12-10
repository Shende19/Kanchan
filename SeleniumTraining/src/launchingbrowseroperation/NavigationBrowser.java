package launchingbrowseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBrowser {
	static WebDriver driver;
	static String  sDriverPath = System.getProperty("user.dir") + "\\Drivers\\";
	
	public static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		 String sURL = "https://www.irctc.com";
 		 fLaunchBrowser();
		 driver.get(sURL);
		 String sPageSource = driver.getPageSource();
		 System.out.println("page source of the webpage : " +sPageSource);
		 // launching the browser
		 driver.navigate().to("https://www.myntra.com");
		 //backward navigation
		 driver.navigate().back();
		 //forward navigation
		 driver.navigate().forward();
		 //refresh 
		 driver.navigate().to("https://www.myntra.com");
		 driver.navigate().refresh();
		 driver.close();
		 driver.quit();
	}

}
