package launchingbrowseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunching {

	static WebDriver driver;
	static String sDriverPath=System.getProperty("user.dir") + "//Drivers//";

	public static void fLaunchingBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "\\chromedriver.exe\\");
		driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sURL="https://www.amazon.com";
		fLaunchingBrowser();
		driver.get(sURL);	
		String sTitleOfPage = driver.getTitle();
		System.out.println("Title of the page:" +sTitleOfPage);
		String sCurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL of the page : " +sCurrentURL);
		String sPageSource = driver.getPageSource();
		System.out.println("Page Source of the webpage : " +sPageSource);
		driver.close();
		driver.quit();

	}

}
