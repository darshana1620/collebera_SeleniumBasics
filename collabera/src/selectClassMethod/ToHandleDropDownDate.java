package selectClassMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDownDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayListBox = driver.findElement(By.id("day"));
		WebElement monthListBox = driver.findElement(By.id("month"));
		WebElement yearListBox = driver.findElement(By.id("year"));
		
		Select dayselect=new Select(dayListBox);
		System.out.println(dayselect.isMultiple());
		System.out.println("------------");
		List<WebElement> dayListBoxOptions = dayselect.getOptions();
		for(WebElement ele:dayListBoxOptions) {
			System.out.println(ele.getText());
			
		}
		System.out.println("------------");
		Select monthselect=new Select(monthListBox);
		System.out.println(monthselect.isMultiple());
		System.out.println("------------");
		List<WebElement> monthListBoxOptions = monthselect.getOptions();
		for(WebElement ele1:monthListBoxOptions) {
			System.out.println(ele1.getText());
		}
		System.out.println("------------");
		Select yearselect=new Select(yearListBox);
		System.out.println(yearselect.isMultiple());
		

	}

}
