package listeners;

import org.testng.*;

public class ListenersRealzationInterface implements ITestListener, ISuiteListener {
    public void onFinish(ITestContext context){
        System.out.println("onFinish");
    }
    public void onStart(ITestContext context){
        System.out.println("onStart");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result){
        System.out.println("onTestFailedButWithinSuccessPercentage");

    }

    public void onTestFailure(ITestResult result){
        System.out.println("onTestFailure");

    }

    public void onTestSkipped(ITestResult result){
        System.out.println("onTestSkipped");

    }

    public void onTestStart(ITestResult result){
        System.out.println("onTestStart");

    }

    public void onTestSuccess(ITestResult result){
        System.out.println("onTestSuccess");

    }

    public void onFinish(ISuite suite){
        System.out.println("onFinish");

    }

    public void onStart(ISuite suite){
        System.out.println("onFinish");

    }
}