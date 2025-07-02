package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Shiva/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dev.loadmiles.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nakure@yopmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test1234");
		driver.findElement(By.xpath("//input[@id='kc-login']")).click();
		
		
		driver.close();
		//driver.quit();
	}
	
}
