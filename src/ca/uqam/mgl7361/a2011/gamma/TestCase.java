package ca.uqam.mgl7361.a2011.gamma;

import java.util.ArrayList;

public class TestCase implements Test
{
    private ArrayList<Testable> listTest;
    private int nbTest;
    private int nbFailed;
    
    public TestCase()
    {
        listTest = new ArrayList<Testable>();
    }
    
    public void addTest(Testable t)
    {
        listTest.add(t);
    }
    
    @Override
    public void execute()
    {
        nbTest = 0;
        nbFailed = 0;
        boolean resultat;
        
        printHeader();
        for (Testable test : listTest)
        {
            nbTest++;
            test.setUp();
            resultat = test.execute();
            
            if (resultat == false)
            {
                nbFailed++;
            }
            
            printBody(resultat, test.getClass().getName());
            test.tearDown();
        }
        printFooter();
    }

    private void printHeader()
    {
        if (Trace.getInstance().getWriteInXML())
        {
            Trace.getInstance().addLine("   <CasDeTest>");
        }
        else
        {
            Trace.getInstance().addLine("- Début d'un cas de test");
        }
    }
    
    private void printBody(boolean result, String className)
    {
        if (result)
        {
            if (Trace.getInstance().getWriteInXML())
            {
                Trace.getInstance().addLine("       <Test>");
                Trace.getInstance().addLine("           <Nom>" + className + "</Nom>");
                Trace.getInstance().addLine("           <Resultat>OK</Resultat>");
                Trace.getInstance().addLine("       </Test>");
            }
            else
            {
                Trace.getInstance().addLine("-> Exécution du test : " + className + " ... OK");
            }
        }
        else
        {
            if (Trace.getInstance().getWriteInXML())
            {
                Trace.getInstance().addLine("       <Test>");
                Trace.getInstance().addLine("           <Nom>" + className + "</Nom>");
                Trace.getInstance().addLine("           <Resultat>Erreur</Resultat>");
                Trace.getInstance().addLine("       </Test>");
            }
            else
            {
                Trace.getInstance().addLine("-> Exécution du test : " + className + " ... Erreur");
            }
        }
    }
    
    private void printFooter()
    {
        if (Trace.getInstance().getWriteInXML())
        {
            Trace.getInstance().addLine("       <Sommaire>");
            Trace.getInstance().addLine("           <NombreDeTest>" + nbTest + "</NombreDeTest>");
            Trace.getInstance().addLine("           <NombreEchec>" + nbFailed + "</NombreEchec>");
            Trace.getInstance().addLine("       </Sommaire>");
            Trace.getInstance().addLine("   </CasDeTest>");
        }
        else
        {
            Trace.getInstance().addLine("- Fin du cas de test");
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
