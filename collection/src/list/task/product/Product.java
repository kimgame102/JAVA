package list.task.product;

import java.util.Objects;

public class Product {
//  User의 필드 구성
	private String name;
	private int price;
	
	public Product() {;}
	
	public Product(Product product) {
		this(product.getName(), product.getPrice());
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return name.equals(other.name);
	}
	
	
}
