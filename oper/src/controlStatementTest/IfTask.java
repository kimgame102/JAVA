package controlStatementTest;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
//		입력 상태를 만들기 위해 입력 클래스(Scanner) 준비
		Scanner sc = new Scanner(System.in);
//		사용자가 입력한 정수 값을 저장할 변수 생성 및 초기화
		int select = 0;
//		결과 값을 저장할 변수 생성 및 초기화
		String result = null;
//		사용자가 선택할 때 보여질 메세지 변수에 저장
		String redMessage = "빨간색 : 불같고 열정적이고 적극적이다.";
		String yellowMessage = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage = "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String title = "Q. 당신이 좋아하는 색을 선택하세요."; 
		String menu = "\n1.빨간색\n2.노란색\n3.검은색\n4.흰색";
		String errorMessage = "잘못 입력하셨습니다.";
		
//		사용자에게 메세지 출력, title, menu
		System.out.println(title);
	    System.out.println(menu);

//	    사용자가 입력한 정수 값을 select 변수에 저장
		select = sc.nextInt();
		
//		if문을 사용해서 프로그램을 완성한다.
//		사용자가 1을 선택했을 때 redMessage를 result 변수에 저장
		if(select == 1) {
			result = redMessage;
		}
//		사용자가 2을 선택했을 때 yellowMessage를 result 변수에 저장
		else if(select == 2) {
			result = yellowMessage;
		}
//		사용자가 3을 선택했을 때 blackMessage를 result 변수에 저장
		else if(select == 3) {
			result = blackMessage;
		}
//		사용자가 4을 선택했을 때 whiteMessage를 result 변수에 저장
		else if(select == 4) {
			result = whiteMessage;
		}
//		위의 조건식을 만족하지 않는다면 errorMessage를 result 변수에 저장
		else {
			result = errorMessage;
		}
//		result 값 출력
		System.out.println(result);
	}
}
