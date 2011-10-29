package application.test;

import ca.uqam.mgl7361.a2011.gamma.*;
import static ca.uqam.mgl7361.a2011.gamma.Assert.*;

public class Test2 implements Testable 
{   
    @Override
    public boolean execute()
    {
        return assertEquals(5 + 10, 15);
    }
}