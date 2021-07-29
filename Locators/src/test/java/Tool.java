import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tool {

	@Test()
	public void ele() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohanapriya_p\\Downloads\\chromedriver_win32 (3)\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		System.out.println("demoqa webpage Displayed");
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//button[@type='button']"));
		element.click();
		
		actions.moveToElement(element).build().perform(); 

		 WebElement toolTip = driver.findElement(By.id("toolTipButton")); 
	
		 String toolTipText = toolTip.getText();
		 System.out.println("toolTipText-->"+toolTipText); 
		 if(toolTipText.equalsIgnoreCase("texFieldToolTopContainer")){ 
			 System.out.println("Pass* : Tooltip matching expected value");
			 }else{
			 System.out.println("Fail : Tooltip NOT matching expected value"); 
			 } 
		 driver.close();
	}
}
