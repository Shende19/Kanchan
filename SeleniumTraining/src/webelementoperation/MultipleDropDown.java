package webelementoperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
	
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//";
	
	public static void FLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver();
		
	}

	public static void main(String[] args) {
		FLaunchBrowser();
		String sURL = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
		driver.get(sURL);
		driver.switchTo().frame("iframeResult");
		driver.manage().window().maximize();
  		
		//Identifying the DropDown i.e. Select Tags
 		WebElement wMultipleDropDown = driver.findElement(By.id("cars"));
		//Instantiated select class
		Select multiSelect = new Select(wMultipleDropDown);
 		System.out.println(multiSelect.isMultiple());
  		//selecting values
   		multiSelect.selectByValue("audi");
  		multiSelect.selectByIndex(2);
   		multiSelect.selectByVisibleText("Saab");
//  	multiSelect.selectByIndex(0);
  		
  		//Using FirstSelectedOption Method
//   		WebElement wfirstselectedoption = multiSelect.getFirstSelectedOption();
//   		System.out.println(wfirstselectedoption.getText());
   		
  		//Deselecting Values
//  		multiSelect.deselectByIndex(1);
//    		multiSelect.deselectByValue("saab");
//   		multiSelect.deselectAll(); 
   		
  		//Using getAllSelectedOptions
  		
   		List<WebElement> allMultipleOption = multiSelect.getAllSelectedOptions();
   		for(int i=0; i<allMultipleOption.size() ; i++)
   		{
  			System.out.println("Selected DropDown OPtion : " + allMultipleOption.get(i).getText());
   		}
//  			
  		
  		
  		
  		
	}

}
