package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestBase.TestBase;

public class Listner extends TestBase implements ITestListener{


		
	

	@Override
	public void onTestFailure(ITestResult result) {
		Act.takess(result.getTestName());
		
	}


	
	
	

}
