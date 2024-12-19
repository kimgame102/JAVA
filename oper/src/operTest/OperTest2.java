package operTest;

import java.util.Scanner;

public class OperTest2 {
	public static void main(String[] args) {
//		입력상태를 만들기 위해 입력 클래스(Scanner) 준비
		Scanner sc = new Scanner(System.in);
//		사용자가 입력한 정수 값을 저장할 변수 선언 및 초기화
		int num1 = 0, num2 = 0;
//		int result = 0;
//		결과 값을 저장할 변수 선언 및 초기화
		String result = null;

//		사용자에게 출력할 메세지 변수에 저장
		String message = "두 정수를 입력하세요.\n 예) 1 5";
		
//		사용자에게 메세지 출력
		System.out.println(message);
//		사용자가 입력한 두 정수를 각 변수에 저장
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
//		두 정수 비교
//      참과 거짓 자리에 들어갈 값은 자료형이 서로 달라도 된다.
//      System.out.println(num1 > num2 ? "큰 값:" + num1 : num2);
//		result = num1 > num2 ? num1 : num2;
//		System.out.println(result);
		
//		상항연산자를 활용하여 큰 값을 구한 값을 result 변수에 저장
		result = num1 > num2 ? "큰 값: " + num1 :
			num1 == num2 ? "두 수가 같다.":"큰 값: "+ num2;
//		result 값 출력
		System.out.println(result);
	}
}
