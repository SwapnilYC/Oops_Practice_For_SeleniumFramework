package lecture147;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ParentClass147 {

	@BeforeMethod
	public void beforeRun() {
		System.out.println("Run me first-----------------------------------------");
	}

	@AfterMethod
	public void afterRun() {
		System.out.println("Run me Last------------------------------------------");
	}

	public void doThis() {
		System.out.println("I am parent's method");
	}
}



// All configuration annotation in parent class will run 
// If parent class has @Test annotation then it will also run