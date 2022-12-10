package launchingbrowseroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "\\Drivers";

	public static void fChromeLauncher()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "\\chromedriver.exe\\");
		driver = new ChromeDriver();

	}

	public static void main(String[] args) {

		fChromeLauncher();
		driver.manage().window().maximize();
//		String sURL = "https://www.facebook.com";
//		driver.get(sURL);
//		String sCSSSelectors ="input[id='email']";
//		String sCSSSelectors ="#email";
//		String sCSSSelectors ="input[class='inputtext _55r1 _6luy']";
//		String sCSSSelectors ="._6luy";
//		String sCSSSelectors ="input[name='email']";
//		String sCSSSelectors ="input[data-testid='royal_email']";
//		String sCSSSelectors ="[id='email'][name='email']";
//		String sCSSSelectors ="[class='inputtext _55r1 _6luy'][data-testid='royal_email']";
//		String sCSSSelectors = "._6lux>#email";
//		String sCSSSelectors = "input[placeholder*='phone number']";
//		String sCSSSelectors = "input[name^='em']";
//		String sCSSSelectors = "input[data-testid$='email']";
//		driver.findElement(By.cssSelector(sCSSSelectors)).sendKeys("abc@gmail.com");
		
		driver.get("https://www.snapdeal.com/");	
// 		String sCSSSelector = ".nav.smallNav >li:first-of-type";
//		String sCSSSelector = ".nav.smallNav >li:last-of-type";
//		String sCSSSelector = ".nav.smallNav >li:nth-of-type(4)";
		String sCSSSelector ="leftHead +li"; //home page deal of the day banner +input
		driver.findElement(By.cssSelector(sCSSSelector)).click();
		 
		
//		 


	}

}
