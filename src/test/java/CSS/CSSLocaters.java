package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocaters {
	

    public static void main(String[] args) {
        // Optional: Set the path to chromedriver if needed
        // System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        //id
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tshirts");
        //class
        
        driver.findElement(By.cssSelector(".search-Box-text")).sendKeys("tshirt");
        
        
    }
	
}
