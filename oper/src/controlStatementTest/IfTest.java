package controlStatementTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		입력 상태를 만들기 위해 입력 클래스(Scanner)준비 
		Scanner sc = new Scanner(System.in);
//		사용자가 입력한 정수 값을 저장할 변수 생성 및 초기화
	    int number1 = 0, number2 = 0;
//	    사용자에게 출력할 메세지 변수에 저장
	    String message = "두 정수를 입력하세요.\n예)1 4";
//	    조건식을 만드는데 사용되는 condition1,2 변수 생성 및 초기화
	    boolean condition1 = false, condition2 = false;
//	    결과 값을 저장할 변수 생성 및 초기화
	    String result = null;
	      
//	    사용자에게 메세지 출력
	    System.out.println(message); 
//	    사용자가 입력한 정수 값을 변수에 저장
	    number1 = sc.nextInt();
	    number2 = sc.nextInt();
	    
//	    어떤 수가 더 큰지 찾는 조건식
	    condition1 = number1 > number2;
	    condition2 = number2 > number1;
	      
//	    만약 number1이 더 크면 아래 식을 result 변수에 저장
	    if(condition1) {
	       result = "큰 값: " + number1;
	    }
//	    만약 number2이 더 크면 아래 식을 result 변수에 저장
	    else if(condition2) {
	       result = "큰 값: " + number2;
	    }
//	    그렇지 않다면 아래 식을 result 변수에 저장
	    else {
	       result = "두 수가 같습니다.";
	    }
	      
//	    result 값 출력
	    System.out.println(result);
	 }

}
