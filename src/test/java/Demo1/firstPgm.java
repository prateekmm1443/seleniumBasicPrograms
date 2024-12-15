package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstPgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// launch browser
		WebDriver driver = new ChromeDriver();

		// goto url
		driver.get("https://demo.nopcommerce.com/");

		// maximize window
		driver.manage().window().maximize();

		// Wait for 5 seconds
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// clicking on register page
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

		// selecting gender
		// Locate the radio element
		WebElement radio = driver.findElement(By.xpath("(//input[@name='Gender'])[1]"));

		// Check if the radio is already selected
		if (!radio.isSelected()) {
			// Select the checkbox
			radio.click();
		}

		// Verify that the checkbox is selected
		if (radio.isSelected()) {
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is not selected");
		}

		// first name
		driver.findElement(By.xpath("(//input[@data-val='true'])[1]")).sendKeys("test");

		// lastname
		driver.findElement(By.xpath("(//input[@data-val='true'])[2]")).sendKeys("last");

		// Wait for 5 seconds
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/// selecting dob
		// Locate the day dropdown element
		WebElement dayDropdown = driver.findElement(By.cssSelector("select[name='DateOfBirthDay']"));

		// locate the month
		WebElement monthDropdown = driver.findElement(By.cssSelector("select[name='DateOfBirthMonth']"));

		// Locate the year dropdown element
		WebElement yearDropdown = driver.findElement(By.cssSelector("select[name='DateOfBirthYear']"));

		// Create Select instances
		Select selectDay = new Select(dayDropdown);
		Select selectMonth = new Select(monthDropdown);
		Select selectYear = new Select(yearDropdown);

		// Select the day (e.g., 15)
		selectDay.selectByVisibleText("15");

		// Select the month (e.g., March)
		selectMonth.selectByVisibleText("March");

		// Select the year (e.g., 1990)
		selectYear.selectByVisibleText("1990");

		// entering email

			

		// entring company name
		driver.findElement(By.cssSelector("input[data-val-regex='Wrong email']")).sendKeys("wipro");

		// checking checkbox
//		// Locate the radio element
//		WebElement checkbox = driver.findElement(By.xpath("input[type='checkbox']"));
//
//		// Check if the radio is already selected
//		if (!checkbox.isSelected()) {
//			// Select the checkbox
//			checkbox.click();
//		}

		// entering pwd
		driver.findElement(By.cssSelector("#Password")).sendKeys("prateek@gmail.com");

		// conf pwd
		driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("test123@");

		// clicking registerbutton
		driver.findElement(By.cssSelector("button[name='register-button']")).click();

		// Wait for 5 seconds
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Close the browser
		driver.quit();

	}

}
