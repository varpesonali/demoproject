package PageLayers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class Login extends TestBase {
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement submit;
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	public void InputeEmail() {
		email.sendKeys("anupnehe@gmail.com");
	}
	public void InputePassword() {
		password.sendKeys("12345");
	}
	public void ClickOnSubmit() {
		submit.click();
	}
	
}
