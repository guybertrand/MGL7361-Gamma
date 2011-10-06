package ca.uqam.mgl7361.a2011.gamma.test;
import ca.uqam.mgl7361.a2011.gamma.*;

public class Test1 extends Assert implements TestIndividuel 
{
    @Override public void setUp()
    {
    }
    
    @Override public void tearDown()
    {
    }

    @Test public static void test1()
    {
        if (assertEquals(6 + 4, 10) == false)
        {
            throw new RuntimeException("Erreur dans la fonction test1");
        }
    }
   
    @Test public static void test2()
    {
        if (assertEquals("bleu","rouge") == false)
        {
            throw new RuntimeException("Erreur dans la fonction test2");
        }
    }
   
    @Test public static void test3()
    {
        if (assertEquals("bleu","bleu") == false)
        {
            throw new RuntimeException("Erreur dans la fonction test3");
        }
    }
}
