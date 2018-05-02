import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hello world").build().perform();

	}

}
