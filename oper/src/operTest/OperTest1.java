package operTest;

public class OperTest1 {
	public static void main(String[] args) {
//		조건식을 isTrue에 저장
		boolean isTrue = 10 == 11;
//		isTure와 그 옆에 조건식을 &&연산해서 result에 저장
		boolean result = isTrue && 10 <= 20;
//		조건식이 맞다면 true, 틀리면 falue 출력
		System.out.println(10 == 11);
		System.out.println(10 > 3);
		System.out.println(isTrue);
		
		System.out.println("==================");
//		isTure와 그 옆 조건식 &&연산한 값 출력
		System.out.println(isTrue && 10 <= 20);
//		result 연산 값 출력
		System.out.println(result);
		System.out.println("==================");
		
//		isTrue && 10 <= 20 의 결과를 true가 나오게 변경하기
		System.out.println(isTrue || 10 <= 20);
		System.out.println(!isTrue && 10 <= 20);
		
	}
}