import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tipclsss {

	@Test()
	public void ttcls() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohanapriya_p\\Downloads\\chromedriver_win32 (3)\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		System.out.println("website loaded");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("//input[@title='We ask for your age only for statistical purposes.']"));
		actions.moveToElement(ele1).perform();
		WebElement toolTip = driver.findElement(By.xpath("//input[@title='We ask for your age only for statistical purposes.']"));
		String toolTipText = toolTip.getText();
		System.out.println("toolTipText-->"+toolTipText);
		if(toolTipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")){
			System.out.println("Pass");
			}else{
			System.out.println("Fail");
			}
		driver.close();


	}
}
