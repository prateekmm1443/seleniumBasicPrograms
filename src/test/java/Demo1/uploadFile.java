package Demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

	public static void main(String[] args) throws AWTException {

		// launch browser
		WebDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();

		// Navigate to LinkedIn
		driver.get("https://www.linkedin.com/login");

//		// Wait for 5 seconds
//		try {
//			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		// Wait for the home page to load
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Log in to LinkedIn
		driver.findElement(By.id("username")).sendKeys("iamprateek0997@gmail.com");
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		passwordField.sendKeys("Iamprateek");
		loginButton.click();

		// click on home button
		driver.findElement(By.cssSelector("li-icon[type='home-active']")).click();

		// click on start post button
		driver.findElement(By.xpath("//span[contains(@class,'truncate block')]")).click();

		// click on upload from media button
		driver.findElement(By.xpath("(//button[@class='share-promoted-detour-button'])[1]")).click();

		// Use Robot class to handle file upload
		String filePath = "C:\\Users\\PRATEEK\\Downloads\\IMG_20240609_224832.jpg"; // Update with the actual file path
		Robot robot = new Robot();
		robot.setAutoDelay(2000);

		// Copy the file path to the clipboard
		StringSelection stringSelection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		// Press CTRL + V to paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Press ENTER to confirm the file upload
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Wait for the file to be uploaded (time may vary)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click on next button
		driver.findElement(By.xpath("(//button[@type='button']//span)[2]")).click();

		// write some text
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']//p[1]")).sendKeys("Check out this new video/image!");

		// Click the post button
		WebElement postButton = driver.findElement(By.xpath("//span[text()[normalize-space()='Post']]"));
		postButton.click();
		
		System.out.println("uploaded successfully");

		// Close the browser
		driver.quit();

	}

}
