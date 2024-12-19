package arrayTest;

import java.util.Iterator;

public class ArrTest {
	public static void main(String[] args) {
//		2차원: 행 열
//		3차원: 면 행 열
//		4차원: 의 면 행 열
		int[][] arrData = { 
				{ 3, 4, 5 }, 
				{ 7, 8, 9 } 
		};
		
//		각 값을 순서대로 출력
//		arrData 행렬의 행값과 열값을 곱해서 length에 저장한다.
//		int length = arrData.length * arrData[0].length;
//		0부터 length까지 증가한다.
//		for (int i = 0; i < length; i++) {
//		[0][1],[0][2]....[1][2]까지 순서대로 가는 방법
//		0~2까지 3으로 나누면 0, 나머지는 0, 1, 2 순으로 출력
//			System.out.print(arrData[ i /3 ][i % 3]);
//		i가 2일 때 줄바꿈
//			if(i==2) {
//				System.out.println();
//			}
//		}
		
//		for문 2개 보통 이걸 많이 사용
//		0부터 arrData.length까지 1씩 증가, arrData.length는 행의 개수
//		arrDAta.length는 행의 개수
		for (int i = 0; i < arrData.length; i++) {
//			arrData[i]를 넣으므로 비정방 이어도 데이터 출력 가능
//			arrData[i].length는 열의 개수
			for (int j = 0; j < arrData[i].length; j++) { 
				System.out.print(arrData[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
