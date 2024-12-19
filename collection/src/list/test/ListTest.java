package list.test;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {
	public static void main(String[] args) {
//		<?>: 제네릭(이름이 없는)
//		객체화 시 타입을 지정하는 기법
//		자료구조를 설계할 때 터이터의 타입을 지정할 수 없기 때문에 임시로 타입을 선언한다.
//		따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 때문에 Object가아닌 제네릭으로 선언한다.

		ArrayList<Integer> datas = new ArrayList<Integer>();//<>안에 무조건 객체타입 작성, 일반은 불가능

		datas.add(30);
		datas.add(10);
		datas.add(20);
		datas.add(40);
		datas.add(50);
		datas.add(38);
		datas.add(90);
		datas.add(80);
		
		System.out.println(datas);
		System.out.println(datas.size()); // ArrayList는 length가 아니라 size를 사용
		
//		정렬
		Collections.sort(datas); //정렬 .sort사용 / 오름차순
		System.out.println(datas);
		
//		가운데를 기준으로 좌우 바꾸기
		Collections.reverse(datas);
		System.out.println(datas);
		
//		섞기
		Collections.shuffle(datas);
		System.out.println(datas);
		
//      추가(삽입), 60은 항상 30뒤에 삽입된다.
      if(datas.contains(30)) {
   //      1. 30을 찾는다.
   //      ArrayList에 검색하는 메소드가 필요하다.
   //      System.out.println(datas.indexOf(30));
         
   //      2. 원하는 위치에 원하는 값을 넣는다.
         datas.add(datas.indexOf(30) + 1, 60);
         System.out.println(datas);
      }else {
         System.out.println("찾는 값이 없습니다.");
      }

//      수정, 10을 1로 수정한다.
      int originalData = 0;
      if(datas.contains(10)) {
         originalData = datas.set(datas.indexOf(10), 1);
         System.out.println(originalData);
         System.out.println(datas);
      }

//      삭제(값으로 삭제), 20을 삭제한다./
      if(datas.remove(Integer.valueOf(20))) {
         System.out.println("삭제 성공");
         System.out.println(datas);
      }

//      삭제(인덱스로 삭제), 50을 삭제한다.
		int originalData1 = 0;
		if (datas.contains(50)) {
			originalData1 = datas.remove(datas.indexOf(50));
			System.out.println(originalData1);
			System.out.println(datas);
		}

	}
}
