package TestCase;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class LogInTestCase extends TestBase {
    @Test
	public void VerifyLogIn() {
		Log.InputeEmail();
		Log.InputePassword();
		Log.ClickOnSubmit();
	}
}
