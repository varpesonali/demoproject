package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import TestBase.TestBase;

public class ContacUsTestcase extends TestBase {


	@Test
public void VerifyContacUs() {
	Con.ClickOnContactUs();
	Con.Selectheading();
	//Con.InputMail();
	//Con.InputOrderId();
	//Con.UploadFile();
	//Con.ClickOnSubmit();
	
}
}
