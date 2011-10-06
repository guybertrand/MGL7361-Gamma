package ca.uqam.mgl7361.a2011.gamma.test;
import ca.uqam.mgl7361.a2011.gamma.*;

public class TestMain
{
    public static void main(String[] args)
    {
        TestCase t = new TestCase();
        
        t.addTest(new Test1());
        t.addTest(new Test2());
        
        t.execute();
    }
}
