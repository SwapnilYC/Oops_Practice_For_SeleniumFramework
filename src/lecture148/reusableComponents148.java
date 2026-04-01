package lecture148;

public class reusableComponents148 {
	int a;
	public reusableComponents148(int a){
		this.a = a;
	}
	
	
	public int increament() {
		a =a + 1;
		return a;
	}
}


// By this way you can pass the values from test through parameterized constructor & this keyword