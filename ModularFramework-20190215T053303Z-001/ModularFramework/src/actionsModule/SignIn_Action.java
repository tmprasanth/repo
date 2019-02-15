package actionsModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.Log_In;
public class SignIn_Action 
{
public static void LogIn(WebDriver driver) 
{
	Log_In li=new Log_In(driver);
	
	li.UN.sendKeys("qaplanet1");
	li.PWD.sendKeys("lab1");
	li.LOGIN.click();
	
			
}

}
