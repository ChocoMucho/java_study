package ch02;

public class OperationBetweenDataType {
	public static void main(String[] args) {
		//서로 같은 자료형 연산
		int val1 = 3+5;//int + int => int
		int val2 = 5;//int / int => int
		float val3 = 3.0f + 5.0f;//float + float => float
		double val4 = 8.000/5.000;
		
		byte a = 1;
		byte b = 2;
		int val5 = a + b;//byte + byte 는 int 형이므로 byte 선언은 오류이다.
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
		System.out.println();
		
		//서로 다른 자료형 연산
		double val6 = 5 + 3.5f;//double 말고 float도 가능하다.
		int val7 = 5 + (int)val6;//int + (int)double => int + int
		double val8 = 5 / 2.0;//int/double => double/double
		byte c = 3;
		short d = 4;
		int val9 = c + d;//byte + short => int + int
		double val10 = c + d;//double로 업캐스팅
		
		System.out.println(val6);
		System.out.println(val7);
		System.out.println(val8);
		System.out.println(val9);
		System.out.println(val10);
	}
}
