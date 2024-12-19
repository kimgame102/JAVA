package stringTest;

public class My_StringTest {
	public static void main(String[] args) {
//		문자열은 문자배열이다.
//		문자열 선언
		String data = "ABC";
		
//		데이터 길이 출력
		System.out.println(data.length());
		
//		0번째에 데이터 출력
		System.out.println(data.charAt(0));
		
//		B가 어디있는지 출력
		System.out.println(data.indexOf('C'));
	}
}
