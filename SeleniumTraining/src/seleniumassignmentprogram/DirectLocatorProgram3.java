package seleniumassignmentprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocatorProgram3 {
	static WebDriver driver;
	static String sDriverPath =System.getProperty("user.dir")+"//Drivers";

	static void FLaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//" );
		driver = new ChromeDriver();

	}

	public static void main(String[] args) {
		FLaunchBrowser() ;
		String sURL = "https://www.kluniversity.in/alumni/regform.aspx";
		driver.get(sURL);
		driver.manage().window().maximize();
		driver.findElement(By.id("txtRollNo")).sendKeys("123456");
		driver.findElement(By.id("txtDOB")).sendKeys("10/2/2001");
		// Personal Details
		WebElement wFileUploading = driver.findElement(By.id("FileUpload1"));
		wFileUploading.sendKeys("C:\\Users\\admin\\Desktop\\photo3.jpg");
				
		driver.findElement(By.id("txtFName")).sendKeys("Kanchan");
		driver.findElement(By.id("txtMName")).sendKeys("Rajendra");
		driver.findElement(By.id("txtLName")).sendKeys("Shende");
		driver.findElement(By.id("txtMail")).sendKeys("kanchanshende@gmail.com");
		driver.findElement(By.id("txtMobile")).sendKeys("2345677890");
		driver.findElement(By.id("txtAddress")).sendKeys("Indira Gandhi Nagar,Pune");
		driver.findElement(By.id("txtAadhaarNo")).sendKeys("123123123123");
		driver.findElement(By.id("txtPanNo")).sendKeys("1234AG2345");
		driver.findElement(By.id("txtGATE")).sendKeys("99");
		driver.findElement(By.id("txtOTitle")).sendKeys("Gate");
		driver.findElement(By.id("txtOSCORE")).sendKeys("123");
		driver.findElement(By.id("txtHSpe")).sendKeys("MBA");
		driver.findElement(By.id("txtHInst")).sendKeys("RTM institute of pune");
		driver.findElement(By.id("txtRSpe")).sendKeys("HR");
		driver.findElement(By.id("txtRArea")).sendKeys("Human Resources");
		driver.findElement(By.id("txtRInst")).sendKeys("COEP ,Pune");
		WebElement wRadioButtonYes = driver.findElement(By.id("rblPlacement_0"));
		wRadioButtonYes.click();
		driver.findElement(By.id("txtPresentOrg")).sendKeys("SGBAU,Amravati");
		driver.findElement(By.id("txtPresentPos")).sendKeys("Senior HR");
		driver.findElement(By.id("txtPreOrg1")).sendKeys("6 month of experience");
		driver.findElement(By.id("txtPrePos1")).sendKeys("junior engineer");
		driver.findElement(By.id("txtExpertise")).sendKeys("Java,Selenium");
		driver.findElement(By.id("txtDomain")).sendKeys("java");
		WebElement wCheckBox = driver.findElement(By.id("CheckBox1"));
		wCheckBox.click();
		driver.findElement(By.id("txtTDates")).sendKeys("20/4/2022");
		driver.findElement(By.id("txtSuggestion")).sendKeys("No Suggestion");
		driver.findElement(By.id("txtOther")).sendKeys("No");
		
		


	}

}
