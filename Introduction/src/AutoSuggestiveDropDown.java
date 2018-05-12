import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.apsrtconline.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("hyd");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		System.out.println("Try getting the suggested place but fail: " + driver.findElement(By.id("fromPlaceName")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		int i=0;
		while(!text.equalsIgnoreCase("HYDERABAD MGBS"))
		{
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			
			System.out.println("Getting the text with javascript and succeeded: " + text);
			if(i>5){
			break;
			}
		}
		
		if(i>5){
			System.out.println("Text not found");
		}else{
		System.out.println("Element found");
		}
		
	}

}
