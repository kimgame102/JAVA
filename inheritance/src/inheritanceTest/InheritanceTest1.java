package inheritanceTest;

class A{//부모 클래스
	String name;
	int age;
	
	public A() {;} //A에 기본생성자가 없으면, 자식 클래스에서 오류가 발생
	
	public A(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	
}

//자식 클래스
class B extends A{
	public B() {
		super(); // 부모 클래스 접근, super에는 부모 필드, this는 자기 자신 필드 
		System.out.println("자식 생성자 호출");
	}
	public B(String name, int age) {
		super(name, age); // 사용, A필드 접근
	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B b = new B("한동석", 20); //B에 있는 필드를 메모리에 올림
		System.out.println(b.name);
		System.out.println(b.age);
		b.printInfo();
	}
}
