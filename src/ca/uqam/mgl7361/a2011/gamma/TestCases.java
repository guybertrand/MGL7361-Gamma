package ca.uqam.mgl7361.a2011.gamma;

import java.util.ArrayList;
import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TestCases
{
    private int testBad;
    private ArrayList<TestCase> listTestCase;
    private String traceFilename;
    
    public TestCases()
    { 
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        Date date = new Date();
        traceFilename="./GammaTest-" + dateFormat.format(date) + ".log";
        testBad = 0;
        listTestCase = new ArrayList<TestCase>();
        System.out.println("logfile=" + traceFilename);
    }
    
    public TestCases(String filename)
    {
        testBad = 0;
        listTestCase = new ArrayList<TestCase>();
        traceFilename = filename;
    }
    
    public void addTestCase(Object a, Object b)
    {
        listTestCase.add(new TestCase(a, b));
    }

    public void executeTestCase()
    {
        String text;
        
        try
        {
            Trace trace = new Trace(traceFilename);
            trace.addLine("Début des cas de tests :");
        
            for (TestCase test : listTestCase)
            {
                text = " - Comparaison entre " + test.getObjectA() + " et " + test.getObjectB();
                if (test.assertEquals() == false)
                {
                    testBad++;
                    trace.addLine(text + " ... Erreur");
                }
                else
                {
                    trace.addLine(text + " ... OK");
                }
            }
            
            trace.addLine(listTestCase.size() + " test(s) effectué(s), " + testBad + " test(s) échoué(s)");
            trace.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}