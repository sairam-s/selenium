import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeOptimizationAndChildWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement footer = driver.findElement(By.id("gf-BIG")); // Limiting
																	// Webdriver
																	// scope
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement firstFooterCol = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(firstFooterCol.findElements(By.tagName("a")).size());
		// Click on links and verify if the links are active
		int linkCount = firstFooterCol.findElements(By.tagName("a")).size();
		for (int i = 1; i < linkCount; i++) {
			String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstFooterCol.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
		}
		Set<String> winId = driver.getWindowHandles();
		Iterator<String> it = winId.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
