package lecture147;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass {

	@Test
	public void testRun1() {
		System.out.println("I am child's method");
	}
	
	@Test
	public void testRun2() {
		doThis();
	}
}
