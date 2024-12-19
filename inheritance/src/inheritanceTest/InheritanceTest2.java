package inheritanceTest;

class Animal{
	String name;
	int age;
	String feed;
	public Animal() {;}
	
	public Animal(String name, int age, String feed) {
		super();
		this.name = name;
		this.age = age;
		this.feed = feed;
	}



	void walk() {
		System.out.println("걷기");
	}
	
	void run() {
		System.out.println("뛰기");
	}
	
	void eat() {
		System.out.println("먹기");
	}
	
}

class Lion extends Animal{
	public Lion() {;}
	void hunt() {
		System.out.println("사냥하기");
	}
	
	//재정의할 부모의 메소드 이름을 적당히 작성한 뒤 Ctrl + SpaceBar 입력
	@Override //어노테이션
	void walk() {
		System.out.print("네 발로 ");
		super.walk(); //부모에 있는 walk를 가져다 사용
	}
	
}


public class InheritanceTest2 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		
		lion.walk(); //가까운 거 사용 
		lion.hunt();
		lion.eat();
	}
}
