package ch02;

public class FloatVsDouble {
	public static void main(String[] args) {
		float f1 = 1.0001f;
		float f2 = 1.00000000001f;
		System.out.println(f1);
		System.out.println(f2);
		
		double d1 = 1.000000000000001;
		double d2 = 1.000000000000000000001;
		System.out.println(d1);
		System.out.println(d2);
	}
}
