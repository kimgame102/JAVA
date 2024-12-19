package stringTest;

import java.util.Iterator;
import java.util.Scanner;

public class My_StringTask {
	public static void main(String[] args) {
//		검색: JAVA에서 문자열 값에서 뒤에서부터 검색하는 방법

//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//		대문자는 모두 소문자로 변경한다.
//		Scanner sc = new Scanner(System.in);
//		String input = null;
//		String message = "문자를 입력하세요.";
//		String result = "";
//		char c = ' ';
//		
//		System.out.println(message);
//
//		input = sc.nextLine();
//
//
//		for (int i = 0; i < input.length(); i++) {
//			c = input.charAt(i);
//			if (Character.isLowerCase(c)) {
//				result += Character.toUpperCase(c);
//			} 
//			else if (Character.isUpperCase(c)) {
//				result += Character.toLowerCase(c);
//			} 
//			else {
//				result += c;
//			}
//		}
//
//		System.out.println("변경된 문자열: " + result);

//		정수는 한글로 변경한다.
//		입력 예)1024
//		출력 예)일공이사
		Scanner sc = new Scanner(System.in);
		String han = "공일이삼사오육칠팔구";
		int num = 0;
		String input = "";
		char c = ' ';
		
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		input = Integer.toString(num);
		
		for (int i = 0; i < input.length(); i++) {
			int j = input.charAt(i) - '0';
			System.out.print(han.charAt(j));
		}
		

//		한글을 정수로 변경한다.
//		입력 예)일공이사
//		출력 예)1024

//		아래의 주소에서 "/news"만 출력한다.
//		www.naver.com/news
//		문자열 자르기 검색 필요!

	}
}
