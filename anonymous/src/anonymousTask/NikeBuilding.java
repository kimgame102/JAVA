package anonymousTask;

public class NikeBuilding {
	   public static void main(String[] args) {
//	      무료나눔 행사중이기 때문에 판매방식은 구현할 필요 없다.
//		   강남점
	      Nike gangnam = new Nike();
	      gangnam.register(new NikeFormAdapter() {
	         
	         @Override
	         public String[] getMenu() {
	            return new String[] {"신발", "옷"};
	         }
	      });
	      
//	      잠실점
	      Nike gamsil = new Nike();
	      gamsil.register(new NikeForm() {
	         
	         @Override
	         public void sell(String order) {
	            String[] menu = getMenu();
	            for (int i = 0; i < menu.length; i++) {
	               if(menu[i].equals(order)) {
	                  System.out.println(order + "판매 완료");
	               }
	            }
	         }
	         
	         @Override
	         public String[] getMenu() {
	            return new String[] {"옷", "신발"};
	         }
	      });
	   }
}
