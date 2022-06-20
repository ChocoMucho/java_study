package ch03;
//대입 연산자
public class AssignmentOperator {
	public static void main(String[] args) {
		//"="는 항상 오른쪽에 위치한다.
		int val1;
		val1 = 7; System.out.println(val1 += 4);
		val1 = 7; System.out.println(val1 /= 3);
		val1 = 7; System.out.println(val1 &= 1);
		val1 = 7; System.out.println(val1 <<= 3);
		val1 = 7; System.out.println(val1 >>> 2);
	}
}
