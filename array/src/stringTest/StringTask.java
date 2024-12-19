package stringTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
//      사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.

//      String message = "영어로 문장을 입력해주세요";
//      Scanner sc = new Scanner(System.in);
//      String data = null;
//      String result = "";
//      
//      System.out.println(message);
//      data = sc.nextLine(); //사용자가 입력한 값을 data에 저장
//      
////			for문으로 사용자가 입력한 문자열 검사
//      for (int i = 0; i < data.length(); i++) {
//         char ch = data.charAt(i);// data에 있는 i번째 데이터를 ch에 저장
//         if(ch >= 97 && ch <= 122) { // 소문자 검사(아스키코드)
//            result += (char)(ch - 32);// 대문자로 바꾼 후 result에 저장
//            
//         }
//         else if(ch >= 65 && ch <= 90) { // 대문자 검사(아스키코드)
//            result += (char)(ch + 32); // 소문자로 바꾼후 result에 저장
//            
//         }else {//영어말고 다른 문자 나올 시 그대로 출력
//            result += ch;
//         }
//      }
//      
//      System.out.println(result);//result값 출력
//=============================================================
//      정수를 한글로 변경한다.
//      입력 예) 1024
//      출력 예) 일공이사

//		String message = "정수 입력: ";
//		Scanner sc = new Scanner(System.in);
//		String data = null;
//		int number = 0;
//		String hangle = "공일이삼사오육칠팔구";
//		String result = "";
//
//		System.out.println(message);

//		data = sc.next(); // 사용자가 입력한 값 data에 저장
//		for (int i = 0; i < data.length(); i++) { //data값 검사
//			result += hangle.charAt(data.charAt(i) - 48); // 결과값 저장 += 한글에서 몇 번째인지 (입력한 숫자 0이 문자로 48이어서 -48)
//		}
//
//		System.out.println(result);
//-------------밑에도 가능----------------------------------------------------------
//		number = sc.nextInt(); // 숫자 입력 받음
//
//		while (number != 0) { // 0이 들어올때까지 계속 반복
//			result = hangle.charAt(number % 10) + result; //입력받은 숫자를 %연산으로 일의 자리숫자만 출력해서 그 값을 hangle에서 찾아서 result에 저장, 꼭 result가 뒤에 있어야함
//			number /= 10; // 10을 계속 나눠줌으로 점차 앞자리수를 구할 수 있음 
//		}
//
//		System.out.println(result);
		
		// ==============================================================
		
//      한글을 정수로 변경한다.
//      입력 예) 일공이사
//      출력 예) 1024
//		String hangle = "공일이삼사오육칠팔구";
//		String message = "정수를 한글로 입력: ";
//		Scanner sc = new Scanner(System.in);
//		String data = null;
//		String temp = "";
//		int result = 0;
//
//		System.out.println(message);
//		data = sc.next();
//
//		
//		for (int i = 0; i < data.length(); i++) { //0부터 입력받은 data 길이까지 반복
//			temp += hangle.indexOf(data.charAt(i));//입력받은 값이 hangle에서 몇 번째에 있는지 확인, charAt(i)는 i번째에 무슨 값이 있는지
//		}
//
//		result = Integer.parseInt(temp); //정수로 바꿔주기 위함(문자열이니까)
//		System.out.println(result); //결과 출력(정수)

//      아래의 주소에서 "/news"만 분리하여 출력한다.
//      www.naver.com/news

//      String data = "www.naver.com/news"; //data 변수 생성 및 초기화
//      int fromIndex = data.indexOf("/"); // data에서 "/"값이 어디 있는지 int로 fromIndex에 저장
//      String result = data.substring(fromIndex); // substring을 사용해서 fromIndex에서 뒷부분까지 result에 문자열로 저장
//      
//      System.out.println(result); //result 문자열 출력
	}
}
