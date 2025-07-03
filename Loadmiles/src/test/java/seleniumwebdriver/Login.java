package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeBrowser();
		driver.get("https://qa.loadmiles.com/");
		String act_title = driver.getTitle();
		System.out.print(act_title);
		if(act_title.equals("Load Miles")) {
			System.out.print("Test Passed");
		}else {
			System.out.print("Test failed");
		}
		
		driver.close();
		
	}

}
