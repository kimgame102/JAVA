package list.task;

import java.util.ArrayList;

import list.task.food.Food;
import list.task.fruit.Fruit;
import list.task.product.Product;
import list.task.user.User;

public class DBConnecter {
	
//	생성자에 protected를 작성하여 외부에서 DBConnecter를 객체화 할 수 없게 막아준다.
//	단, 상속받은 자식 클래스에서는 사용할 수 있다.
//	그것도 싫으면 private으로 작성한다.
	
	protected DBConnecter() {;}
	
	public static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	public static ArrayList<Food> foods = new ArrayList<Food>();
	public static ArrayList<User> users = new ArrayList<User>();
	public static ArrayList<Product> products = new ArrayList<Product>();
}