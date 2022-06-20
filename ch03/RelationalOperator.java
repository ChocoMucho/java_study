package ch03;
//비교 연산자
public class RelationalOperator {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		
		String str1 = new String("HI");
		String str2 = new String("HI");
		
		//비교 연산자에서 비교 대상은 스택 메모리의  값들이다.
		//참조 자료형의 스택 메모리에는 힙 메모리의 실제값의 위치가 저장된다.
		//비교하면 다르다는 결과가 나온다.
		System.out.println(str1 == str2);
		System.out.println(str1 != str2);
	}
}
