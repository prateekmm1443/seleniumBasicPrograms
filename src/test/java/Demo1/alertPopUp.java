package Demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopUp {

	public static void main(String[] args) {

		// launch browser
		WebDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();

		// Navigate to LinkedIn
		driver.get("https://web-locators-static-site-qa.vercel.app/Alerts");

		// Wait for 5 seconds
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// clink on button which gives u pop up first option
		driver.findElement(By.xpath("//p[text()='Show Alert']")).click();

		// Switch to alert
		Alert alert = driver.switchTo().alert();

		// Wait for 5 seconds
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Accept the alert
		alert.accept();

		// 2nd option
		driver.findElement(By.xpath("//p[text()='Show Agreement']")).click();

		// Wait for 5 seconds
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		alert.dismiss();

		// 3rd
		driver.findElement(By.xpath("//p[text()='Add Remarks']")).click();
		// Wait for 5 seconds
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Send text to the alert
		alert.sendKeys("Iamgood");

		// Accept the alert
		alert.accept();

		// Wait for 5 seconds
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Executed successfully");
		// exit from browser
		driver.quit();

	}

}
