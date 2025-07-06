package Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loctares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.loadmiles.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("shiva");
		//id
		//boolean logoDisplay = 
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement img = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Loadmiles']")));


		
		//System.out.println(logoDisplay);
		
		//linktext
		
		//driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.partialLinkText(null));
		
		//classname
//		List<WebElement> headerLinks = (List<WebElement>) driver.findElement(By.className("list-inline-item"));
//		System.out.println("total link:" + headerLinks.size());
//		//tagname
		//List<WebElement> headerLinks = driver.findElements(By.tagName("a"));
		//System.out.orintln("Total number  of links" + links.Size());
		
		driver.close();
		
	}

}
