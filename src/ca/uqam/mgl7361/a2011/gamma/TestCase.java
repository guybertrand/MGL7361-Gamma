package ca.uqam.mgl7361.a2011.gamma;

public class TestCase
{
    private Object objetA;
    private Object objetB;
    
    public boolean assertEquals(int a, int b)
    {
        return a == b;
    }
    
    public boolean assertEquals(long a, long b)
    {
        return a == b;
    }
    
    public boolean assertEquals(double a, double b)
    {
        return a == b;
    }
       
    public boolean assertEquals(boolean a, boolean b)
    {
        return a == b;
    }
    
    public boolean assertEquals(char a, char b)
    {
        return a == b;
    }
    
    public boolean assertEquals(byte a, byte b)
    {
        return a == b;
    }
    
    public boolean assertEquals(short a, short b)
    {
        return a == b;
    }
    
    public boolean assertEquals(float a, float b)
    {
        return a == b;
    }
    
    public boolean assertEquals(String a, String b)
    {
        return a.equals(b);
    }
    
    public boolean assertEquals(Object a, Object b)
    {
        return a.equals(b);
    }
    
    public boolean isItEqual()
    {
        boolean result = false;
        
        System.out.print(" - Comparaison entre " + objetA + " et " + objetB);
        result = objetA.equals(objetB);
        
        if (result == true)
        {
            System.out.println(" ... Ok");
        }
        else
        {
            System.out.println(" ... Erreur");
        }
        
        return result;
    }
    
    TestCase(Object a, Object b)
    {
        objetA = a;
        objetB = b;
    }
}