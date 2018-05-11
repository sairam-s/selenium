import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericCalendarHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.co.nz/");
		driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
		// driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][1]/table/caption"));

		while (!driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][1]/table/caption")).getText()
				.contains("Jan")) {
			// System.out.println(driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][1]/table/caption")).getText());
			driver.findElement(
					By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']"))
					.click();
		}

		int count = driver
				.findElements(By
						.xpath("//tbody[@class='datepicker-cal-dates']/tr/td[@class='datepicker-day-number notranslate']"))
				.size();
		// System.out.println(count);
		for (int i = 1; i < count; i++) {
			String date = driver.findElements(By.className("datepicker-cal-date")).get(i).getText();
			if (date.equals("23")) {
				driver.findElements(By.className("datepicker-cal-date")).get(i).click();
				break;
			}
		}
	}

}
