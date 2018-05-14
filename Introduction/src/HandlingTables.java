import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"http://www.espncricinfo.com/series/8048/scorecard/1136606/chennai-super-kings-vs-sunrisers-hyderabad-46th-match-indian-premier-league-2018");
		WebElement scorecardInningsTwo = driver.findElement(By.id("gp-inning-01"));
		System.out.println(scorecardInningsTwo
				.findElements(By.cssSelector("div[class='scorecard-section batsmen'] [class='flex-row']")).size());
		int count = scorecardInningsTwo
				.findElements(By.cssSelector("div[class='scorecard-section batsmen'] [class='flex-row']")).size();

		for (int i = 0; i < count - 4; i++) {
			WebElement score = scorecardInningsTwo
					.findElements(By.cssSelector("div[class='scorecard-section batsmen'] [class='flex-row']")).get(i);
			System.out
					.println(score.findElement(By.cssSelector("div[class='wrap batsmen'] div:nth-child(3)")).getText());

		}

		System.out.println("Extras: "
				+ driver.findElement(By.xpath("(//div[text() ='Extras'])[2]/following-sibling::div")).getText());
	}

}
