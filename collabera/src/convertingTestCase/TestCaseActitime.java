package convertingTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestCaseActitime {

	private static Object explicitWait;

	public static void main(String[] args) {
		//test data

		String Testurl="https://demo.actitime.com/login.do";
		String username="admin";
		String password="manager";
		String expectedLoginPageTitle="actiTIME - Login";
		String expectedHomePageTitle="actiTIME -  Enter Time-Track";

		//Step 1:Open the browser Enter the URL 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser MAXIMIZED successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Testurl);
		
		String actualLoginPageTitle=driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("login page is dispalyed successfully");
		}
		else
		{
			System.out.println("login page is not displayed successfully");
		}
			
		//step 2:- enter user name into username text field
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		String actualUsernameEntered=usernameTextField.getAttribute("value");
		if(actualUsernameEntered.equals(username)) {
			System.out.println("Username is entered successfully");
		}
		else
		{
			System.out.println("username is not entered successfully");
		}
		
		// step 3:-enter password into password text field
		
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		String actualpasswordEntered=passwordTextField.getAttribute("value");
		if(actualpasswordEntered.equals(password)) {
			System.out.println("password is entered successfully");
		}
		else
		{
			System.out.println("password is not entered successfully");
		}
		 
		//step 4:- Click on Login button
		driver.findElement(By.id("loginButton")).click();
		//explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle=driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Home Page is displayed successfully");
		}
		else {
			System.out.println("Home page is not displayed successfully");
		}



	}

}
