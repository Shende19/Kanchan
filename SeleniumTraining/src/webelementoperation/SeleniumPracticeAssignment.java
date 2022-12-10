package webelementoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class SeleniumPracticeAssignment {

	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//";

	public static void FLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver();

	}

	public static void main(String[] args) {
		
		FLaunchBrowser();
		String sURL = "https://www.techlistic.com/p/selenium-practice-form.html";
 		driver.get(sURL);
//  	driver.switchTo().frame("google_esf");
		driver.manage().window().maximize();
 		
 		//Enter FirstName
 		driver.findElement(By.name("firstname")).click();
 		driver.findElement(By.name("firstname")).sendKeys("Kanchan");
		
		//Enter LastName
		driver.findElement(By.name("lastname")).click();
		driver.findElement(By.name("lastname")).sendKeys("Shende");
		
		//Enter gender - Female
		WebElement wRadioButtonFemale = driver.findElement(By.id("sex-1"));
		wRadioButtonFemale.click();

		//Enter Experience -2yr
		WebElement wRadioButtonExperience = driver.findElement(By.id("exp-2"));
		wRadioButtonExperience.click();
		
		//Enter Date
		driver.findElement(By.id("datepicker")).sendKeys("2-10-2022");
		
		//Enter Profession
		WebElement wRadioButtonProfession = driver.findElement(By.id("profession-1"));
		wRadioButtonProfession.click();
		
		//Enter Automation Tool
		WebElement wRadioButtonTool = driver.findElement(By.id("tool-2"));
		wRadioButtonTool.click();
		
		// Enter Continents
		WebElement wContinentsDropDown = driver.findElement(By.id("continents"));
		Select select = new Select(wContinentsDropDown);
		select.selectByVisibleText("Antartica");
		
 		//Enter Selenium Commands
  		WebElement wSeleniumCommandsDropDown = driver.findElement(By.id("selenium_commands"));
 		Select select1 = new Select(wSeleniumCommandsDropDown);
 
 		//selecting commands
 		select1.selectByVisibleText("Browser Commands");
  		select1.selectByVisibleText("WebElement Commands");

		// Enter Selenium Commands using Multiselect
		
// 		WebElement wMultipleSelectDropDown = driver.findElement(By.id("selenium_commands") );
//		//Instantiated Select class
// 		Select Multiselect = new Select(wMultipleSelectDropDown);
// 		System.out.println(Multiselect.isMultiple());

		//  Photo Uploading
		WebElement wImageUpload  = driver.findElement(By.id("photo"));
		wImageUpload.sendKeys("C:\\Users\\admin\\Desktop\\photo3.jpg");

		//click on Download file
	   	 driver.findElement(By.linkText("Click here to Download File")).click();

		// click on Button
		driver.findElement(By.id("submit")).click();

	}

}
