package testFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import actionsModule.CloseBrowser;
import actionsModule.OpenBrowser;
import actionsModule.PageTitle;
import actionsModule.SignIn_Action;
import actionsModule.SignOut_Action;
public class TC_VerifyLogin 
{
    public static WebDriver driver=null;
    
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		OpenBrowser.open(driver);
		SignIn_Action.LogIn(driver);
		PageTitle.verifyPageTitle(driver);
		SignOut_Action.Logout(driver);
        CloseBrowser.close(driver);
	}

}
