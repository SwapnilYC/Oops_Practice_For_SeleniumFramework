package lecture149;

public class reusableComponents149_2 {
	int a;

	public reusableComponents149_2(int a) {
		this.a = a;
	}

	public int multiplyByTwo() {
		a = a * 2;
		return a;
	}

	public int multiplyByThree() {
		a = a * 3;
		return a;
	}
}

// requirement is create a separate test class

// By this way you can pass the values from test through parameterized constructor & this keyword