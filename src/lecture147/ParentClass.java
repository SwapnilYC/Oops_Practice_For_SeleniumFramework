package lecture147;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentClass {

	@BeforeMethod
	public void beforeRun() {
		System.out.println("Run me first(@BeforeMethod present in parent class)");
	}

	@AfterMethod
	public void afterRun() {
		System.out.println("Run me Last(@AfterMethod present in parent class)");
	}

	public void doThis() {
		System.out.println("I am parent's method");
	}
}



// All configuration annotation in parent class will run 
// If parent class has @Test annotation then it will also run