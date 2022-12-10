package SwitchingOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrameProgram {
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir")  + "//Drivers//";
	
	public static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		fLaunchBrowser();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//Switch to iframe present in the webpage by using webelement
//		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
//		driver.switchTo().frame(frame);
		//or
  		driver.switchTo().frame(0);
 		//or
// 		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
 		Actions action = new Actions(driver);
 		//identify the source element
  		WebElement src = driver.findElement(By.id("draggable"));
  		//identify dest element
  		WebElement dest = driver.findElement(By.id("droppable"));
  		action.dragAndDrop(src, dest).build().perform();
   		driver.switchTo().defaultContent();
   		driver.findElement(By.cssSelector(".logo>a")).click();
  		
		

	}

}
