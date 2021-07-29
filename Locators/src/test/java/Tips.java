import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tips {

	@Test()
	public void ticls() {
	
			      
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohanapriya_p\\Downloads\\chromedriver_win32 (3)\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			        
			        driver.get("http://www.leafground.com/pages/tooltip.html");
			        
			        WebElement el1=driver.findElement(By.id("age"));
			        
			        String msg=el1.getAttribute("title");
			        
			        
			        System.out.println(msg);
			        
			        
			      
			      
			  }
			
			 
		
	}

