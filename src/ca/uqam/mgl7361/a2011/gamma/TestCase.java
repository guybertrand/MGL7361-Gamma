package ca.uqam.mgl7361.a2011.gamma;

import java.util.ArrayList;
import java.io.*;
import java.lang.reflect.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TestCase
{
    private ArrayList<TestIndividuel> listTest;
    private String traceFilename;
    
    public TestCase()
    {
        listTest = new ArrayList<TestIndividuel>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        traceFilename="./GammaTest-" + dateFormat.format(new Date()) + ".log";
        System.out.println("logfile=" + traceFilename);
    }
    
    public TestCase(String filename)
    {
        listTest = new ArrayList<TestIndividuel>();
        traceFilename = filename;
    }
    
    public void addTest(TestIndividuel t)
    {
        listTest.add(t);
    }
    
    public void execute()
    {
        int nbTest = 0, nbFailed = 0;
        
        try
        {
            Trace trace = new Trace(traceFilename);
            trace.addLine("Début des cas de tests");
        
            for (TestIndividuel testIndividuel : listTest)
            {             
                for (Method m : testIndividuel.getClass().getMethods())
                {
                    if (m.isAnnotationPresent(Test.class))
                    {
                        nbTest++;
                        testIndividuel.setUp();
                        try
                        {
                            m.invoke(null);
                        }
                        catch (Throwable exception)
                        {
                            trace.addLine("- Erreur : " + testIndividuel.getClass() + " - " + exception.getCause());
                            nbFailed++;
                        }
                        testIndividuel.tearDown();
                    }
                }
            }
            
            trace.addLine(nbTest + " test(s) effectué(s), " + nbFailed + " test(s) échoué(s)");
            trace.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}