import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	protected WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Project\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void isGoogleSearchPageOpened(){
	    driver.get("https://google.co.nz");
	    assertEquals("Google", driver.getTitle());
	}

	@Test
	public void isGoogleReturningSearch() {
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		assertTrue(driver.findElement(By.id("resultStats")).isDisplayed());
	}

	@Test
	public void areGoogleSearchCategoriesAvailable() {
		assertTrue(driver.findElement(By.linkText("Images")).isDisplayed());
		assertTrue(driver.findElement(By.linkText("Videos")).isDisplayed());
		assertTrue(driver.findElement(By.linkText("Maps")).isDisplayed());
	}

	@Test
	public void isTheSearchPaginated() {
		assertTrue(driver.findElement(By.linkText("Next")).isDisplayed());
	}

	@Test
	public void isGoogleSignInPresent() {
		assertEquals("Sign in", driver.findElement(By.cssSelector("a[href*='accounts.google.com']")).getText());
	}

	@After
	public void closeBrowser() {
		driver.quit();
	}
}
