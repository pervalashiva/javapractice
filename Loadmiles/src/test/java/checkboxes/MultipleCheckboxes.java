package checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
		
       List<WebElement> checkboxes =   driver.findElements(By.xpath("//input[@class = 'form-check-input' and @type='checkbox']"));
        
       for(int i =0; i < checkboxes.size(); i++)
       {
    	   checkboxes.get(i).click();
       }
		
	}

}
