package convertingTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestCaseInstagram {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		//test data

		String Testurl="https://www.instagram.com/";
		String username="darshana__2302";
		String password="darsh1234";
		String expectedLoginPageTitle="Instagram";
		String expectedHomePageTitle="Instagram";

		//Step 1:Open the browser Enter the URL 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser LAUNCHED successfully");
		driver.manage().window().maximize();
		System.out.println("Browser MAXIMIZED successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Testurl);

		String actualLoginPageTitle=driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("login page is DISPLAYED successfully");
		}
		else
		{
			System.out.println("login page is not displayed successfully");
		}

		//step 2:- enter user name into username text field

		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		String actualUsernameEntered=usernameTextField.getAttribute("value");
		if(actualUsernameEntered.equals(username)) {
			System.out.println("Username is ENTERED successfully");
		}
		else
		{
			System.out.println("username is not entered successfully");
		}

		// step 3:-enter password into password text field

		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		String actualpasswordEntered=passwordTextField.getAttribute("value");
		if(actualpasswordEntered.equals(password)) {
			System.out.println("password is ENTERED successfully");
		}
		else
		{
			System.out.println("password is not entered successfully");
		}

		//step 4:- Click on Login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle=driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Home Page is DISPLAYED successfully");
		}
		else {
			System.out.println("Home page is not DISPLAYED successfully");
		}



	}

}


