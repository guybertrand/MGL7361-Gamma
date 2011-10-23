package application.test;

import ca.uqam.mgl7361.a2011.gamma.*;
import static ca.uqam.mgl7361.a2011.gamma.Assert.*;

public class Test2 implements Testable 
{
    private static int a, b;
    
    @Override
    public void setUp()
    {
        a = 0;
        b = 0;
    }
    
    @Override
    public void tearDown()
    {
    }
   
    @Override
    public boolean execute()
    {
        a = 5;
        b = 10;
        return assertEquals(a + b, 15);
    }
}