package castingTest;

public class Encryption {
   public static void main(String[] args) {
//	  사용자 비밀번호를 변수에 저장
      String password = "ehdtjrdl1234";
      String encryptedPassword = "", decryptedPassword = "";
      final int KEY = 3;
      
      for (int i = 0; i < password.length(); i++) {
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      
      System.out.println(encryptedPassword);
      
      for (int i = 0; i < encryptedPassword.length(); i++) {
         decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
      }
      
      System.out.println(decryptedPassword);
   }
}







