package arrayTest;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//      브론즈
//      1 ~ 10까지 배열에 담고 출력
//      10번 반복하는 for문 만들기
//		정수형 배열을 선언하고 초기화, 10개의 수가 들어감
//      int[] arData = new int[10];
//      
//		i가 0부터 9까지 반복하면서 배열에 1부터 10까지의 값을 저장
//      for (int i = 0; i < 10; i++) {
//         arData[i] = i + 1;
//      }
//      
//		배열의 모든 값을 출력
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

//      10 ~ 1까지 중 짝수만 배열에 담고 출력
//		짝수 5개를 담을 배열 선언 및 초기화 / 배열에 5개 들어감
//      int[] arData = new int[5];
//      
//		0부터 4까지 반복하면서 배열에 10부터 2까지의 짝수를 저장
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (5 - i) * 2;
//      }
//      
//		배열의 모든 값을 출력
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

//      1 ~ 100까지 배열에 담은 후 홀수만 출력
//		100개의 정수를 담을 배열 선언 및 초기화
//      int[] arData = new int[100];
//      
//		0부터 99까지 반복하면서 배열에 1부터 100까지의 값을 저장
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }

//		배열의 값을 확인하면서 홀수만 출력
//      for (int i = 0; i < arData.length; i++) {
//         if(arData[i] % 2 == 1) { // ardata 값이 홀수 인 경우
//            System.out.println(arData[i]);
//         }
//      }

//		배열의 홀수 인덱스 값을 출력 (0부터 99까지 반복)
//      for (int i = 0; i < 50; i++) {
//         System.out.println(arData[i * 2]);
//      }

//      실버
//      1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//		100개의 정수를 담을 배열 선언 및 초기화
//      int[] arData = new int[100];
//		결과값을 저장할 변수 선언 및 초기화
//      int result = 0;
//      
//		0부터 99까지 반복하면서 배열에 1부터 100까지의 값을 저장하고 짝수인 경우 합산
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//         if (arData[i] % 2 == 0) { // 값이 짝수인 경우
//            result += arData[i]; 	//짝수 값 합산
//         }
//      }
//      
//      System.out.println(result); // 짝수의 합 출력

//      A ~ F까지 배열에 담고 출력
//		6개의 문자를 담을 배열 선언 및 초기화
//      char[] arData = new char[6];
//      
//		0부터 5까지 반복하면서 배열에 'A'부터 'F'까지의 문자를 저장
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(65 + i); //ASCII 코드 65는 'A'
//      }
//      
//		배열의 모든 값을 출력
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

//      A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//		5개의 문자를 담을 배열 선언 및 초기화
//      char[] arData = new char[5];
//      
//		0부터 4까지 반복하면서 배열에 'A'부터 'F'까지의 문자 중 'C' 제외하고 저장
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//      }
//      
//		배열의 모든 값을 출력
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

//     골드
//     5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//     비교하기 위해서는 항이 2개가 필요하다.

//		정수 5개를 담을 배열 선언 및 초기화
//		int[] arData = new int[5];
//		입력을 받기 위해 scanner 클래스 생성
//		Scanner sc = new Scanner(System.in);
//		최대값 최소값을 저장할 변수 선언 및 초기화
//		int max = 0, min = 0;
//		사용자에게 보여줄 메시지 선언
//		String message = "숫자 5개를 입력하세요.\n예) 1 2 3 4 5";
//
//		메시지 출력
//		System.out.println(message);
//
//		0부터 4까지 반복하면서 사용자로부터 입력받은 값을 배열에 저장
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//
//		}
//		최대값과 최소값 초기화 (배열의 첫 번째 값으로 설정)
//		max = arData[0];
//		min = arData[0];
//
//		1부터 4까지 반복하면서 최대값과 최소값을 찾음
//		이미 max와 min에 0번째 값을 담아놓았기 때문에, 1부터 시작
//		for (int i = 1; i < arData.length; i++) {
//			if (max < arData[i]) {  // 현재 값이 최대값보다 크면
//				max = arData[i];    // 최대값 갱신
//			}
//			if (min > arData[i]) {  // 현재 값이 최소값보다 작으면
//				min = arData[i];	// 최소값 갱신
//			}
//		}
//		최대값과 최소값 출력
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
//		

//      다이아
//      사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//      입력한 정수들의 평균값을 구한다.
//		배열 선언 및 초기화 (초기에는 null) / 배열에 뭐가 있는지 아무것도 모르기 때문
		int[] arData = null;
//		입력받을 준비 scanner 생성
		Scanner sc = new Scanner(System.in);
//		사용자에게 보여줄 메시지 생성
		String message1 = "몇 개의 정수를 입력하시나요?";
		String message2 = "번 정수: ";

//		입력받은 정수 개수와 합계를 저장할 변수 선언 및 초기화
		int size = 0, total = 0;

//		메세지 출력
		System.out.println(message1);
//		사용자로부터 정수 개수를 입력받아 size변수에 저장
		size = sc.nextInt();

//		입력 받은 크기로 배열 생성
		arData = new int[size];

//		0부터 size-1까지 반복하면서 사용자로부터 정수를 입력받아 배열에 저장
		for (int i = 0; i < arData.length; i++) {
			System.out.print(i + 1 + message2);
			arData[i] = sc.nextInt();
		}
//		배열의 모든 값을 더해 total 변수에 저장
		for (int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
//		입력받은 정수들의 평균값을 출력 (double로 형변환하여 소수점까지 출력)
		System.out.println((double) total / arData.length);

//		문제 1: 7개의 정수를 입력받고 배열에 담은 후 
//			  입력한 정수들의 평균값을 구한다.

//		Scanner sc = new Scanner(System.in);
//		int[] arData = new int[7];
//		int total = 0;
//		String message1 = "7개의 정수를 입력해주세요.";
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i + 1 + "번째 ");
//			arData[i] = sc.nextInt();
//		}
//		for (int i = 0; i < arData.length; i++) {
//			total += arData[i];
//		}
//		System.out.println("평균은 : " + (double)total / arData.length);

//		문제 2: 10개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		Scanner sc = new Scanner(System.in);
//		int[] arData = new int[10];
//		int max = 0, min = 0;
//		String message = "숫자 10개를 입력하세요.\n예) 1 2 3 4 5 6 7 8 9 10";
//
//		System.out.println(message);
//
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//		}
//
//		max = arData[0];
//		min = arData[0];
//		for (int i = 1; i < arData.length; i++) {
//			if (max < arData[i]) {
//				max = arData[i];
//			}
//			if (min > arData[i]) {
//				min = arData[i];
//			}
//		}
//		System.out.println("최대 값: " + max);
//		System.out.println("최소 값: " + min);

//		문제 3: 1~100까지 배열을 담은 후 짝수만 출력하시오.
//		int[] arData = new int[100];
//
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			if (arData[i] % 2 == 0) {
//				System.out.println(arData[i]);
//			}
//		}

//		문제 4: 사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//			   그 후, 최대값과 최소갑을 구하고 그 둘의 합을 출력하시오.
//		Scanner sc = new Scanner(System.in);
//		int[] arData = null;
//		String message1 = "입력하고 싶은 칸수는?";
//
//		System.out.println(message1);
//		int size = 0, max = 0, min = 0, total = 0;
//
//		size = sc.nextInt();
//
//		arData = new int[size];
//
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i + 1 + "번째: ");
//			arData[i] = sc.nextInt();
//		}
//		max = arData[0];
//		min = arData[0];
//		for (int i = 1; i < arData.length; i++) {
//			if (max < arData[i]) {
//				max = arData[i];
//			}
//			if (min > arData[i]) {
//				min = arData[i];
//			}
//
//		}
//		total = max + min;
//		System.out.println("최대 값: " + max);
//		System.out.println("최소 값: " + min);
//		System.out.println("두 수의 합: " + total);
		
		
//		문제 5번: 1~100까지 배열을 담은 후 홀수의 합 출력
//		Scanner sc = new Scanner(System.in);
//		int[] arData = new int[100];
//		int total = 0;
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i] % 2 == 1 ) {
//				total += arData[i];
//			}
//		}
//		System.out.println(total);
	}
}
