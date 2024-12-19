package myjob;

import java.util.Scanner;

public class MyJob {
	public static void main(String[] args) {
		String title = "***최고의 판사 되기***";
		String chooseMessage = "숫자를 입력하세요: ";
		String message = "1. 판결 하기\n2. 정보 보기\n3. 종료";
		Scanner sc = new Scanner(System.in);
		String[] arRank = { "일반 판사", "지방법원 부장 판사", "고등법원 부장 판사", "고등법원장", "대법관" };
		
		
		String name = "";
		int money = 0, choice = 0;
		int successCount = 0, failCount = 0;
		
		// 이름이랑, 가지고 있는 돈 입력받기
		System.out.print("이름을 입력하세요: ");
		name = sc.nextLine();
		System.out.print("가지고 있는 돈(원)을 입력하세요: ");
		money = sc.nextInt();
		
		Judge gildong = new Judge(name, money, 67, 0); //이름, 돈, 성공 확률, 등급

		while (true) {
			System.out.println(title);
			System.out.println(message);
			System.out.print(chooseMessage);
			choice = sc.nextInt();

			if (choice == 3) {
				break;
			}

			switch (choice) {
			case 1:
				if (gildong.decide()) { // decide가 true일 때, 즉 성공했을 때
					gildong.money += 500_000;
					gildong.successCount++; // 정보보기를 위해, 데이터를 남겨놓기 위함
					successCount++; // 몇 회 성공중인지 알려주기 위함
					failCount = 0;//성공했으므로 실패 카운트  초기화

					System.out.println("\n★☆★☆★☆★☆★☆올바른 판결★☆★☆★☆★☆★☆");
					System.out.println("현재 연속 " + successCount + "회 성공중!");
					if (successCount % 3 == 0) {// 3번 할때마다 승급
						if (gildong.rank < 4) {
							gildong.rank++;
							System.out.println(arRank[gildong.rank] + "(으)로 승급!!! 축하합니다!");
						}
						if (gildong.rank == 4) { // 최고 등급일때 알려주기
							System.out.println("!!최고 등급입니다!!\n");
						}
					}
					break;
				}
				//else 작성과 동일, decide가 false일 때, 즉 실패했을 때
				gildong.money -= 800_000;
				gildong.failCount++; 
				failCount++;
				successCount = 0;
				System.out.println("\n실패...");
				System.out.println("위험!! 현재 연속 " + failCount + "회 실패중!");

				if (failCount % 2 == 0) { // 2번 연속 했을경우 강등
					if (gildong.rank > 0) {
						gildong.rank--;
						System.out.println(arRank[gildong.rank] + "(으)로 강등ㅠㅠㅠㅠ 분발하세요!");
					}
					if(gildong.rank == 0) {
						System.out.println("ㅠㅠㅠ최저 등급입니다ㅠㅠㅠ\n");
					}
				}
				break;

			case 2:
				gildong.printInfo();
				break;

			}

		}
	}
}
