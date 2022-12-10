package webelementoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormOperation {
	
	static WebDriver driver;
	static String sDriverPath =System.getProperty("user.dir") + "\\Drivers\\";

	public static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "\\chromedriver.exe\\" );
		driver = new ChromeDriver();
		
	}

	public static void main(String[] args) {

		fLaunchBrowser();
		String sURL = "https://www.kluniversity.in/alumni/RegForm.aspx";
		driver.get(sURL);
		driver.manage().window().maximize();
		
		/*//First Page of information
		driver.findElement(By.name("txtRollNo")).sendKeys("123456");
		
		//Handling DropDown for Year of Joining 
		WebElement wDropDownYOJ = driver.findElement(By.id("ddlBatch"));
		Select select = new Select(wDropDownYOJ);
		select.selectByValue("1997"); 
//		select.selectByVisibleText("1998");
//		select.selectByIndex(3);

		 // Handling DropDown for Branch
		WebElement wDropDownBranch = driver.findElement(By.name("ddlBranch"));
		Select select2 = new Select(wDropDownBranch);
		select2.selectByIndex(5);
// 		select2.selectByValue("CE");
// 		select2.selectByVisibleText("Mechanical Engineering");
  	
		// Select Date Of Birth
		WebElement wDateOfBirth = driver.findElement(By.id("txtDOB"));
 		wDateOfBirth.click();
 		
		//Handling Month DropDown
  		WebElement wMonthDropDown = driver.findElement(By.className("ui-datepicker-month"));
  		Select selectMonth = new Select(wMonthDropDown);
  		selectMonth.selectByVisibleText("Jan");
 		
 		// Handling DropDown for Year
  		WebElement wYearDropdown = driver.findElement(By.className("ui-datepicker-year"));  
  		Select selectYear = new Select(wYearDropdown);
  		selectYear.selectByValue("1999");

  		//Handling Date byUsing XPath
    	String sXpath = "//a[text()='20']";
    	driver.findElement(By.xpath(sXpath)).click();
		//Handling Date by Using CSSSelector
  		String scssSelector = ".ui-datepicker-calendar>tbody>tr:nth-of-type(4)>td:nth-of-type(4)";
  		driver.findElement(By.cssSelector(scssSelector )).click();
  		 
  		//File Uploading
  		WebElement wFileUpload = driver.findElement(By.id("FileUpload1"));
		wFileUpload.sendKeys("C:\\Users\\admin\\Desktop\\photo3.jpg");
*/
		/*//Personal Details
		driver.findElement(By.id("txtFName")).sendKeys("Kanchan");
		driver.findElement(By.id("txtMName")).sendKeys("Rajendra");
		driver.findElement(By.id("txtLName")).sendKeys("Shende");
		driver.findElement(By.name("txtMail")).sendKeys("kanchanrshende@gmail.com");
		driver.findElement(By.id("txtMobile")).sendKeys("8888888888");
		driver.findElement(By.id("txtAddress")).sendKeys("Karve nagar, pune");
		
		//Handling DropDown for Country
 		 WebElement DropDown = driver.findElement(By.id("ddlCountry"));
 		 Select selectCountry = new Select(DropDown);
 		 selectCountry.selectByValue("Afghanistan");
//		 selectCountry.selectByVisibleText("Indonesia");
//		 selectCountry.selectByIndex(4);
 		 
 		 //Adhar Card and Pan Card
 		 driver.findElement(By.name("txtAadhaarNo")).sendKeys("123412341234");
 		 driver.findElement(By.id("txtPanNo")).sendKeys("KHEP512345");
 		 
 		//Handling DropDown for Higher Studies 
 		 WebElement wDropDownHigherStudies = driver.findElement(By.name("ddlHStudies"));
 		 Select select4 = new Select(wDropDownHigherStudies);
// 		 select4.selectByValue("Select");
//		 select4.selectByIndex(0);
		 select4.selectByVisibleText("MS");
		 
		 driver.findElement(By.id("txtGRE")).sendKeys("90");
		 driver.findElement(By.id("txtOTitle")).sendKeys("GATE");
		 driver.findElement(By.id("txtHSpe")).sendKeys("HR");
 		 driver.findElement(By.id("txtRArea")).sendKeys("Marketing");
 		 driver.findElement(By.id("txtRInst")).sendKeys("SGBAU");
		 
  		//Handling DropDown Name of the country 
		 WebElement wDropDownNameOfTheCountry = driver.findElement(By.id("ddlRCountry"));
		 Select select5 = new Select(wDropDownNameOfTheCountry);
		 select5.selectByValue("Afghanistan");
  		*/
		 //Handling toggle switch or radio button
		  WebElement wRadioButtonYes = driver.findElement(By.id("rblPlacement_0"));
		  wRadioButtonYes.click();
		  
		  
  		
  		

	}

}
