package CompletePackage;

import org.openqa.selenium.By;

public class ManageCatalogs  extends BrowserLaunch
{
	public void CreateCatalog() throws InterruptedException
	{
		System.out.println("\n\n****Test for Manage Catalog******");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/nav/div/div[2]/ul/li[2]/a")).click(); // Create Catalog Main tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[3]/div[1]/div/button")).click(); // Create Catalog
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div[1]/div/div/input")).sendKeys("Automated Catalog"+Math.random()); // Name of catalog
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[1]/input")).click(); // Select Areas
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div[3]/table/tbody/tr[2]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div[2]/div/div/button[3]")).click(); // Save and populate
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/a/div")).click(); // Select Courses
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/a/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[4]/a/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/button")).click(); // Save button
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/div[2]/div/div/div[1]/button")).click(); //Confirm action
		System.out.println("\n New catalog added successfully.");
		Thread.sleep(3000);
	}

	public void EditCatalog() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/nav/div/div[2]/ul/li[2]/a")).click(); // Main Tab click
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[3]/div[2]/div[1]/div/div/button[2]")).click(); // Configure catalog
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div[3]/table/tbody/tr[3]/td[1]/input")).click(); // Add new area
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[1]/input")).click(); // Remove existing area mapping
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div[1]/div/div/input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div[1]/div/div/input")).sendKeys("Updated Catalog"+ Math.random());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div[2]/div/div/button[2]")).click();  // Save the changes
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/button")).click(); //Close button
		Thread.sleep(2000);
		System.out.println("\n Catalog updated successfully.");
	}
	
	public void DeleteCatalog() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[3]/div[2]/div[1]/div/div/button[1]")).click(); // Delete Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/button[2]")).click(); // Confrmation
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/button")).click(); // Close button
		Thread.sleep(3000);
		System.out.println("\n Catalog deleted successfully.");
	}
}
