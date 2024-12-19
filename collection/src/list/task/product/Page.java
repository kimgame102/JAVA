package list.task.product;

import java.util.Scanner;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String startMessage = "원하는 작업을 선택하세요.\n1. 상품 추가\n2. 상품 조회\n3. 상품 삭제\n4. 상품 수정\n5. 전체 조회\n6. 종료";
		ProductField productField = new ProductField();
		
		while(true) {
			System.out.println(startMessage);
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 6) {
				break;
			}
			
			switch(choice) {
			case 1: //상품 추가
				System.out.print("상품명 : ");
				String name = sc.nextLine();
				System.out.print("가격 : ");
				int price = sc.nextInt();
				Product newProduct = new Product(name, price);
				Product addProduct = productField.add(newProduct);
				if(addProduct != null) {
				System.out.println("추가 완료: " + newProduct);
				}else System.out.println("상품 중복");
				break;
			case 2: //상품 조회
				System.out.print("상품명 : ");
				String checkName = sc.nextLine();
				System.out.println(productField.checkProductName(checkName));
				break;
			case 3: //상품 삭제
				System.out.print("삭제할 상품명 : ");
				String deleteName = sc.nextLine();
				productField.remove(deleteName);
				break;
			case 4: //상품 수정
				System.out.print("상품명 : ");
                String updateName = sc.nextLine();
                System.out.print("가격 : ");
                int updatePrice = sc.nextInt();
                Product updateProduct = new Product(updateName, updatePrice);
                Product result = productField.updateDate(updateProduct);
                if(result != null) {
                System.out.println("개인정보 수정 완료: " + updateProduct);
                }else System.out.println("해당 상품이 없습니다.");
				break;
			case 5: // 상품 전체 조회
				System.out.println(DBConnecter.products);
				break;
			
			}
		}
	}
}
