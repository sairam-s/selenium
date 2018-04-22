import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		/*driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();*/
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hello");
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("123456");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
	}
}
