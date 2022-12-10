package SwitchingOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
 
 

public class HandlingAlertAssignment {
	static WebDriver driver;
	static String sDriverpath = System.getProperty("user.dir") + "//Drivers//";
	
	static void FLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverpath + "//chromedriver.exe//" );
		driver = new ChromeDriver();
	}


	public static void main(String[] args) {
		FLaunchBrowser();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//identifying the element
		WebElement wait = driver.findElement(By.xpath("//button[text()='Click me']"));
		wait.click();
		//applying explicit webdriver wait
		WebDriver Wait = new WebDriver(driver,20);
		wait.until(ExpectedConditions.alertIsPresent() ;
		 

	}

}
