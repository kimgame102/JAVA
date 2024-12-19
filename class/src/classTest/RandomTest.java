package classTest;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random(); // 랜덤을 써야되서 객체화

		int a = random.nextInt(5);

		System.out.println(a);
	}
}
