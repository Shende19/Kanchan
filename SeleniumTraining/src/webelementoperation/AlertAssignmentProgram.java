package webelementoperation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AlertAssignmentProgram {

	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//";

	public static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver(); //launch Chrome browser
	}

	public static void main(String[] args) {
		fLaunchBrowser();
		String sURL = "https://www.way2automation.com/way2auto_jquery//alert.php#load_box";
		driver.get(sURL); //launch URL
		driver.manage().window().maximize();
		String scssSelector = ".responsive-tabs>li:nth-of-type(2)>a";
		driver.findElement(By.cssSelector(scssSelector)).click();
		String scssSelector1 = "iframe[src= 'alert/input-alert.html']";
 		WebElement frame = driver.findElement(By.cssSelector(scssSelector1));
 		driver.switchTo().frame(frame); 
 		driver.findElement(By.tagName("button")).click();
 		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys(" Kanchan");
		alert.accept();    
 		 
		 if( alert.getText()==("Kanchan"))
		{
		 
			System.out.println("element is  present" );
		}
		else
		{
			System.out.println("element is not Present");
		} 
	}

}
