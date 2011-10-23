package application.test;

import ca.uqam.mgl7361.a2011.gamma.*;

public class TestMain
{
    public static void main(String[] args)
    {
        TestSuite testSuite1 = new TestSuite();
        TestSuite testSuite2 = new TestSuite();
        TestSuite testSuite3 = new TestSuite();
        TestCase testCase1 = new TestCase();
        TestCase testCase2 = new TestCase();
        
        testCase1.addTest(new Test1());
        testCase1.addTest(new Test2());
        testCase2.addTest(new Test1());
        
        testSuite1.addTest(testCase1);
        testSuite1.addTest(testCase2);
        testSuite2.addTest(testCase1);
        
        testSuite3.addTest(testSuite1);
        testSuite3.addTest(testSuite2);
        
        Trace.getInstance().initialize(true, false);
        
        testSuite3.execute();
        Trace.getInstance().close();
    }
}