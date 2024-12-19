package wrapperTest;

import java.util.Iterator;

public class WrapperTask {
	public static void main(String[] args) {
//		1, 3.56, 'A', false, "ABC"
//		위의 5개의 값을 하나의 배열에 모두 담는다.
		
		Object[] result = {1, 3.56, 'A', false, "ABC"};//auto boxing
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
