package controlStatementTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
//		입력 상태를 만들기 위해 입력 클래스(Scanner)준비
		Scanner sc = new Scanner(System.in);
//		사용자가 입력한 정수 값을 저장할 변수 생성 및 초기화
		int select = 0;
//		결과 값을 저장할 변수 생성 및 초기화
		String result = null;
//		사용자에게 보여줄 메세지 변수에 저장
		String redMessage = "빨간색 : 불같고 열정적이고 적극적이다.";
		String yellowMessage = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage = "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String title = "Q. 당신이 좋아하는 색을 선택하세요."; 
		String menu = "\n1.빨간색\n2.노란색\n3.검은색\n4.흰색";
		String errorMessage = "잘못 입력하셨습니다.";
		
//		사용자에게 메세지 출력 title, menu
		System.out.println(title);
	    System.out.println(menu);

//	    사용자가 입력한 값 select 변수에 저장
		select = sc.nextInt();
		
//		switch문 select값에 따라 각 메세지를 result 값에 저장
//		switch(select) {
//		case 1:
//			result = redMessage;
//			break;
//		case 2:
//			result = yellowMessage;
//			break;
//		case 3:
//			result = blackMessage;
//			break;
//		case 4:
//			result = whiteMessage;
//			break;
//		default:
//			result = errorMessage;
//			break;
//		}
		
//		switch문 select값에 따라 각 메세지를 result 값에 저장
		switch(select) {
		case 1 -> result = redMessage;
		case 2 -> result = yellowMessage;
		case 3 -> result = blackMessage;
		case 4 -> result = whiteMessage;
		default -> result = errorMessage;
		}
//		result 값 출력
		System.out.println(result);
		
	}
}
