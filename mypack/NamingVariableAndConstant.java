package mypack;

import java.util.Arrays;

public class NamingVariableAndConstant {
	public static void main(String[] ar) {
		int[] a = new int[] {1, 2, 3};
		printArray(a);
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	
}