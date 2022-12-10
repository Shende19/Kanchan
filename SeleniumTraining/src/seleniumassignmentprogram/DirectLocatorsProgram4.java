package seleniumassignmentprogram;

import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DirectLocatorsProgram4 {
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") +  "//Drivers//";

	static void fLaunchingBrowser()
	{
		System.setProperty("webdriver.chrome.driver",  sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		fLaunchingBrowser();
		String sURL = "https://trytestingthis.netlify.app/";
		driver.get(sURL);
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Kanchan");
		driver.findElement(By.id("lname")).sendKeys("Shende");
		WebElement wSelectGender = driver.findElement(By.id("female"));
		wSelectGender.click();
		WebElement wSelectOption = driver.findElement(By.id("option"));
		Select select = new Select(wSelectOption);
		select.selectByValue("option 1");
		// identifying DropDown
		WebElement wMultipleSelectOption = driver.findElement(By.id("owc"));
		//Create object of select class
		Select select1 = new Select(wMultipleSelectOption);
		//is multiple option
		System.out.println(select1.isMultiple());
		select1.selectByIndex(1);
		select1.selectByVisibleText("Option 2");
		//get first selected option in dropdown
		WebElement wFirstSelectedOption = select1.getFirstSelectedOption();
		System.out.println(wFirstSelectedOption.getText());
		//get all selected option in dropdown
		java.util.List<WebElement> wAllSelectedOption = select1.getAllSelectedOptions();
		System.out.println(wAllSelectedOption.size());
		select1.selectByValue("option 3");
		//select checkbox
//		WebElement wcheckbox = driver.findElement(By.id("moption"));
//		wcheckbox.click();
//		wcheckbox.click();
		WebElement wcheckbox1 = driver.findElement(By.name("option2"));
		wcheckbox1.click();
		//select dropdown
		WebElement wDropdown = driver.findElement(By.name("Options")); 
		wDropdown.sendKeys("Banana");
		wDropdown.click();
		//select fav color
		WebElement wFavColorDropdown = driver.findElement(By.id("favcolor"));    
		wFavColorDropdown.click();

		/* //select date
 		   String scssSelector1  = "input#day ";
 		   driver.findElement(By.cssSelector(scssSelector1)).sendKeys("10/10/2001");

		  //select scroll option     
		   String scssSelector = "input#a";
		   driver.findElement(By.cssSelector(scssSelector)).click();  
		 */
		//select Range
		String Xpath = "//input[@id='quantity']";
		driver.findElement(By.xpath(Xpath )).sendKeys("1");
		//file choosen option
		WebElement wFileChoosen = driver.findElement(By.id("myfile"));
		wFileChoosen.sendKeys("C:\\Users\\admin\\Desktop\\photo3.jpg");
		//click on the messege box
		driver.findElement(By.name("message")).click();
		//click on submit button
		WebElement wSubmitButton = driver.findElement(By.tagName("button"));
		wSubmitButton.click();
		

	}

}
