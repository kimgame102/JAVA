package methodTest;

import java.util.Iterator;

public class MethodTask {
//   1 ~ 10까지 println()으로 출력하는 메소드
	void printFrom1To10() { //return 값이 없으므로 매개변수 필요 없음
		for (int i = 0; i < 10; i++) { // 0~9까지 1씩 증가
			System.out.println(i + 1); // 1~10까지 출력
		}
	}

//   "홍길동"을 n번 println()으로 출력하는 메소드
	void printHong(int count) { //사용자에게 count를 입력받는 메소드
		for (int i = 0; i < count; i++) { // 0 ~ count-1까지 증가
			System.out.println("홍길동");  
		}
	}

//   이름을 n번 println()으로 출력하는 메소드
	void printName(String name, int count) { //이름과 n번을 입력 받아야하기 때문에 매개변수도 2개 
		for (int i = 0; i < count; i++) {	//0~count-1까지 증가
			System.out.println(name);		//사용자가 입력한 name, n번 출력
		}
	}

//   세 정수의 뺄셈 메소드
	int subtract(int number1, int number2, int number3) {//세 정수를 빼야해서 매개변수 3개
		return number1 - number2 - number3; // 뺄셈을 바로 리턴 하면서 리턴 값이 정수이기에 리턴 타입도 int
	}

//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//   return 값은 반드시 1개만 가능하다.
	int[] divide(int number1, int number2) { // 2개의 값을 리턴해줘야 하기 때문에 int[] 배열 사용
		int[] result = null;	// result 배열 초기화를 왜하지이???????????????????????????????????

		if (number2 != 0) {	//number2가 0이 아니면, 즉 0으로 나누는게 아니면 아래식 진행
			result = new int[] { number1 / number2, number1 % number2 };  // 
//         result = new int[2];
//         result[0] = number1 / number2;
//         result[1] = number1 % number2;

		}
		return result;
	}

// 1 ~ n 까지의 합을 구해주는 메소드
	int getTotal(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += i + 1;
		}
		return result;
	}
	
//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int changeToOddToEven(int number) {
		return ++number;
	}

	public static void main(String[] args) {
		MethodTask methodTask = new MethodTask();
//      methodTask.printFrom1To10();
//      methodTask.printHong(10);
//      methodTask.printName("한동석", 5);
//      int result = methodTask.subtract(3, 2, 1);
//      System.out.println(result);
		
		int[] result = methodTask.divide(10, 3);
		String resultMessage = null;

		if (result == null) {
			resultMessage = "0 으로 나눌 수 없습니다.";
		} else {
			resultMessage = "몫: " + result[0] + "\n나머지: " + result[1];
		}

		System.out.println(resultMessage);
		
//		int result = methodTask.changeToOddToEven(11);
//		String message = "로 바뀌었습니다.";
//		String temp = result % 2 == 0 ? "짝수" : "홀수";
//		
//		System.out.println(temp + message);
		
	}

}

















