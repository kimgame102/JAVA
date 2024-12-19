package classTest;

class A{
//	전역변수
	int data;
//	지역변수
	A(int data){ 
		System.out.println("생성자 호출");
		System.out.println(this);
		this.data = data;
	}
	
	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
//		객체화
		A a = new A(20);
		A b = new A(10);
		
		a.printData();
		b.printData();
	}
}
