package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
//	자동 형변환
		System.out.println(5 / 2);
		System.out.println(5.0 / 2);
//		강제 형변환
		System.out.println((double)5 / 2);
		System.out.println((int)2.8 + 5);
		
//		8.43 + 2.59
		double number1 = 8.43;
		double number2 = 2.59;
		
		System.out.println((int)number1 + (int)number2);
		System.out.println("=========================");
	}
}
