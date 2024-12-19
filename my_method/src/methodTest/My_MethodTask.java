package methodTest;

import java.util.Scanner;

public class My_MethodTask {

//	1~10까지 println()으로 출력하는 메소드
	void printTen() { // 받을 데이터가 없어서 매개변수 필요 없음
		for (int i = 0; i < 10; i++) {// 0~9까지 1씩 증가
			System.out.println(i + 1);// 1~10까지 출력
		}
	}
// ==============================================================

//	홍길동을 n번 println()으로 출력하는 메소드
	void printName(int count) { // 사용자에게 count를 입력받는 메소드
		for (int i = 0; i < count; i++) { // 0 ~ count-1까지 증가
			System.out.println(i + 1 + "번" + " 홍길동");
		}
	}
// ==============================================================

//	이름을 n번 println()으로 출력하는 메소드
	void printName2(String name, int count) { // 이름과 n번을 입력 받아야하기 때문에 매개변수도 2개
		for (int i = 0; i < count; i++) { // 0~count-1까지 증가
			System.out.println(name); // 사용자가 입력한 name, n번 출력
		}
	}
// ==============================================================

//	세 정수의 뺄셈 메소드
	int sub(int num1, int num2, int num3) {// 세 정수를 빼야해서 매개변수 3개
		int result = num1 - num2 - num3; // 뺄셈을 바로 리턴 하면서 리턴 값이 정수이기에 리턴 타입도 int
		return result;
	}
// ==============================================================

//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//	return 값은 반드시 1개만 가능하다.
	int[] divide(int number1, int number2) {// 2개의 값을 리턴해줘야 하기 때문에 int[] 배열 사용
		int[] result = null; // result 배열 초기화

		if (number2 != 0) { // number2가 0이 아니면, 즉 0으로 나누는게 아니면 아래식 진행
			result = new int[] { number1 / number2, number1 % number2 }; // []안에 값을 바로 집어 넣어도 됨
//			result = new int[2]; //크기가 2인 result배열 선언
//			result[0] = number1 / number2; //0주소에 나누기 연산 저장
//			result[1] = number1 % number2; // 1주소에 나머지 연산 저장

		}
		return result;
	}
// ==============================================================

//	 성과 이름 두개를 받은 뒤
//	 성과 이름을 그대로 리턴한다.
	String[] fullName(String first, String last) {
		String[] result = new String[] { first, last };
//		String[] result = null;
//		result = new String[2];
//
//		result[0] = first;
//		result[1] = last;

		return result;

	}
// ==============================================================

//	1 ~ n 까지의 합을 구해주는 메소드
	int bout(int num) {
		int result = 0;
		for (int i = 0; i < num; i++) {
			result += i + 1;
		}
		return result;
	}
// ==============================================================

//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int changeToOddToEven(int num) {
//		int result = num + 1;
//		return result;
		return ++num;
	}
// ==============================================================

//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String changeEnglish(String en) {
		String result = "";
		
		for (int i = 0; i < en.length(); i++) {
			char ch = en.charAt(i); // data에 있는 i번째 데이터를 ch에 저장

			if (ch >= 97 && ch <= 122) { // 소문자 검사(아스키코드)
				result += (char) (ch - 32); // 대문자로 바꾼 후 result에 저장
			} else if (ch >= 65 && ch <= 90) { // 대문자 검사(아스키코드)
				result += (char) (ch + 32); // 소문자로 바꾼후 result에 저장

			} else {// 영어말고 다른 문자 나올 시 그대로 출력
				result += ch;
			}
		}
		return result;
	}

// ==============================================================
//	한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
	int changeInteger(String data) {
		String temp = "";
		String hangle = "공일이삼사오육칠팔구";
		int result = 0;

		for (int i = 0; i < data.length(); i++) { // 0부터 입력받은 data 길이까지 반복
			temp += hangle.indexOf(data.charAt(i));// 입력받은 값이 hangle에서 몇 번째에 있는지 확인, charAt(i)는 i번째에 무슨 값이 있는지
		}

		result = Integer.parseInt(temp); // 정수로 바꿔주기 위함(문자열이니까)
		return result;
	}
// ==============================================================
// 	정수를 한글로 바꿔주는 메소드(1024 -> 일공이사)

	String changeHangle(int data) {
		String hangle = "공일이삼사오육칠팔구";
		String result = "";

		while (data != 0) { // 0이 들어올때까지 계속 반복
			result = hangle.charAt(data % 10) + result; // 입력받은 숫자를 %연산으로 일의 자리숫자만 출력해서 그 값을 hangle에서 찾아서 result에 저장, 꼭
														// result가 뒤에 있어야함
			data /= 10; // 10을 계속 나눠줌으로 점차 앞자리수를 구할 수 있음
		}
		return result;
	}

// ==============================================================
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	int[] getMaxAndMin(int[] data) {

		int[] result = new int[2];
		result[0] = data[0];
		result[1] = data[0];

		for (int i = 1; i < data.length; i++) {
			if (result[0] < data[i]) { // 현재 값이 최대값보다 크면
				result[0] = data[i]; // 최대값 갱신
			}
			if (result[1] > data[i]) { // 현재 값이 최소값보다 작으면
				result[1] = data[i]; // 최소값 갱신
			}
		}
		return result;
	}
//-------------밑에 void만 사용--------------------------------------
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//	upgrade: 리턴 타입은 void로 하되, 사용하는 부분에서 결과를 쓸 수 있다.
	void getMaxAndMin2(int[] data, int[] result) {

		result[0] = data[0];
		result[1] = data[0];

		for (int i = 1; i < data.length; i++) {
			if (result[0] < data[i]) { // 현재 값이 최대값보다 크면
				result[0] = data[i]; // 최대값 갱신
			}
			if (result[1] > data[i]) { // 현재 값이 최소값보다 작으면
				result[1] = data[i]; // 최소값 갱신
			}
		}
	}

	public static void main(String[] args) {
// ==============================================================
//		1~10까지 println()으로 출력하는 메소드

//		new My_MethodTask()를 바로 작성해도 됨
//		My_MethodTask methodTask = new My_MethodTask();
//
//		methodTask.printTen();

// ==============================================================
//		홍길동을 n번 println()으로 출력하는 메소드

//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		String numMessage = "반복 횟수 입력: ";
//		
//		System.out.print(numMessage);
//		
//		num = sc.nextInt();
//		
//		My_MethodTask methodTask = new My_MethodTask();
//		methodTask.printName(num);

// ==============================================================
//		이름을 n번 println()으로 출력하는 메소드

//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		String name = "";
//		String nameMessage = "이름은? ";
//		String numMessage = "반복 횟수 입력: ";
//		
//		System.out.print(nameMessage);
//		name = sc.nextLine();
//		
//		System.out.print(numMessage);
//		num = sc.nextInt();
//		
//		My_MethodTask methodTask = new My_MethodTask();
//		methodTask.printName2(name, num);

// ==============================================================
//   	세 정수의 뺄셈 메소드

//		My_MethodTask methodTask = new My_MethodTask();
//		int result = methodTask.sub(4, 2, 1);
//		System.out.println(result);

// ==============================================================
//   	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드

//		My_MethodTask methodTask = new My_MethodTask();
//		
//		 int[] result = methodTask.divide(10, 4);
//	      String resultMessage = null;
//	      
//	      if(result == null) {
//	         resultMessage = "0 으로 나눌 수 없습니다.";
//	      }else {
//	         resultMessage = "몫: " + result[0] + "\n나머지: " + result[1];
//	      }
//	      
//	      System.out.println(resultMessage);

// ==============================================================
//		성과 이름 두개를 받은 뒤
//		성과 이름을 그대로 리턴한다.

//		My_MethodTask methodTask = new My_MethodTask();
//		
//		String[] result = methodTask.fullName("석", "상훈");
//	    System.out.println(result[0]+result[1]);  

// ==============================================================
//		1 ~ n 까지의 합을 구해주는 메소드

//		My_MethodTask methodTask = new My_MethodTask();
//		
//		int result = methodTask.bout(11);
//		System.out.println(result);

// ==============================================================
//		홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드

//		Scanner sc = new Scanner(System.in);
//		String inputMessage = "숫자를 입력해주세요. ";
//		
//		System.out.print(inputMessage);
//		int num = sc.nextInt();
//		
//		My_MethodTask methodTask = new My_MethodTask();
//		
//		int result = methodTask.changeToOddToEven(num);
//		String message = "로 바뀌었습니다.";
//		String temp = result % 2 == 0 ? "짝수" : "홀수"; //if 보단 삼항으로
//		
//		System.out.println(temp + message);
// ==============================================================
//		문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드

//		String message = "영어로 문장을 입력해주세요";
//		Scanner sc = new Scanner(System.in);
//		String data = null;
//
//		System.out.println(message);
//		data = sc.nextLine(); // 사용자가 입력한 값을 data에 저장
//		
//		My_MethodTask methodTask = new My_MethodTask();
//		
//		String result = methodTask.changeEnglish(data);
//		System.out.println(result);
// ==============================================================
		// 한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)

//		String message = "정수를 한글로 입력: ";
//		Scanner sc = new Scanner(System.in);
//		String data = null;
//
//		My_MethodTask methodTask = new My_MethodTask();
//
//		System.out.println(message);
//		data = sc.next();
//		
//		int result = methodTask.changeInt(data);
//		System.out.println(result);
// ==============================================================
//	 	정수를 한글로 바꿔주는 메소드(1024 -> 일공이사)
//		Scanner sc = new Scanner(System.in);
//		String message = "정수 입력: ";
//		int data = 0;
//		
//		My_MethodTask methodTask = new My_MethodTask();
//		
//		System.out.print(message);
//		data = sc.nextInt();
//		
//		String result = methodTask.changeHangle(data);
//		System.out.println(result);
// ==============================================================
//	 	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//		Scanner sc = new Scanner(System.in);
//		String inputMessage = "5개의 정수 입력: ";
//		int[] arData = new int[5];
//		int[] result = null;
//
//		System.out.println(inputMessage);
//
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//		}
//
//		My_MethodTask methodTask = new My_MethodTask();
//
//		result = methodTask.getMaxAndMin(arData);
//		int max = result[0];
//		int min = result[1];
//		System.out.print("최대값 : " + max);
//		System.out.print("\n최소값 : " + min);
// ==============================================================
//	 	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//		void만 사용
//		Scanner sc = new Scanner(System.in);
//		String inputMessage = "5개의 정수 입력: ";
//		int[] arData = new int[5];
//		int[] result = new int[2];
//
//		System.out.println(inputMessage);
//
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//		}
//
//		My_MethodTask methodTask = new My_MethodTask();
//
//		methodTask.getMaxAndMin2(arData, result);
//		
//		int max = result[0];
//		int min = result[1];
//		System.out.print("최대값 : " + max);
//		System.out.print("\n최소값 : " + min);
// ==============================================================

	}
}
