package mouseOperation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation2 {
	static WebDriver  driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//" ;
	
	static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//" );
		driver= new ChromeDriver();
	}

	public static void main(String[] args) throws InterruptedException {
		fLaunchBrowser();
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.manage().window().maximize();
		//identify the elment of menu option
		List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("main menu option count :"+mainMenu.size());
		//create an instance of action class by passing required browser instance to its constructor
		Actions act =new Actions (driver);
		for (int i=0; i<mainMenu.size(); i++)
		{
			WebElement option = mainMenu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1400);
		}
		mouseHover(act,mainMenu);
		mouseHoverWithCords(act,mainMenu.get(1));
		rightClick(act,mainMenu.get(1));
			
	}
	static void rightClick(Actions act,WebElement option)
	{
		System.out.println("otion name is :"+option.getText());
		act.moveToElement(option).contextClick().build().perform();
	}
	static void mouseHoverWithCords(Actions act,WebElement option)
	{
		System.out.println("Option name is :" +option.getText());
		act.moveToElement(option,100,0).perform();
	}
	static void mouseHover(Actions act,List<WebElement>mainMenu) throws InterruptedException
	{
		for (int i=0; i<mainMenu.size(); i++)
		{
			WebElement option = mainMenu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1400);
		}
		
	}
	
}
