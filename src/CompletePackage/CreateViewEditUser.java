package CompletePackage;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.commons.io.FileUtils;

public class CreateViewEditUser extends BrowserLaunch
{
	public String firstname = "Eric";
	public String lastname = "Triplett";
	public String emailaddress = "Eric.Triplett@3pillarglobal.com";
	private String viewfirstname = "test";
	private String viewlastname = "user";
	public String updatedemailaddress = "shivanithaman@gmail.com";
	
	
	
	public void CreateNewUser() throws InterruptedException, IOException 
	{

		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[1]/ul/li[2]/a")));				 
		 WebElement CreateUser = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/ul/li[2]/a"));
		 JavascriptExecutor executor = (JavascriptExecutor) driver;
		 executor.executeScript("arguments[0].click();", CreateUser);		 
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("inpFirstName")));
		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[5]/div/div/input")).sendKeys(firstname);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[6]/div/div/input")).sendKeys(lastname);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[7]/div/div/input")).sendKeys(emailaddress);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[9]/div/div[2]/div[1]/label[5]/input")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("btnAddUser")).click();
		 Thread.sleep(3000);		 
		 File Create = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(Create, new File("D:\\SuccesssfulResult\\6CreateUser.jpg"));		 
		 System.out.println("\n User Created Successfully");
		 driver.manage().timeouts().implicitlyWait(190, TimeUnit.SECONDS);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnCancel")));
		 driver.manage().timeouts().implicitlyWait(210, TimeUnit.SECONDS);
		 Thread.sleep(3000);
		 driver.findElement(By.id("btnCancel")).click();
		 driver.navigate().refresh();
		 Thread.sleep(3000);
	}
	
	
	
	public void ViewUser() throws InterruptedException, IOException 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		 Thread.sleep(1000);		 
		 driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/ul/li[1]/a")).click(); // View User
		 driver.findElement(By.id("txtfirstName")).sendKeys(viewfirstname);
		 Thread.sleep(1000);
		 driver.findElement(By.id("txtLastName")).sendKeys(viewlastname);
		 File SearchUser = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(SearchUser, new File("D:\\SuccesssfulResult\\3SearchUser.jpg"));
		 driver.findElement(By.id("btnSearch")).click();
		 Thread.sleep(1000);
		 File ViewUser = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(ViewUser, new File("D:\\SuccesssfulResult\\4ViewUser.jpg"));
		 System.out.println("\n User Information Searched successfully.");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='tblsearchUser']/tbody/tr[1]/td[5]/button")).click(); // View Button
		 Thread.sleep(1000);
		
	}

	public void UpdateUserDetails() throws InterruptedException, IOException 
	{
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[1]/div/button[1]"))); // Edit button
		 driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
		 driver.findElement(By.cssSelector("html body.style-15.modal-open div#createUser.modal.fade.in div#createUserDiv.modal-dialog div.modal-content div.modal-body.style-15 form.form-horizontal div.form-group div.col-sm-12.margin-bottom20 button.btn.Button-Primary.no-border-radius")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[7]/div/div/input")).clear(); // email address
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[7]/div/div/input")).sendKeys("test@test.com");
		 Thread.sleep(1000);		 
		 File UpdateUser = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(UpdateUser, new File("D:\\SuccesssfulResult\\5UpdateUser.jpg"));		 
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[17]/div/div/button[1]")).click(); // Update button
		 Thread.sleep(1000);
		 driver.navigate().refresh();
		 System.out.println("\n User Record updated successfully.");
		
	}
}
