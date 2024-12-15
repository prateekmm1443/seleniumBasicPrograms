package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondpgm {

	public static void main(String[] args) {

		// launch browser
		WebDriver driver = new ChromeDriver();

		// goto url
		driver.get("https://in.bookmyshow.com/explore/home/chennai");

		// maximize window
		driver.manage().window().maximize();

		// Wait for 5 seconds
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Find all anchor elements
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Loop through each link and print the URL and text
		for (WebElement link : links) {
			System.out.println("Text: " + link.getText());
			System.out.println("URL: " + link.getAttribute("href"));
		}

		// Close the browser
		driver.quit();
	}

}
