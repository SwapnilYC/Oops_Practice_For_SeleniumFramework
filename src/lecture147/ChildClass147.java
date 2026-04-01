package lecture147;

import org.testng.annotations.Test;

import lecture148.reusableComponents148;

public class ChildClass147 extends ParentClass147 {
	
	@Test
	public void testRun2() {
		 int a =3;
		 reusableComponents148 obj1 = new reusableComponents148(a);
		 System.out.println("Initially a is: "+a+" & after increament a is: "+obj1.increament());
		 
//		doThis();
	}
}

