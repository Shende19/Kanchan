package SwitchingOperation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javascriptingoperation.JavascriptExecuterProgram;

public class HandlingAlertDemoqa {
	
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//" ;

	public static void fChromeLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//") ;
		driver = new ChromeDriver();
	}


	public static void main(String[] args) {
		fChromeLaunchBrowser();
		driver.manage().window().maximize(); 
		driver.get("https://demoqa.com/alerts");
		//identify the element and click on it
//		driver.findElement(By.cssSelector("#alertButton")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		//find another element 
		/*driver.findElement(By.cssSelector("#confirmButton")).click();
		Alert alert = driver.switchTo().alert();
 		alert.accept();	 
 		alert.dismiss();*/
//      identyfying the prompt window element
// 		WebElement button1= driver.findElement(By.id("promtButton"));
//  		button1.click();
//   		Alert alert = driver.switchTo().alert();
//   		alert.sendKeys("hi kanchan");
//   		String textmsg = alert.getText();
//   		System.out.println("textmsg : "+textmsg);
//  		alert.accept();
 
  		//identifying element 
  		WebElement button2 = driver.findElement(By.id("timerAlertButton"));
  		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
  		wait.until(ExpectedConditions.elementToBeClickable(button2));
  		button2.click();
// 		Alert alert = driver.switchTo().alert();
// 		alert.accept();
  		
 
 		
	}

}
