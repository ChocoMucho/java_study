package ch03;

public class ArithmeticOperator {
	public static void main(String[] args) {
		int val1 = 2+3;
		int val2 = 8-5;
		int val3 = 7*2;
		int val4 = 8%5;
		
		System.out.println(val1+"\n"+val2+"\n"+val3+"\n"+val4);
		
		int val5 = 3;
		int val6 = 0;
		val6 = val5++;
		System.out.println(val6);
		System.out.println(val5);
	}
}
