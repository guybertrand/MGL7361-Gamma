package application.test;

import ca.uqam.mgl7361.a2011.gamma.*;

public class TestMain
{
    private static boolean indXML;
    private static boolean indFile;
    
    public static void main(String[] args)
    {
        initArguments(args);
        
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
        
        Trace.getInstance().initialize(indXML, indFile);
        
        testSuite3.execute();
        Trace.getInstance().close();
    }
    
    private static void initArguments(String[] args)
    {
        indXML = false;
        indFile = false;
        
        for (String s: args)
        {
            if (s.equals("xml=true"))
            {
                indXML = true;
            }
            
            if (s.equals("file=true"))
            {
                indFile = true;
            }
        }
    }
}