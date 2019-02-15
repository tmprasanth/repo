package actionsModule;
import org.openqa.selenium.WebDriver;
import pageObjects.Log_Out;
public class SignOut_Action {
public static void Logout(WebDriver driver) {
	Log_Out lo=new Log_Out(driver);
	lo.LOGOUT.click();
}
}
