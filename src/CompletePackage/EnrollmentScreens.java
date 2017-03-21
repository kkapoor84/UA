package CompletePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class EnrollmentScreens extends BrowserLaunch
{
	public StringSelection sel = new StringSelection("D:\\JA\\Iteration13-JAChangeRequest\\FinalProjectTest\\FinalProjectTest\\Files\\EnrollmentTemplate.xls");
	
	
	//String SessionName;
	
	
	public void EnrollmentTab() throws InterruptedException
	{
		System.out.println("\n\n****Test for Teacher/ Volunteer/ Student******");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/nav/div/div[2]/ul/li[6]/a")).click(); // My Courses
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='notRunningCourses']/div[2]/div[1]/div/span[1]")).click(); // Explore Drawer
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='dvtable']/table/tbody/tr[2]/td[2]")).click(); // Open enrollment screen
		Thread.sleep(2000);
	}
	
	public void LocationEnrollment() throws InterruptedException
	{
		driver.findElement(By.id("btnSetLoaction")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[7]/div/div/div[2]/div/form/div[4]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[7]/div/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[7]/div/div/div[2]/div/div/div[2]/button[3]")).click();
		Thread.sleep(2000);
		System.out.println("\n Location Enrolled successfully.");
	}
	
	
	public void TeacherEnrollment() throws InterruptedException
	{
		Thread.sleep(2000);
		DeleteTeacherEnrollments();		
		Thread.sleep(5000);
		driver.findElement(By.id("btnEducator")).click(); // Teacher Enrollment
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[4]/div/table/tbody[1]/tr/td[2]/input")).sendKeys("teacher");; // First Name
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[4]/div/table/tbody[1]/tr/td[3]/input")).sendKeys("CKTest");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[4]/div/table/tbody[1]/tr/td[5]/button")).click(); // Enroll Button.
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div/div[1]/div/span[1]")).click(); // Explore Reconcillation drawer
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div/div[2]/div/div/div[1]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/button[2]")).click(); // User Selected.
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[6]/button[2]")).click(); // Complete button.
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[1]/button[2]")).click(); // Finish Enrollment
		Thread.sleep(2000);
		DeleteTeacherEnrollments();	
		System.out.println("\n Teacher Enrollment Complete");
	}
	
	public void TeacherBulkEnrollment() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		DeleteTeacherEnrollments();	
		Thread.sleep(5000);		
		driver.findElement(By.id("btnEducator")).click();// Teacher Enrollment
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[1]/button[1]")).click(); // Import Button
		Thread.sleep(3000);		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[6]/div/div/div[2]/div/div/form/div[1]/div[3]/input")).click(); // Choose File
		Thread.sleep(2000);
		ChooseFile(); // Function
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[6]/div/div/div[2]/div/div/form/div[2]/input[1]")).click();
		Thread.sleep(2000);
		ReconcillationBulkUpload();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[1]/button[2]")).click(); // Finish Enrollment
		Thread.sleep(2000);
		DeleteTeacherEnrollments();	
		System.out.println("\n Teacher Bulk enrollment is successfull.");
		
		
	}
	
	public void VolunteerEnrollment() throws InterruptedException
	{
		Thread.sleep(2000);
		DeleteVolunteerEnrollments();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/div/button[3]")).click(); //Click volunteer Tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[4]/div/table/tbody[1]/tr/td[2]/input")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[4]/div/table/tbody[1]/tr/td[3]/input")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[4]/div/table/tbody[1]/tr/td[5]/button")).click(); // Enroll Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div/div[1]/div/span[1]")).click(); // Expand Drawer
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div/div[2]/div/div/div[1]/table/tbody/tr[65]/td[1]/input")).click(); //  Select
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[6]/button[2]")).click(); // Complete
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[1]/button[2]")).click(); // Finish Enrollment.
		Thread.sleep(2000);
		DeleteVolunteerEnrollments();
		System.out.println("\n Volunteer Enrollment Successfull.");
	}
	
	public void VolunteerBulkEnrollment() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		DeleteVolunteerEnrollments();		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/div/button[3]")).click(); // Enroll Volunteer
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[1]/button[1]")).click(); // Import Button.
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[6]/div/div/div[2]/div/div/form/div[1]/div[3]/input")).click(); // Browse Button
		Thread.sleep(2000);
		ChooseFile(); // Function
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[6]/div/div/div[2]/div/div/form/div[2]/input[1]")).click(); // Upload button
		Thread.sleep(3000);
		//ReconcillationBulkUpload();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[1]/button[2]")).click(); // Finish Enrollment.
		DeleteVolunteerEnrollments();
		Thread.sleep(2000);
		System.out.println("\n Volunteer Bulk student is successfull.");
		
	}
	
	
	public void StudentEnrollment() throws InterruptedException
	{
		Thread.sleep(2000);
		DeleteStudentEnrollments();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/div/button[4]")).click(); // Enroll Student
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[3]/div/div/div[2]/div/div[4]/div/table/tbody[1]/tr/td[2]/input")).sendKeys("Student"); // first name 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[3]/div/div/div[2]/div/div[4]/div/table/tbody[1]/tr/td[3]/input")).sendKeys("UserTest"); // last name
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[3]/div/div/div[2]/div/div[4]/div/table/tbody[1]/tr/td[5]/button")).click(); // Enroll Button.
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div/div[1]/div")).click(); // Explore Drawer
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div/div[2]/div/div/div[1]/table/tbody/tr/td[1]/input")).click(); // Select Value
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/button[2]")).click(); // User Selected
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[6]/button[2]")).click(); // Complte
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[3]/div/div/div[2]/div/div[1]/button[2]")).click(); // Finish Enrollment
		Thread.sleep(2000);
		DeleteStudentEnrollments();
		Thread.sleep(2000);
		System.out.println("\n Student Enrollment is successfull");
	}
	
	public void StudentBulkEnrollment() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		DeleteStudentEnrollments();
		Thread.sleep(2000);
		driver.findElement(By.id("btnStudent")).click(); // Enroll Student.
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[3]/div/div/div[2]/div/div[1]/button[1]")).click(); // Import Button.
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[5]/div/div/div[2]/div/div/form/div[1]/div[3]/input")).click(); // Browse
		Thread.sleep(2000);
		ChooseFile(); // Function
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[5]/div/div/div[2]/div/div/form/div[2]/input[1]")).click(); // Upload
		Thread.sleep(2000);
		//ReconcillationBulkUpload();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[3]/div/div/div[2]/div/div[1]/button[2]")).click(); // Finish Enrollment
		Thread.sleep(2000);
		DeleteStudentEnrollments();
		Thread.sleep(2000);
		System.out.println("\n Student Bulk enrollment is successfull.");
		Thread.sleep(2000);		
	}
	
	public void ChooseFile() throws AWTException, InterruptedException
	{
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		Robot rb =new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);		
		Thread.sleep(3000);		
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	public void choosFile()
	{
		
	}
	
	public void CloseEnrollmentScreens() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[1]/button")).click(); // Close Enrollment Screen
		Thread.sleep(2000);
	}
	
	public void DeleteTeacherEnrollments() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[2]/div[1]/div/span[1]")).click(); // Delete Teacher
		Thread.sleep(2000);
		
		
		if(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[2]/div[2]/div/div/div[2]/table/thead/tr/th[1]/input")).isDisplayed())
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[2]/div[2]/div/div/div[2]/table/thead/tr/th[1]/input")).click();  // Select All	
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[2]/div[2]/div/div/div[1]/div[1]/button")).click(); // Delete
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/button[2]")).click(); // Yes
		}
		
		else 
		System.out.println("There is no teachers enrollment to delete" );
		
	}
	
	public void DeleteVolunteerEnrollments() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[3]/div[1]/div/span[1]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[3]/div[2]/div/div/div[2]/table/thead/tr/th[1]/input")).isDisplayed())
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[3]/div[2]/div/div/div[2]/table/thead/tr/th[1]/input")).click();  // Select All	
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[3]/div[2]/div/div/div[1]/div[1]/button")).click(); // Delete
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/button[2]")).click(); // Yes
		}
		else 
			System.out.println("\n There is no volunteer enrollment to delete" );
	}
	
	public void DeleteStudentEnrollments() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[4]/div[1]/div/span[1]")).click();
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[4]/div[2]/div/div/div[2]/table/thead/tr/th[1]/input")).isDisplayed())
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[4]/div[2]/div/div/div[2]/table/thead/tr/th[1]/input")).click();  // Select All	
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div/form/div/div[4]/div[2]/div/div/div[1]/div[1]/button")).click(); // Delete
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/button[2]")).click(); // Yes
		}
 
			System.out.println("There is no Students enrollment to delete" );
	}
	
	public void ReconcillationBulkUpload() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div[1]/div[1]/div/span[1]")).click(); // Explore
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div[2]/button[1]")).click(); // Create New
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div[2]/div[1]/div/span[1]")).click(); // Explore
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div[2]/div[2]/div/div/div[2]/button[3]")).click(); // Ignore Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div[3]/div[1]/div/span[1]")).click(); // Explore
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div[3]/div[2]/div/div/div[1]/table/tbody/tr/td[1]/input")).click(); //Select
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[5]/div/div[3]/div[2]/div/div/div[2]/button[2]")).click(); //Use Now
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div[4]/div/div/div[2]/div/div[6]/button[2]")).click(); // Complete
		Thread.sleep(5000);
		
	}

}
