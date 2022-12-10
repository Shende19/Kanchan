package launchingbrowseroperation;

 
import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class IsSelectMethod {
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

		// Handling Date of birth

		WebElement wDateOfBirth = driver.findElement(By.id("txtDOB"));
		wDateOfBirth.click();

		// Handling DropDown for Month

//		WebElement wMonthDropdown = driver.findElement(By.className("ui-datepicker-month"));
//		Select select = new Select(wMonthDropdown);
//		select.selectByVisibleText("Jan");

		// Handling DropDown for Year

//		WebElement wYearDropdown = driver.findElement(By.className("ui-datepicker-year"));  
//		Select select1 = new Select(wYearDropdown);
//		select1.selectByValue("1999");


		 //selecting the checkbox
		WebElement wCheckbox = driver.findElement(By.id("CheckBox1"));
		System.out.println(wCheckbox.isSelected());
		wCheckbox.click();
		System.out.println("After click :" +wCheckbox.isSelected());

		//Deselecting checkbox  
//		wCheckbox.click();

		//selecting radio button
		WebElement wRadioButtonYes = driver.findElement(By.id("rblPlacement_0"));
		wRadioButtonYes.click();

		//deselecting radio button  
//		WebElement wRadioButtonNo = driver.findElement(By.id("rblPlacement_1"));
//		wRadioButtonNo.click();
//		wRadioButtonNo.clear();
//
		//file uploading
		WebElement wFileUpload = driver.findElement(By.id("FileUpload1"));
		wFileUpload.sendKeys("C:\\Users\\admin\\Desktop\\photo3.jpg");

//		//working with submit button
  		 WebElement wSubmitButton = driver.findElement(By.id("Button1"));
  		 wSubmitButton.click();
  		
//		 //Handling DropDown for Country
 		 
//  		 WebElement DropDown = driver.findElement(By.id("ddlHCountry"));
//   		 Select select1 = new Select(DropDown);
//   		 select1.selectByValue("Afghanistan");
//  		 select1.selectByVisibleText("Indonesia");
//  		 select1.selectByIndex(4);
		 
 		 //Handling DropDown for Year of Joining
 		 
//   		 WebElement wDropDownYOJ = driver.findElement(By.id("ddlBatch"));
//   		 Select select2 = new Select(wDropDownYOJ);
//   		 select2.selectByValue("1997"); 
//  		 select1.selectByVisibleText("1997");
//  		 select1.selectByIndex(3);
 		
 		 // Handling DropDown for Branch
 		 
//  		 WebElement wDropDownBranch = driver.findElement(By.name("ddlBranch"));
//  		 Select select3 = new Select(wDropDownBranch);
//  		 select3.selectByIndex(5);
// 		 select3.selectByValue("CE");
// 		 select3.selectByVisibleText("Mechanical Engineering");
//				 
 		 //Handling DropDown for Higher Studies
 	 
//  		 WebElement wDropDownHigherStudies = driver.findElement(By.name("ddlHStudies"));
//  		 Select select4 = new Select(wDropDownHigherStudies);
// 		 select4.selectByValue("Select");
// 		 select4.selectByIndex(0);
// 		 select4.selectByVisibleText("MS");
 		 
 		 //Handling DropDown for Research
 	 
//  		 WebElement wDropDownResearch = driver.findElement(By.id("ddlResearch"));
// 		 Select select5 = new Select(wDropDownResearch);
// 		 select5.selectByIndex(2);
// 		 select5.selectByValue("M.Phil");
// 		 select5.selectByVisibleText("Ph.D");
 		 
 		/* //GetOptions()
 		 
  		 List<WebElement> allOptions = select.getOptions();
  		 System.out.println(allOptions.size());
  		 for(int i=0; i<allOptions.size(); i++)
 		 {
 			  
 		System.out.println("Dropdown Options:" +  allOptions.get(i).getText()+"\n");
  		 }
 		 
// 		 isMultiple()
 		 
  		 System.out.println(select.isMultiple());
 		 select.selectByValue("Afghanistan");
    	
 		//Using FirstSelectedElement
  		 WebElement firstSelectedElement = select.getFirstSelectedOption();
  		 System.out.println(firstSelectedElement.getText());
 		*/
 		//Using AllSelectedOption
// 		 List<WebElement> allOption = select.getAllSelectedOptions();
// 		 System.out.println(allOption.size());
//  		 select.selectByValue("Angola");
 		 
 		 //Deselecting Operation
 		  
// 		 select.deselectByValue("Afghanistan");
// 		 select.deselectByIndex(1);
// 		 select.deselectByVisibleText("Angola");
// 		 select.deselectAll();
 		 
 		 //Get the first selected option of the dropdown
 		 
//  		 WebElement firstSelectedOption = select.getFirstSelectedOption();
//  		 System.out.println(firstSelectedOption.getText());
//  	  		 
 		 
 		 
 		
 		 
	}

}
