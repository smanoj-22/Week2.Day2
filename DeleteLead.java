package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text() ='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String first_LeadID = driver.findElement(By.xpath("//div[text()='Lead ID']/following::tr[1]//a[1]")).getText();
		driver.findElement(By.xpath("//div[text()='Lead ID']/following::tr[1]//a[1]")).click();
		driver.findElement(By.xpath("//a[text()= 'Delete']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(first_LeadID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String records = "No records to display";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()= 'No records to display']")).getText();
		String actualRecords = driver.findElement(By.xpath("//div[text()= 'No records to display']")).getText() ;
		
		if (records.equals(actualRecords))
		{
			System.out.println("Record deleted successful");
		}
	}
}
