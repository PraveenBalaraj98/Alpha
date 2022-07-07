package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_like {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
	
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("KGF2");
		
		driver.findElement(By.xpath("//button[@ id='search-icon-legacy']")).click();
		
		driver.findElement(By.xpath("//div[@class='text-wrapper style-scope ytd-video-renderer']")).click();
		
		//yt-formatted-string[@id="text" and @class='style-scope ytd-toggle-button-renderer style-text']
		driver.findElement(By.xpath("//yt-icon-button[@id='button' and @class='style-scope ytd-toggle-button-renderer style-text']")).click();
		
		driver.close();

	}

}
