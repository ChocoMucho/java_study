package ch02;

public class PrimaryDataType_1 {
	public static void main(String[] args) {
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();
		
		byte val1 = 10;
		short val2 = 15;
		int val3 = 100;
		long val4 = 1000L;
		System.out.println(val1+"\n"+val2+"\n"+val3+"\n"+val4);
		System.out.println();
		
		float val5 = 3.55f;//기본적으로 모든 실수는 double로 인식한다. 뒤에 f를 붙여서 float 인식.
		float val6 = 3f;//int로 인식하지만 자동으로 타입 변환을 한다 int=>double=>float
		double val7 = 3.55;//기본적으로 모든 실수는 double로 인식한다.
		double val8 = 43;
		System.out.println(val5+"\n"+val6+"\n"+val7+"\n"+val8+"\n");
		
	}
}
