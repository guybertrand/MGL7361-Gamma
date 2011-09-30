package ca.uqam.mgl7361.a2011.gamma;

import java.util.ArrayList;

public class TestCases
{
    private int testBad;
    private ArrayList<TestCase> listeTestCase;
    
    TestCases()
    {
        testBad = 0;
        listeTestCase = new ArrayList<TestCase>();
    }
    
    public void addTestCase(Object a, Object b)
    {
        listeTestCase.add(new TestCase(a, b));
    }

    public void executeTestCase()
    {
        System.out.println("Début des cas de tests :");
        for (TestCase test : listeTestCase)
        {
            if (test.isItEqual() == false)
            {
                testBad++;
            }
        }
        System.out.println(testBad + " test(s) échoué(s)");
    }
}