package pomRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get(null)
	LoginPage loginPage=new LoginPage(driver);
	loginPage.getUsernameTextField().sendKeys(username);
	loginPage.getPasswordTextField().sendKeys(password);
	loginPage.getLogin().click();
	
	
	

}
