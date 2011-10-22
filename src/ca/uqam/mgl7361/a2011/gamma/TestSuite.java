package ca.uqam.mgl7361.a2011.gamma;

import java.util.ArrayList;

public class TestSuite implements Test
{
    private ArrayList<Test> listTest;
    private int nbTest;
    private int nbFailed;
    
    public TestSuite()
    {
        listTest = new ArrayList<Test>();
    }
    
    public void addTest(Test t)
    {
        listTest.add(t);
    }
    
    @Override
    public void execute()
    {
        nbTest = 0;
        nbFailed = 0;
        
        printHeader();
        for (Test test : listTest)
        {
            test.execute();
            nbTest = nbTest + test.getNbTest();
            nbFailed = nbFailed + test.getNbTestFailed();
        }
        printFooter();
    }
    
    private void printHeader()
    {
        if (Trace.getInstance().getWriteInXML())
        {
            Trace.getInstance().addLine("<TestSuite>");
        }
        else
        {
            Trace.getInstance().addLine("Début d'une suite de test");
        }
    }
    
    private void printFooter()
    {
        if (Trace.getInstance().getWriteInXML())
        {
            Trace.getInstance().addLine("   <Sommaire>");
            Trace.getInstance().addLine("       <NombreDeTest>" + nbTest + "</NombreDeTest>");
            Trace.getInstance().addLine("       <NombreEchec>" + nbFailed + "</NombreEchec>");
            Trace.getInstance().addLine("   </Sommaire>");
            Trace.getInstance().addLine("</TestSuite>");
        }
        else
        {
            Trace.getInstance().addLine(nbTest + " test(s) effectué(s), " + nbFailed + " test(s) échoué(s)");
            Trace.getInstance().addLine("Fin d'une suite de test");
        }
    }
    
    @Override
    public int getNbTest()
    {
        return nbTest;
    }

    @Override
    public int getNbTestFailed()
    {
        return nbFailed;
    }
}