package ch03;
//논리 연산자 (비트연산자, 쇼트서킷)
public class LogicalOperator {
	public static void main(String[] args) {
		// AND &&
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println();
		// OR ||
		System.out.println(true || false);
		System.out.println();
		// XOR ^
		System.out.println(true ^ false);
		System.out.println(true ^ true);
		System.out.println();
		// NOT !
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		//쇼트서킷 사용 사례 AND와 OR
		//1. 논리 연산자
		int la = 0; 
		System.out.println(false && ++la>0);//증감 연산자가 적용되지 않는다.
		System.out.println(la);//값이 그대로이다.
		
		System.out.println(true || ++la<0);
		System.out.println(la);
		System.out.println();
		
		//2. 비트 연산자
		int ba = 0;
		System.out.println(false & ++ba > 0);//증감 연산자가 적용된다.
		System.out.println(ba);
		
		System.out.println(true | ++ba < 0);
		System.out.println(ba);
	}
}
