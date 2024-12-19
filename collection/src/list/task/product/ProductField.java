package list.task.product;

import java.util.ArrayList;

import list.task.DBConnecter;

public class ProductField {
	
//	동일 상품 검사
	public Product findByproduct(String name) {
		Product product = null;
		for (int i = 0; i < DBConnecter.products.size(); i++) {
			if(DBConnecter.products.get(i).getName().equals(name)) {
				product = new Product(DBConnecter.products.get(i));
			}
		}
		return product;
	}
	
	// 상품 추가 - 이름, 가격
	public Product add(Product product) {
		Product foundProduct = findByproduct(product.getName());
		if(foundProduct != null) { //중복된 아이디가 있다면
			return null;
		}
		DBConnecter.products.add(product); // 아이디가 없으면 아이디 생성
		return product;
	}
	
	
	// 상품 조회
	public Product checkProductName(String name) {
		ArrayList<Product> products = (ArrayList<Product>) DBConnecter.products.clone();
		
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getName().equals(name)) {
				return products.get(i);
			}
		}
		return null;
		
	}
	// 상품 삭제
	public void remove(String name) {
		Product foundProduct = findByproduct(name);
		DBConnecter.products.remove(foundProduct);
	}
	
	// 상품 수정 //입력 받고, 상품명 검사하고, 데이터 수정하고
	public Product updateDate(Product product) {
		Product dbProduct = null;
		
		for (int i = 0; i < DBConnecter.products.size(); i++) {
			dbProduct = DBConnecter.products.get(i);
			if(dbProduct.getName().equals(product.getName())){
				product.setPrice(product.getPrice());
				DBConnecter.products.set(i, product);
				return product;
			}
		}
		return null;
	}
	
	
	
	
//	원하는 음식 개수 조회?
	
}











