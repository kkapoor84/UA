package CompletePackage;

import java.awt.AWTException;
import java.io.IOException;

public class MainClass 
{
	public static void main (String args[]) throws IOException, InterruptedException, AWTException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		BrowserLaunch browserlaunch = new BrowserLaunch();
		AccountLogin accountlogin = new AccountLogin();
		//LogOut logout = new LogOut();
		CreateViewEditUser createviewedituser = new CreateViewEditUser();
		CourseRequestApprovalDeny courserequestapprovaldeny = new CourseRequestApprovalDeny();
		//ManageCatalogs managecatalogs = new ManageCatalogs();
		//EnrollmentScreens enrollmetscreens = new EnrollmentScreens();
	//	StartCompleteSessionStatus startcompletesessionStatus = new StartCompleteSessionStatus();		
		browserlaunch.LaunchChrome();				
		accountlogin.LoginSetup();		
	    createviewedituser.CreateNewUser();
		createviewedituser.ViewUser();
		createviewedituser.UpdateUserDetails();
		//managecatalogs.CreateCatalog();
		//managecatalogs.EditCatalog();
		//managecatalogs.DeleteCatalog();
		courserequestapprovaldeny.CourseRequest();
		courserequestapprovaldeny.CourseApprove();
		courserequestapprovaldeny.CourseDeny();
		//enrollmetscreens.EnrollmentTab();
		//enrollmetscreens.LocationEnrollment();
		//enrollmetscreens.TeacherEnrollment();
		//enrollmetscreens.TeacherBulkEnrollment();
		//enrollmetscreens.VolunteerEnrollment();
		//enrollmetscreens.VolunteerBulkEnrollment();
		//enrollmetscreens.StudentEnrollment();
		//enrollmetscreens.StudentBulkEnrollment();
		//enrollmetscreens.CloseEnrollmentScreens();
		//startcompletesessionStatus.Enrollments();
		//logout.LogoutSuccessfully();		
	}

}

