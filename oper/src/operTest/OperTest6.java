package operTest;

public class OperTest6 {
	public static void main(String[] args) {
//		1~10까지 중 4까지만 출력한다.
//		for (int i = 0; i < 10; i++) {
//			
//			System.out.println(i+1);
//			i가 3일때 for문을 벗어난다.
//			if(i ==3) {
//				break;
//			}
//			
//		}
//		1~10까지 중 4를 제외하고 출력한다.
		for (int i = 0; i < 10; i++) {
//			3일때 continue로 해당 코드를 넘어간다.
			if (i == 3) {
				continue;
			}
			System.out.println(i + 1);

		}

	}
}
