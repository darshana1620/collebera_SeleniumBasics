package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//adding 1st product
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']")).click();
		addToCart(driver,"Buy Apple iPhone 12 Mini(64 GB Storage) Online at Best Priceon Flipkart");
		
		//adding 2nd product
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("mi",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Redmi 9A (SeaBlue, 32 GB)']")).click();
		addToCart(driver,"MI Redmi 9A ( 32 GB Storage, 2 GB RAM ) Online at Best Price On Flipkart");
		
		
		//adding 3rd product
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("mi",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='vivo V23 Pro 5G (Stardust Black, 256 GB)']")).click();
		addToCart(driver,"vivo V23 Pro 5G(256 GB Storage,12 GB RAM ) Online at Best Price On Flipkart");
		Thread.sleep(2000);
	}

	private static void addToCart(ChromeDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}
}
		
			