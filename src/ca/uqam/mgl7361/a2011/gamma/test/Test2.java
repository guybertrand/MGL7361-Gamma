package ca.uqam.mgl7361.a2011.gamma.test;
import ca.uqam.mgl7361.a2011.gamma.*;

public class Test2 extends Assert implements TestIndividuel 
{
    private static int a, b;
    @Override public void setUp()
    {
        a = 0;
        b = 0;
    }
    
    @Override public void tearDown()
    {
    }
   
    @Test public static void test1()
    {
        a = 5;
        b = 10;
        if (assertEquals(a + b, 15) == false)
        {
            throw new RuntimeException("Erreur dans la fonction test1");
        }
    }
   
    @Test public static void test2()
    {
        if (assertEquals(a + b,0) == false)
        {
            throw new RuntimeException("Erreur dans la fonction test2");
        }
    }
   
    @Test public static void test3()
    {
        if (assertEquals("vert","vert") == false)
        {
            throw new RuntimeException("Erreur dans la fonction test3");
        }
    }
    
    @Test public static void test4()
    {
        if (assertEquals(10.5,11.5) == false)
        {
            throw new RuntimeException("Erreur dans la fonction test4");
        }
    }
}
