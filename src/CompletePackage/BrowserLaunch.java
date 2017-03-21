package CompletePackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserLaunch 

{
	public static WebDriver driver = new ChromeDriver();
	public String BaseUrl = "http://182.71.201.58:7800/Home/Index";
	public static WebDriver augmentedDriver = new Augmenter().augment(driver); 
	public static WebDriverWait wait = new WebDriverWait(driver,40);
	
	public void LaunchChrome() throws IOException
	{

		driver.get(BaseUrl);		
		driver.manage().window().maximize();		
		System.out.println("Welcome To JA Application");
		File screenshot1 = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File("D:\\SuccesssfulResult\\1LoginScreen.jpg"));	
	}
	

}
