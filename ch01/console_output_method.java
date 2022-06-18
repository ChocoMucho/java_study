package ch01;

public class console_output_method {
	public static void main(String args[]) {
		System.out.println(1+2+"화면"+"출력"+3+5+"숫자 연산도 왼쪽부터 순서대로");
		int a = 5;
		String b = "문자열 출력";
		System.out.println(a+a+b+a+a);
		System.out.println("변수를 활용해도 똑같다.");
		System.out.println("=================");
		
		System.out.print("개행");
		System.out.print("없이합니다.");
		System.out.print("\n개행했습니다");
		System.out.print("\n");
		
	}
}
