package inputTest;

import java.util.Scanner;

public class InputTest3 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 결과 출력
//		nextInt(): 사용자가 입력한 정수 값
//		입력 상태를 만들기 위해 입력 클래스(Scanner) 준비
		Scanner sc = new Scanner(System.in);
//		사용자에게 출력할 메세지 변수에 저장
		String message = "세 정수를 입력해주세요.";
//		사용자에게 출력할 메세지(예시) 변수에 저장
		String exampleMessage = "예)3 8 13";
//		사용자가 입력한 정수 값을 저장할 변수 선언 및 초기화
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		
//		사용자에게 메세지 출력
		System.out.println(message);
		System.out.println(exampleMessage);
		
//		사용자가 입력한 3개의 정수를 각 변수에 저장
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
//		사용자가 입력한 값을 더한 결과값을 result에 저장
		result = num1 + num2 + num3;
//		세 수의 합 출력
		System.out.println("세 수의 합:"+ num1 + " + " + num2 + " + " + num3 + " = " + result);
		
	}
}
