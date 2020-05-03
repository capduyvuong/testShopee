package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logInPage {
	static WebElement element = null;

	public static WebElement usernameTextbox(WebDriver driver)
	{
		element = driver.findElement(By.name("userName"));
        return element;
	}
	public static WebElement passwordTextbox(WebDriver driver)
	{
		element = driver.findElement(By.name("password"));
        return element;
	}
	public static WebElement signInButton(WebDriver driver)
	{
		element = driver.findElement(By.name("login"));
        return element;
	}
}