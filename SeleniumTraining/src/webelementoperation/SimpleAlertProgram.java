package webelementoperation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertProgram {

	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//";

	public static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver(); //launch Chrome browser
	}

	public static void main(String[] args) //throws InterruptedException
	{
		fLaunchBrowser();
		String sURL = "https://www.way2automation.com/way2auto_jquery//alert.php#load_box";
		driver.get(sURL); //launch URL
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.tagName("button")).click();
		Alert alert =driver.switchTo().alert();
		//clicking on ok button
//		Thread.sleep(3000);
//		alert.accept();
		//clicking on cancel button
//		alert.dismiss();
		//getting textof alert
		System.out.println(alert.getText());

	}

}
