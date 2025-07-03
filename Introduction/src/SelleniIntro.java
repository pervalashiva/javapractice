import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; //ctrl+shift+O

public class SelleniIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Shiva/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dev.loadmiles.com");
		System.out.println(driver.getTitle());
		driver.close();
		//driver.quit();
	}

	

}
