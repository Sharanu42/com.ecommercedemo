package tests;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("onTestStart");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");

    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure"+result.getThrowable());

    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");

    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage");

    }
}
