package PageLayers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class RegisterDetails extends TestBase{
	public RegisterDetails() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//input[@id='email_create']")
	private WebElement email;
	
@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement creat;
	
@FindBy(xpath="//div[@id='uniform-id_gender1']")
private WebElement gender;

@FindBy(xpath="//input[@id='customer_firstname']")
private WebElement firstname;

@FindBy(xpath="//input[@id='customer_lastname']")
private WebElement lastname;

@FindBy(xpath="//input[@id='passwd']")
private WebElement password;

@FindBy(xpath="//select[@id='days']")
private WebElement day;

@FindBy(xpath="//select[@id='months']")
private WebElement month;

@FindBy(xpath="//select[@id='years']")
private WebElement year;
 
@FindBy(xpath="//input[@id='company']")
private WebElement company ;

@FindBy(xpath="//input[@id='address1']")
private WebElement  address;

@FindBy(xpath="//input[@id='address2']")
private WebElement address1 ;
@FindBy(xpath="//input[@id='city']")
private WebElement city ;

@FindBy(xpath="//select[@id='id_country']")
private WebElement country ;
@FindBy(xpath="//textarea[@id='other']")
private WebElement additioninfo;

@FindBy(xpath="//input[@id='phone']")
private WebElement phone ;
@FindBy(xpath="//input[@id='phone_mobile']")
private WebElement mobile;


@FindBy(xpath="//input[@id='alias']")
private WebElement futureallia;



public void InputEmail() {
	email.sendKeys("");
}
public void ClickOnCreatAccount() {
	creat.click();
	
}
public void SelectOnGender() {
	gender.click();
}
public void InputeFirstName() {
	firstname.sendKeys("anup");;
}
public void InputelastName() {
	lastname.sendKeys("nehe");;
}
public void inputPassword() {
	password.sendKeys("12345");
}
public void SelectDay() {
	Act.selectByIndex(day, 2);
}
public void SelectMonth() {
	Act.selectByIndex(month, 4);
}
public void SelectYear() {
	Act.selectByIndex(year, 5);
}
public void InputCompany() {
	company.sendKeys("company");
}
public void InputAddress() {
	address.sendKeys("sangamner");
}
public void InputAdress1() {
	address.sendKeys("sangamner");
}
public void InputCity() {
	city.sendKeys("sangamner");
}
public void SelectCountry() {
	Act.selectByIndex(country, 0);
}

public void InputAdditionalInfo() {
	additioninfo.sendKeys("hello this is demo");
}

public void InputeMobileNo() {
	mobile.sendKeys("9545938245");
}
public void InputeFutureAlise() {
	futureallia.sendKeys("sangamner");
}

}



