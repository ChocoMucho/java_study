package ch01;

public class ch01training {
	public static void main(String args[]) {
		System.out.println("소스파일은 src에 바이트 코드는 bin에");
		System.out.println("소스파일 명은 public 클래스 명과 동일하다");
		System.out.println("다른클래스는 아니다. public 클래스는 소스파일 당 하나씩만 존재 해야한다.");
	}
	
}

class A {
}

class B {
	class CofB{//바이트 코드 파일 명은 B$CofB.class이다.
	}
}