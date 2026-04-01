package lecture148;

import org.testng.annotations.Test;

public class ChildClass148 extends ParentClass148 {
	
	@Test
	public void testRun2() {
		int a = 3;
		reusableComponents148 obj = new reusableComponents148(a);
		System.out.println("Initially value of a was: "+a+" & after increament it is: "+obj.increament());
//		doThis();
	}
}

