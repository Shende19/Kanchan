package SwitchingOperation;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
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
//		get current window unique id
		String homepagewinID = driver.getWindowHandle();//T1
		System.out.println("Home page window ID: " +homepagewinID);
		// performing click operation to open linkedin page in new tab
		driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[4]")).click();
		//get all windows unique IDs which are opened by selenium current instance
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("All Windows ID : " +allWinIds);
		//remove home window id from all window id dn you willget child window id
		allWinIds.remove(homepagewinID);
		System.out.println("After removing home winId ,all windows Id : " +allWinIds);
		//get child window id using iterator 
		 Iterator<String> itr = allWinIds.iterator();
		 String childWindId = itr.next();
		 //switch control to child window
//		 driver.switchTo().window(allWinIds.iterator().next());
		 //or
		 driver.switchTo().window(childWindId);
		 //now you are allow to identify any element from child window
		 System.out.println("Linkedin page url : "+driver.getTitle());
		 System.out.println("Linkedin page url : "+driver.getCurrentUrl());
		 //close current instance
		 driver.close();
		 //driver.quit
		 //switch back to home page window in order to perform any required operation on that
		 driver.switchTo().window(homepagewinID );
		 //now u are allow to identify any element from home window
		 System.out.println("entrain page title : "+driver.getTitle());
		 System.out.println("entrain current url : "+driver.getCurrentUrl());
		 driver.close();//close current instance 
		 driver.quit();//close all current instance
	
		
		
		
		
		
		
        
	
		
		

	}

}
