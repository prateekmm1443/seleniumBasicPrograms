package Demo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch browser
		WebDriver driver = new ChromeDriver();

		// goto url
		driver.get("https://www.linkedin.com/home?original_referer=https%3A%2F%2Fwww.linkedin.com%2Fnotifications%2F");

		// maximize window
		driver.manage().window().maximize();

		// Wait for 5 seconds
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		

	}

}
