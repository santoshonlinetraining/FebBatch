package project_listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testcases.LogTest;

public class Listener implements ITestListener {
	public Logger log = LogManager.getLogger(LogTest.class.getName());
	
	public void onTestStart(ITestResult result) {
		log.debug("New Test Started " +result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		log.debug("Test Successfully Finished " +result.getName());
	}
 
	public void onTestFailure(ITestResult result) {
		log.error("Test Failed " +result.getName());
	}
 
	public void onTestSkipped(ITestResult result) {
		log.debug("Test Skipped " +result.getName());
	}
 
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		log.debug("Test Failed but within success percentage " +result.getName());
	}
 
	public void onStart(ITestContext context) {
		log.debug("This is onStart method " +context.getOutputDirectory());
	}
 
	public void onFinish(ITestContext context) {
		log.debug("This is onFinish method " +context.getPassedTests());
		log.debug("This is onFinish method " +context.getFailedTests());
	}
		
}
