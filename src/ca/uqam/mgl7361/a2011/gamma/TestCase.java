package ca.uqam.mgl7361.a2011.gamma;

public class TestCase
{
    private Object objectA;
    private Object objectB;
    
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
    
    public boolean assertEquals()
    {
        return objectA.equals(objectB);
    }
    
    TestCase(Object a, Object b)
    {
        objectA = a;
        objectB = b;
    }
    
    public Object getObjectA()
    {
        return objectA;
    }
    
    public Object getObjectB()
    {
        return objectB;
    }
}