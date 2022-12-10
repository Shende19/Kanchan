package SwitchingOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmAlert {
	static WebDriver driver;
	static String sDriverpath = System.getProperty("user.dir") + "//Drivers//";
	
	static void FLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverpath + "//chromedriver.exe//" );
		driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		FLaunchBrowser();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//identify the frame 
 		WebElement frame = driver.findElement(By.cssSelector("iframe#iframeResult"));
 		driver.switchTo().frame(frame);
// 		driver.switchTo().frame(0);
		//identifying element
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().getText();
 		driver.switchTo().alert().dismiss();
		
		
	}

}
