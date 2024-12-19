package set.test;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		HashSet<String> bloodTypeSet = new HashSet<String>();
		
		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("O");
		bloodTypeSet.add("O");
		bloodTypeSet.add("O");
		bloodTypeSet.add("O");
		
//		HashSet<String> userbloodTypeSet = new HashSet<String>(bloodTypeSet);
//		System.out.println(userbloodTypeSet);
		
		// 위에 코드처럼 hash로 갔다가 값을 다시 사용하려고 arrylist로 돌아가지말고
//		아래처럼 iterator 사용하면 값 가져올 수 있음
		Iterator<String> iter = bloodTypeSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}














