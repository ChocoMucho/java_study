package ch03;
//비트 연산 기초
public class BitwiseOperator {
	public static void main(String[] args) {
		System.out.println(3&10);//0..0011 AND 0..1010 => 0..0010(2)
		System.out.println(3|10);//0..0011 OR 0..1010 => 0..1011(11)
		System.out.println(3^10);//0..0011 XOR 0..1010 => 0..1001(9)
		System.out.println(~3);//0..0011 => 1..1100(-4)
	}
}
