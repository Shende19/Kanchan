package javascriptingoperation;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecuterProgram {
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//";

	public static void fLaunchingChromrBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver(); //launch Chrome browser
	}
	
	public static void main(String[] args) {
		fLaunchingChromrBrowser();
		driver.get("https://www.kluniversity.in/alumni/RegForm.aspx//");
		driver.manage().window().maximize();
 		JavascriptExecutor executer = (JavascriptExecutor)driver; //type casting

// 		1)To type text in selenium WebDriver without using sendkeys()method
//  		executer.executeScript("document.getElementById('txtRollNO').value='1234';");
		
// 		2)To click a button in selenium webdriver using JavaScript
//  		WebElement submitButton = driver.findElement(By.id("Button1"));
//  		executer.executeScript("arguments[0].click();",submitButton);
  		
//		 3)To handle checkbox
// 		executer.executeScript("document.getElementById('CheckBox1').checked=true;");
		 
		
//		4)To refresh browser window using Javascript
 		executer.executeScript("history.go(0)");
		
		
//		5)Scrolling
		//vertical scroll down by 500 pixels
//		jse.executeScript("window.scrollBy(0,500)");
		//for scrolling till the bottom of the page we can use the code like
//		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		
		
		
		
		
		
		
		
		
	}

	public void executeScript(String string, WebElement button1) {
		// TODO Auto-generated method stub
		
	}

}
