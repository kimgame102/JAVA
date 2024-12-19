package operTest;

import java.math.BigDecimal;
import java.util.Scanner;

public class OperTest3 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		예) 183 -> 183 출력
//		183.5 -> 183.5 출력
//		183.0 -> 183 출력
//		입력상태를 만들기 위해 입력 클래스(Scanner) 준비
		Scanner sc = new Scanner(System.in);
//		키 변수 생성 및 초기화
		double height = 0.0;
//		사용자에게 보여줄 메세지, 
		String message = "키: ", format = null;
//		정수인지 실수인지 확인하는 변수 선언 및 초기화
		boolean isInteger = false;
//		소수점 이하 자릿수를 저장할 변수 선언 및 초기화
		int length = 0;
//		BigDecimal 객체를 사용해 정확한 실수 값을 저장할 변수 선언 및 초기화
		BigDecimal originalHeight = null;
	    BigDecimal exp = null;

//		메세지 출력
		System.out.println(message);
//		사용자가 입력한 키 값을 height 변수에 저장
		height = sc.nextDouble();
		
//		BigDecimal 객체로 키 값을 문자열로 변환하여 originalHeight에 저장
		originalHeight = new BigDecimal(String.valueOf(height));
//		정수 부분만 BigDecimal 객체로 변환하여 exp에 저장
	    exp = new BigDecimal(String.valueOf((int)height));

//		지수부만 가져와서 isInteger에 값 저장
		isInteger = (height- (int)height) == 0;
//		문자열로 바꾸는 것, length로 문자열 길이 구함 0.5는 3개 그래서 -2해줌
		length = originalHeight.subtract(exp).toString().length() - 2;
//		length = (height - (int)height + "").length()-2;
		
//		정수 여부에 따라 출력 형식 결정
		format = isInteger ? "%.0f" : "%." + length +"f";
//		키 값 출력
		System.out.printf(format, height);
	}
}
