package mypack;

class A {
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
}

public class Test {
	public static void main(String[] args) { 
		A a = new A();
		a.init(2, 3);
		System.out.println(a.m +" "+ a.n);
	}
}