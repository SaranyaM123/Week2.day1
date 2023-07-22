package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("karthick");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sarah");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Tester should ensure the quality assurance stage of software");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saranyarshi001@gmail.com");
WebElement stateSelection= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select select =new Select(stateSelection);
		
		select.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Assignment two
		driver.findElement(By.linkText("Edit")).click();
		
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		System.out.println("Description is cleared");
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Assignment completed");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
	    driver.manage().window().minimize();
		
		System.out.println(" Testcase 1and2 completed ");
		
	}
}
