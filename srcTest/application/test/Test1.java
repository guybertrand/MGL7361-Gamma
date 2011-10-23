package application.test;

import ca.uqam.mgl7361.a2011.gamma.*;
import static ca.uqam.mgl7361.a2011.gamma.Assert.*;
        
public class Test1 implements Testable
{
    @Override
    public void setUp()
    {
    }

    @Override
    public void tearDown()
    {
    }

    @Override
    public boolean execute()
    {
        return assertEquals("vert", "rouge");
    }
}