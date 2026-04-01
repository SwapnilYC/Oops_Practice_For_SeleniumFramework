package lecture149;

public class reusableComponents149_1 extends reusableComponents149_2 {
	int a;

	public reusableComponents149_1(int a) {
		// When child class constructor is invoked it will automatically invoked parent class's constructor
		// Now if parent has parameterized constructor then you should have to invoked parents's constructor in child's constructor using super()
		// This set up is basically used to pass the value to parent class so that parent class should initialized his variable & child/grand child can use parent's methods
		super(a); // use super keyword to pass value to parent class from child class
		this.a = a;
	}

	public int increament() {
		a = a + 1;
		return a;
	}

	public int decrement() {
		a = a - 1;
		return a;
	}
}

// requirement is create a separate test class

// By this way you can pass the values from test through parameterized constructor & this keyword