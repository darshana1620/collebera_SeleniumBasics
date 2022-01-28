package convertingTestCase;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendMailAndDelete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//test data

				String Testurl="https://mail.rediff.com/cgi-bin/login.cgi";
				String username="sumanthElfBatch@rediffmail.com";
				String password="Testing@123";
				String expectedSigninPageTitle="Rediffmail";
				String expectedHomePageTitle="Rediffmail";

				//Step 1:-- Open the browser Enter the URL 
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				System.out.println("Browser LAUNCHED successfully");
				driver.manage().window().maximize();
				System.out.println("Browser MAXIMIZED successfully");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(Testurl);

				String actualSigninPageTitle=driver.getTitle();
				if(actualSigninPageTitle.equals(expectedSigninPageTitle)) {
					System.out.println("login page is DISPLAYED successfully");
				}
				else
				{
					System.out.println("login page is not displayed successfully");
					}
				
				
				//step 2:-- enter user name into username text field

				WebElement usernameTextField = driver.findElement(By.id("login1"));
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

				// step 3:--enter password into password text field

				WebElement passwordTextField = driver.findElement(By.id("password"));
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
				
				//step 4:-- Click on signin button
				driver.findElement(By.name("proceed")).click();
				String actualHomePageTitle=driver.getTitle();
				if(actualHomePageTitle.equals(expectedHomePageTitle)) {
					System.out.println("Home Page is DISPLAYED successfully");
				}
				else {
					System.out.println("Home page is not DISPLAYED successfully");
				}
				
				//Step 5:-- Click on compose the mail
				driver.findElement(By.linkText("Write mail")).click();
				
				//step 6:-- to enter the mail id of receiver
		         WebElement receiversMailId = driver.findElement(By.id("TO_IDcmp2"));
				receiversMailId.sendKeys(username,Keys.ENTER);
				
				//step 7:-- to enter the subject of the mail
				 WebElement subject = driver.findElement(By.xpath("//input[contains(@class,'subject')]"));
					subject.sendKeys("Darshana");
					
				WebElement frameElement=driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
				Thread.sleep(2000);
				
				driver.switchTo().frame(frameElement);
				driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("mail sent successfully");
				
				
				driver.switchTo().defaultContent();
				driver.findElement(By.linkText("Send")).click();
				Thread.sleep(2000);
				for(;;) {
					try {
						driver.findElement(By.xpath("//span[text()='Darshana']/..//cite[@title='Select mail']")).click();
						driver.findElement(By.xpath("//span[text()='Delete' and @class='rd_fil_del']")).click();
						driver.findElement(By.xpath("//button[text()='Ok']")).click();
						break;
					}
					catch(NoSuchElementException e) {
						driver.navigate().refresh();
					}
				}
				
			
				
				
	}			
	}




