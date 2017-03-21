package CompletePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartCompleteSessionStatus extends BrowserLaunch 
{

	public void Enrollments() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/nav/div/div[2]/ul/li[6]/a")).click(); // My Courses
		Thread.sleep(2000);
		WebElement SessionName = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div/span[1]"));
		SessionName.click(); // Explore Drawer
		System.out.println("Session NAme is" + SessionName.getText());
		Thread.sleep(2000);
	}
}
