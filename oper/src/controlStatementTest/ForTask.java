package controlStatementTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		브론즈
//		1. 1~100까지 출력
//		for(int i = 1; i<101; i++) {
//			System.out.println(i);
//		}
//		*******************************************

//		2. 100~1까지 출력
//		for(int i = 100; i>0; i--) {
//			System.out.println(i);
//		}
//		*******************************************

//		3. 1~100까지 중 짝수만 출력
//		for(int i = 2; i<101; i+=2) {
//			System.out.println(i);
//		}

//		*******************************************

//		실버
//		1. 1~100까지 합 출력
//		결과 값을 저장할 변수 선언 및 초기화
//		int result = 0;
//		1~100까지 반복하면서 1부터 100까지 더함
//		for (int i = 1; i < 101; i++) {
//			result += i;
//		}
//		System.out.println(result);
		
//		2. 1~n까지 합 출력(n은 사용자에게 입력받는다)
//		입력 받기 위해 Scanner 클래스 준비
//		Scanner sc = new Scanner(System.in);
//		사용자에게 보여줄 메시지와 필요한 변수 선언 및 초기화
//		int result = 0, end = 0;
//		String message = "숫자를 입력하세요.";
		
//		메세지 출력
//		System.out.println(message);
//		사용자가 입력한 수를 end 변수에 저장
//		end = sc.nextInt();
//		
//		i가 1~end까지 1씩 증가, result변수에 i값 계속 더하기
//		for (int i = 1; i < end + 1; i++) {
//			result += i;
//		}
//		메시지 출력, end, result
//		System.out.println(end + "까지의 합은: " + result);
//		*******************************************

//		골드
//		1. A~F까지 출력
//		for(char c='A'; c <= 'F'; c++) {
//			System.out.println(c);
//		}

//		*******************************************
//		2. A~F까지 중 C 제외하고 출력(continue 사용하지 않기)		
//		for(char c = 'A'; c <= 'F'; c++) {
//			if(c != 'C') {
//				System.out.println(c);
//			}
//		}
//		*******************************************
//		String result = "";
//		for(int i =1; i<7; i++) {
//			if(i != 3) {
//				result += ( char ) ( 64 + i );
//			}
//		}System.out.println(result);
//		*******************************************
//		삼항 연산자 사용
//		i가 0~4까지 1씩 증가
//		for(int i =0; i<5; i++) {
//		char로 형변환 필수! / 65 = a / i가 2보다 크면 66더하기 아니면 65더하기
//			System.out.println((char)(i>1?i+66:i+65));
//		}

//		*******************************************

//		다이아
//		1. 0 1 2 3 0 1 2 3 0 1 2 3 출력
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<4; j++)
//				System.out.print(j);
//		}
//		*******************************************
//		0부터 11까지 반복하면서 0 1 2 3을 반복 출력
//		for (int i = 0; i < 12; i++) {
//		i를 4로 나눈 나머지 값을 출력 -> 0123
//			System.out.print(i % 4 + " ");
//		}
//		
//		*******************************************
//		2. aBcDeFgH...출력
//		알파벳은 총 26개
		
//		result 변수 생성 및 초기화
//		String result = "";
//
//		i는 0부터 25까지 1씩 증가
//		for (int i = 0; i < 26; i++) {
//		i가 2로 나누었을 때 0, 즉 0,2,4...이면 아래식 실행
//			if (i % 2 == 0) {
//		result에 97+i를 형변환한 값 저장 이때 97은 'a'
//				result += (char) (97 + i);
//			} else {
//		if문에 들어가지 못하면, 즉 홀수일때 65+i한 값을 result에 저장 / 65는 'A'
//				result += (char) (65 + i);
//			}
//		} System.out.println(result); // result값 추력
//      
//		삼항연산자 사용하여 위의 코드 단순화
//		무조건 두가지 경우중 한가지를 사용하기 때문에 삼항 연산자가 더 편리
//		a: 97
//      A: 65
//		for (int i = 0; i < 26; i++) {
//			System.out.print((char) (i % 2 == 0 ? i + 97 : i + 65));

//		*******************************************	
	}
}
