import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxDriver {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","E:\\Project\\selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
	driver.findElement(By.id("email")).sendKeys("test code");
	driver.findElement(By.name("pass")).sendKeys("12345");
	driver.findElement(By.linkText("Forgotten account?")).click();
	
}
}
