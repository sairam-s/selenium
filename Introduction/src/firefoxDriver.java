import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Project\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.nz");
		System.out.println(driver.getTitle());
		/*
		 * driver.findElement(By.id("email")).sendKeys("test code");
		 * driver.findElement(By.name("pass")).sendKeys("12345");
		 * driver.findElement(By.linkText("Forgotten account?")).click();
		 */
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.findElement(By.id("resultStats")).isDisplayed();
		// driver.findElement(By.linkText("Images")).click();
		System.out.println(driver.findElement(By.cssSelector("a[href*='accounts.google.com']")).getText());

	}
}
