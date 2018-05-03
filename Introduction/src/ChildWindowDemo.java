import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChildWindowDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/");
		driver.findElement(By.linkText("Help")).click();
Set <String> winId = driver.getWindowHandles();
Iterator<String> it = winId.iterator();
String parentId = it.next();
String helpChildId = it.next();
driver.switchTo().window(parentId);
System.out.println("Currently on Parent Window: " + driver.getTitle());

driver.switchTo().window(helpChildId);
System.out.println("Switched to Child Window: " + driver.getTitle());

System.out.println("Check the text: " + driver.findElement(By.xpath("//a[@class='search-title']")).getText());

driver.switchTo().window(parentId);
System.out.println("Switched back to Parent Window: " + driver.getTitle());

		
	}

}
