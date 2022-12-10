package mouseOperation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOPeration3 {
	static WebDriver driver;
	static String sDriverpath = System.getProperty("user.dir") + "//Drivers//";
	
	static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverpath + "//chromedriver.exe" );
		driver = new ChromeDriver();
	}


	public static void main(String[] args) throws InterruptedException {
		fLaunchBrowser();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		driver.manage().window().maximize();
		//frame handling 
		WebElement frame =driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		//creating instance of actions class and perform appropriate action using ref of actions class
		Actions act = new Actions(driver);
		//identifying source Elements
		List<WebElement> SourceElement = driver.findElements(By.cssSelector("ul#gallery>li"));
		//identifying target element
		WebElement TargetElement = driver.findElement(By.id("trash"));
		//perform dragand drop operation
		act.dragAndDrop(SourceElement.get(1),TargetElement).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(SourceElement.get(2),TargetElement).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(SourceElement.get(3),TargetElement).build().perform();
		Thread.sleep(1400);
		act.dragAndDrop(SourceElement.get(0), TargetElement).build().perform();

	}

}
