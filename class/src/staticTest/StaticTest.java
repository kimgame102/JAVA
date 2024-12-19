package staticTest;

class Data{
	int data = 0;
	static int data_s = 10;
	
	public Data() {;} // 기본 생성자 무조건 만들기
	
	public Data(int data) {
		this.data = data;
	}



	void increase() {
		System.out.println(++data); //this.data -> this생략
		
	}
	
	static void increase_s() {
		System.out.println(++data_s);
	}
	
}



public class StaticTest {
	public static void main(String[] args) {
		Data data1 = new Data();
		Data data2 = new Data();
		
		
		
		
//		data2.increase_s();
//		data2.increase_s();
//		data2.increase_s();
//		data2.increase_s();
//		data2.increase_s();
//		
//		data2 = new Data(); // static을 사용하면, new에 영향을 받지 않는다. , 생성자가 만드는 것이 아니다. 생성자의 영향이 없다., 컴파일러가 직접 올려줌
//		
//		data2.increase_s();
//		data2.increase_s();
//		data2.increase_s();
//		data2.increase_s();
//		data2.increase_s();
		
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
		
//		위에 Data data1 = new Data(5);이거와 저장공간이 다름
		// static을 사용하면 new에 영향을 받는다. 
//		data1 = new Data(5); 
//		
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
		
		
		
		
	}
}
