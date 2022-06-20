package ch03;
// 삼항 연산자
public class ConditionalOperator {
	public static void main(String[] args) {
		//기본 구조는 [(참or거짓)? 참일 경우 : 거짓일 경우]
		int a = 1;
		int b = 2;
		boolean c = (a < b)? true : false;
		
		System.out.println(c);

	}
}
