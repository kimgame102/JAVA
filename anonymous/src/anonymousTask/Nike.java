package anonymousTask;

public class Nike {

	public void register(NikeForm form) {
		String[] menu = form.getMenu();

		for (int i = 0; i < menu.length; i++) {
			System.out.println("메뉴 " + (i + 1) + "번: " + menu[i]);
		}
//	      무료 나눔 행사중인 지점에서는 "무료 나눔 행사중"출력
		if (form instanceof NikeFormAdapter) {
			System.out.println("무료 나눔 행사중");
		} else {
//	         일반 지점에서는 판매 방식 확인하기
			form.sell("신발");
		}

	}

}
