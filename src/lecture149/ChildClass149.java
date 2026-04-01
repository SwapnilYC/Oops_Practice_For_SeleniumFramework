package lecture149;

import org.testng.annotations.Test;

public class ChildClass149 extends ParentClass149 {
	
	@Test
	public void testRun2() {
		int a = 3;
		
		// Reusable component 1
		reusableComponents149_1 obj = new reusableComponents149_1(a);
		int finalVal = obj.increament();
		System.out.println("Initially value of 'a' was: "+a+" & after increament it is: "+ finalVal);
		System.out.println("Initially value of 'a' was: "+finalVal+" & after decrement it is: "+obj.decrement());
		
		// Reusable component 2
//		reusableComponents149_2 obj2 = new reusableComponents149_2(a);
		finalVal = obj.multiplyByTwo();
		System.out.println("Initially value of a was: "+a+" & after multiplication by 2 it is: "+finalVal);
		System.out.println("Initially value of a was: "+finalVal+" & after multiplication by 3 it is: "+obj.multiplyByThree());

	}
}

