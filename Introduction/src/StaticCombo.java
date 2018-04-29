import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticCombo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dropdown")).click();
		Select s = new Select(driver.findElement(By.id ("dropdown")));
		s.selectByVisibleText("Option 2");
		s.selectByValue("2");
		s.selectByIndex(1);
		
		
		
	}

}
