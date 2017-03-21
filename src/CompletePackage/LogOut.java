package CompletePackage;

import org.openqa.selenium.By;

public class LogOut extends BrowserLaunch

{
	public void LogoutSuccessfully() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/ul/li[5]/a")).click();;
		System.out.println("\n\n Logout from JA application is successful");
		System.out.println("\n\n ********Congratulations Automation Suite is Complete*******");
		System.out.println("\n\n ==========================================================================="); 
		driver.close();
	}

}
