package mainPackage;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import appFunction.logInSuccessful;
import utility.constant;
import utility.excelUtil_01;

public class mainClass {

	public WebDriver driver; 
	@BeforeMethod
	public void beforeMethod() throws Exception {	 
		excelUtil_01.setExcelFile(constant.Path_TestData + constant.File_LogInData,"Sheet1");	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VUONGCD\\workspace\\testShopee\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(constant.URL);
	}
	@Test
	public void Test() throws Exception {
		//Verify user can login with a valid account
		driver.get(constant.URL);
		logInSuccessful.Execute(driver);
		boolean isLogInSuccessful = driver.getPageSource().contains("Find a Flight"); 
		assertTrue(isLogInSuccessful);
		if(isLogInSuccessful = true){
			System.out.println("Login successful.");
		}			
	}
	@AfterMethod
	public void AfterMethod() throws Exception {
//		driver.close();
	}
}
