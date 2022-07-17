package Pack_01;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testlistener implements ITestListener{
	@Override
	public void onFinish(ITestContext context) {
	System.out.println("All methods that are executed:"+context.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("All methods that are started:"+context.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TC Failure & TC Details are.:"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TC Skipped & TC Details are.:"+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TC Start & TC Details are.:"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC Success & TC Details are.:"+result.getName());
		
	}
	

}
