package appFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.logInPage;
import utility.excelUtil_01;

public class logInSuccessful {
	public static void Execute(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
		// This is to get the values from Excel sheet, passing parameters (Row
		// num &amp; Col num)to getCellData method
		String username = excelUtil_01.getCellData(1, 1);
		String password = excelUtil_01.getCellData(1, 2);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement usernameTitle;
		usernameTitle = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/font")));
		logInPage.usernameTextbox(driver).sendKeys(username);
		logInPage.passwordTextbox(driver).sendKeys(password);
		logInPage.signInButton(driver).click();
	}
}
