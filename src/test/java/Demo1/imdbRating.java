package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class imdbRating {

	public static void main(String[] args) {

		// launch browser
		WebDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();

		// Navigate to LinkedIn
		driver.get(" https://www.imdb.com/chart/top");

		// Wait for 5 seconds
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Locate the dropdown element
		WebElement dropdown = driver.findElement(By.cssSelector("#sort-by-selector"));

		// dropdown.click();

		// Initialize Select class
		Select select = new Select(dropdown);

		// Select by visible text
		select.selectByVisibleText("IMDb rating");

		// Select by index
		// select.selectByIndex(1);

		// Find the highest rated movie title and rating
		WebElement topMovie = driver.findElement(By.xpath("//h3[text()='1. The Shawshank Redemption']"));

		// Get the text
		String topMovieTitle = topMovie.getText();
		
		System.out.println(topMovieTitle);

		// Assert the title and rating
		Assert.assertEquals(topMovieTitle, "1. The Shawshank Redemption']");

		System.out.println("Successfull");
		driver.quit();

	}

}
