import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class IEDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","E:\\Project\\selenium\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
