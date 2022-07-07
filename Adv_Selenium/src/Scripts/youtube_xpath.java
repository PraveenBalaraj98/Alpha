package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("KGF2");
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
	}

}
