import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxDriver {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","E:\\Project\\selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
}
}
