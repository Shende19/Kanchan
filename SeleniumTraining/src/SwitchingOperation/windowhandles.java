package SwitchingOperation;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {
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
		//get current homepage id
		String homepagewinId = driver.getWindowHandle();
		System.out.println("current window opened : "+homepagewinId);
		//find the element and opening new url in new tab click on it
		driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[3]")).click();
		//open link in new tab by using set iterator
		Set<String> allWindIds = driver.getWindowHandles();
		System.out.println("all windows current Id : "+allWindIds);
		//remove homepagewinId from allwinIds
		allWindIds.remove(homepagewinId);
		System.out.println("after removing allWindIds : "+allWindIds);
		//go into child window
		Iterator<String> itr = allWindIds.iterator();
		String childWinId = itr.next();
		//Perfom operation on child window
		driver.switchTo().window(childWinId );
		System.out.println("page title of the child window :"+driver.getTitle());
		System.out.println("current url of the child window : "+driver.getCurrentUrl());
		driver.close();
		//get back to home page window
		driver.switchTo().window(homepagewinId);
		System.out.println("page title of the homepage :"+driver.getTitle());
		System.out.println("current url of the homepage :"+driver.getCurrentUrl());
		driver.close();
//		driver.quit();
		
		

	}

}
