package SwitchingOperation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesprogram {
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//" ;
	
	public static void FLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		FLaunchBrowser();
		driver.get("https://etrain.info/in");
		driver.manage().window().maximize();
		//current window handle 
		String homepagewinIds = driver.getWindowHandle();
		System.out.println("current homepage Id :"+homepagewinIds);
		//find unique id element for new link or new tab
 		driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[1]")).click();
 		//find all window id by using set interface 
 		Set<String> allwindId = driver.getWindowHandles();
 		System.out.println("all window Ids are :" +allwindId );
 		//use remove method to get child window and remove mainpage from new tab
 		allwindId.remove(homepagewinIds);
 		System.out.println("after removing allwindow ids :" +allwindId);
 		//get child window by using iterator
 		Iterator<String> itr = allwindId.iterator();
 		String childwindow = itr.next();
 		//firstly switch to child window and then perform action on child window
 		driver.switchTo().window(childwindow);
 		//perform action on child window
 		System.out.println("title of the page is :"+driver.getTitle());
 		System.out.println("current url of the page :"+driver.getCurrentUrl());
 		//switch to the main homepage
 		driver.switchTo().window(homepagewinIds);
 		//perform action on main window
 		System.out.println("title of the page is :"+driver.getTitle());
 		System.out.println("current url of the page is :"+driver.getCurrentUrl());
 		driver.quit();
	}

}
