package ch02;

public class data_type {
	public static void main(String args[]) {
		String a = "%중괄호 밖에 변수%";
		{
			String b = "%중괄호 안에 변수%";
			System.out.println(a+"와"+b);
		}
		System.out.println(a+"만 살아있다.");
	}
}
