package SwitchingOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptUpAlert {
	static WebDriver driver;
	static String sDriverpath = System.getProperty("user.dir") + "//Drivers//";
	
	static void FLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverpath + "//chromedriver.exe//" );
		driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		FLaunchBrowser();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement frame = driver.findElement(By.cssSelector("iframe#iframeResult"));
 		driver.switchTo().frame(frame);
//		driver.switchTo().frame(0);
		//identify the element
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().sendKeys(" kanchan");
		String actualPersonName = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String expectedObject = "kanchan";
//		if(actualPersonName==null || actualPersonName== expectedObject)
		if(actualPersonName.equals(expectedObject))
		{
			System.out.println("name is present in prompt window");
		}
		else
		{
			System.out.println("name is not present in prompt window");
		}
	}

}
