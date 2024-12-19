package myjob;

import java.text.DecimalFormat;
import java.util.Random;

//기획
//  
//판사
//1) 판단
//	성공 시 60%
//		50만원 ++
//	실패 시 40%
//		80만원 --
//
//	3번 연속 성공할 때마다 
//		다음 등급으로 승진
//
//	연속 2회 실패시 강등
//		이전 등급으로 강등
//
//
//	1-1) 등급
//		일반 판사
//		지방법원 부장 판사
//		고등법원 부장 판사
//		고등법원장
//		대법관
//
//	
//2) 정보 보기
//   이름
//   성공 횟수
//   실패 횟수
//   현재 잔액
public class Judge {
	   String name;
	   int successCount;
	   int failCount;
	   int money;
	   int rating;
	   int rank;
	   
	   
	   public Judge(String name, int money, int rating, int rank) {
	      this.name = name;
	      this.money = money;
	      this.rating = rating;
	      this.rank = rank;
	   }

	   boolean decide(){
	      Random random = new Random();
	      int[] arData = new int[100]; //60%니까 10개, 64%같이 일의 자리에도 있으면 100개 선언
	      int randomIndex = 0; 
	      
	      for (int i = 0; i < rating; i++) {
	         arData[i] = 1;
	      }
	      
	      randomIndex = random.nextInt(arData.length);
	      
	      return arData[randomIndex] == 1;
	      
//	      if(arData[randomIndex] == 1) {
//	         return true;
//	      }
//	      
//	      return false;
	   }
	   
	   void printInfo() {
		  DecimalFormat df = new DecimalFormat("###,###"); //money 천단위 콤마찍기
		  String formatMoney = df.format(this.money);
		  
	      String infoMessage = "이름: " + this.name + "\n"
	            + "성공횟수: " + this.successCount + "번\n"
	                  + "실패 횟수: " + this.failCount + "번\n"
	                        + "현재 잔액: " + formatMoney + "원\n";
	      System.out.println(infoMessage);
	   }
}
