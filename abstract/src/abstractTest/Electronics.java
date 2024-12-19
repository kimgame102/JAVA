package abstractTest;

public abstract class Electronics {
	public abstract void on();//조건 구현해야된다.
	public abstract void off();//추상 메소드
	
//	재정의 선택
	public void printProduct() {
		System.out.println("전자제품");
	}
	
//	재정의 하지 마라
	public final void sos() { //다른 곳에서 변경 불가
		System.out.println("긴급 전화 119 연락");
	}
	
}
