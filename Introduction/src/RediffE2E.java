import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffE2E {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("World");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		driver.close();
		}

}
