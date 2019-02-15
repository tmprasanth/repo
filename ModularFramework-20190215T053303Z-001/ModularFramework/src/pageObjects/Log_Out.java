package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Log_Out {
	public Log_Out(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id='option-menu']/li[3]/a")
	public WebElement LOGOUT;
}
