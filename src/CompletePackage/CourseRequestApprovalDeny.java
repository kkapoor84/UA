package CompletePackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
public class CourseRequestApprovalDeny  extends BrowserLaunch

{
	private String numberofrequestedcourses = "2";
	public void CourseRequest() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/nav/div/div[2]/ul/li[5]/a")).click(); // Course Request Main tab
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().forward();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("html body.style-15 div.container-fluid div.row div.center-area div#accordion.panel-group.col-xs-8.col-sm-10 div.padding20 label.common-fonts.ja-color")));
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[3]/div[2]/div[1]/div/span[1]")).click(); // open course request drawer.
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='dvtbl']/table/tbody/tr/td[1]/input")).click();// Select first course
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/table/tbody/tr[2]/td[1]/input")).click(); // Select Second Course.
		Thread.sleep(1000);	
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div[1]/div[1]/span/button")).click(); // Request Button
		//System.out.println("Break1");
		File RequestCourse1 = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(RequestCourse1, new File("D:\\SuccesssfulResult\\7RequestCourse1.jpg"));	
		System.out.println("\n Courses Requested successfully.");
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/input")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/input")).clear();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/input")).sendKeys(numberofrequestedcourses);
		Thread.sleep(1000);		
		File RequestCourse2 = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(RequestCourse2, new File("D:\\SuccesssfulResult\\8RequestCourse2.jpg"));		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div[2]/div/div[2]/div[2]/button")).click(); // Submit Button
		Thread.sleep(2000); 
		driver.navigate().refresh();
	}
	
	public void CourseApprove() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/nav/div/div[2]/ul/li[4]/a")).click(); // Approve request main page
		Thread.sleep(1000);
		File ApproveCourse1 = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ApproveCourse1, new File("D:\\SuccesssfulResult\\9ApproveCourse1.jpg"));
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div/div[2]/div[1]/div[1]/span[1]")).click(); // Expand drawer
		Thread.sleep(2000);	
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[1]")).click(); // Select Courses
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div/div[2]/div[2]/div/div/table/tbody/tr[2]/td[1]")).click(); // Select Courses
		//Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div/div[2]/div[2]/div/div/div[1]/div[1]/span/button")).click(); // Approve Courses.
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/button[2]")).click(); // Yes button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/button")).click();
		Thread.sleep(2000);
		File ApproveCourse2 = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ApproveCourse2, new File("D:\\SuccesssfulResult\\10ApproveCourse2.jpg"));
		System.out.println("\n Course Request Approved");
	}
	
	public void CourseDeny() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div/div[2]/div[1]/div[1]/span[1]")).click(); // Expand Course
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[1]/input")).click();  // Select Record
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div/div[2]/div[2]/div/div/div[1]/div[2]/span/button")).click();  // Deny Action
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/button[2]")).click(); //Confirm action
		Thread.sleep(2000);
		System.out.println("Course Request Denied");
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/button")).click(); //Back to home screen
		Thread.sleep(2000);
		driver.quit();
	}

}
