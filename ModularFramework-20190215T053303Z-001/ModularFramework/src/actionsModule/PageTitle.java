package actionsModule;
import org.openqa.selenium.WebDriver;
public class PageTitle {
public static void verifyPageTitle(WebDriver driver) 
{
	if(driver.getTitle().equals("OrangeHRM")) 
	{
		System.out.println("TC_VerifyLogin Passed");
	}else 
	{
		System.out.println("TC_VerifyLogin Failed");
	}
}
}
