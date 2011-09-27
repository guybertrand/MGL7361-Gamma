package gammaTest;

import gamma.Test4true;
import gamma.TestFalse;

public class GammaTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour!!!  Je veux faire des test!!!!");
		
		Test4true testTrue = new Test4true();
		TestFalse testFalse = new TestFalse();
		
		testTrue.test4true(1,1);
		testTrue.test4true(2,2);
		testTrue.test4true(1,2);
		testTrue.test4true(0,5);
		
		testFalse.testFalse(1,1);
		testFalse.testFalse(2,2);
		testFalse.testFalse(1,2);
		testFalse.testFalse(0,5);
	}

}
