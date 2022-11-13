package TestCase;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class ResgisterNewTestCase extends TestBase{
	@Test
	public void VerifyRagisterDetails() {
		Reg.InputEmail();
		Reg.ClickOnCreatAccount();
		Reg.SelectOnGender();
		Reg.InputeFirstName();
		Reg.InputelastName();
		Reg.SelectDay();
		Reg.SelectMonth();
		Reg.SelectYear();
		Reg.InputCompany();
		Reg.InputAddress();
		Reg.InputAdress1();
		Reg.InputCity();
		Reg.SelectCountry();
		Reg.InputAdditionalInfo();
		Reg.InputeMobileNo();
		Reg.InputeFutureAlise();
	}
	

}
