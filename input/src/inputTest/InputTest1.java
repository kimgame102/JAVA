package inputTest;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
//		초기값
//		정수: 0
//		실수: 0.0
//		문자: ' ' 띄어쓰기 까지 
//		문자열: null
		Scanner sc = new Scanner(System.in);
		String name = null;
		
		System.out.print("이름:");
//		sc.next(); //사용자가 입력한 문자열 값
		name = sc.next();
		System.out.println(name + "님 환영합니다.");
	}
}
