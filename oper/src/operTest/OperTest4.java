package operTest;

import java.util.Scanner;

public class OperTest4 {
	public static void main(String[] args) {
//      심리 테스트
//      
//      Q. 당신이 좋아하는 색을 선택하세요.
//      1. 빨간색
//      2. 노란색
//      3. 검은색
//      4. 흰색
//      
//      빨간색 : 불같고 열정적이고 적극적이다.
//      노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//      검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//      흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
//		입력 상태를 만들기 위해 입력 클래스(Scanner)준비
		Scanner sc = new Scanner(System.in);
//		사용자가 입력하는 정수 값을 저장할 변수 선언 및 초기화
		int select = 0;
//		결과 값을 저장할 변수 선언 및 초기화
		String result = null;
//		사용자가 고른 값에 대한 메세지 변수에 저장
		String redMessage = "빨간색 : 불같고 열정적이고 적극적이다.";
		String yellowMessage = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage = "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		
//		사용자에게 메세지 출력
		System.out.println("Q. 당신이 좋아하는 색을 선택하세요. \n1.빨간색\n2./노란색\n3.검은색\n4.흰색");
//		사용자가 입력한 정수 값을 select 변수에 저장
		select = sc.nextInt();
		
//		사용자가 입력한 값을 삼항연산자로 찾아 해당 값을 result 변수에 저장
		result = select == 1 ? redMessage :
			select == 2 ? yellowMessage :
				select == 3 ? blackMessage :
					select == 4 ? whiteMessage : "입력이 잘못됐습니다.";
//		result 값 출력
		System.out.println(result);

	}
}
