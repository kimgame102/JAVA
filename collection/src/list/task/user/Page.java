package list.task.user;

import java.util.Scanner;

import list.task.DBConnecter;
//import list.task.user.User;
//import list.task.user.UserField;

public class Page {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserField userField = new UserField();
        int choice = 0;
        
        while (true) {
            System.out.println("1. 회원가입 \n2. 로그인\n3. 아이디 중복 검사\n4. 비밀번호 변경\n5. 인증번호 전송\n6. 개인정보 수정\n7. 전체 조회\n8. 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            choice = sc.nextInt();
            sc.nextLine(); //버퍼 비우기
            
            if(choice == 8) {
            	System.out.println("종료했습니다.");
            	break;
            }

            switch (choice) {
                case 1:
                    // 회원가입
                    System.out.print("이름: ");
                    String name = sc.nextLine();
                    System.out.print("아이디: ");
                    String userId = sc.nextLine();
                    System.out.print("비밀번호: ");
                    String password = sc.nextLine();
                    System.out.print("전화번호: ");
                    String phone = sc.nextLine();
                    User newUser = new User(name, userId, password, phone);
                    userField.join(newUser);
                    System.out.println("회원가입 완료: " + newUser);
                    break;
                case 2:
                    // 로그인
                    System.out.print("아이디: ");
                    String loginId = sc.nextLine();
                    System.out.print("비밀번호: ");
                    String loginPassword = sc.nextLine();
                    User loginUser = new User();
                    loginUser.setUserId(loginId);
                    loginUser.setPassword(loginPassword);
                    User loggedInUser = userField.login(loginUser);
                    if (loggedInUser != null) {
                        System.out.println("로그인 성공: " + loggedInUser);
                    } else {
                        System.out.println("로그인 실패");
                    }
                    break;
                case 3:
                    // 아이디 중복 검사
                    System.out.print("아이디: ");
                    String checkId = sc.nextLine();
                    User foundUser = userField.findByUserId(checkId);
                    if (foundUser != null) {
                        System.out.println("아이디 중복: " + foundUser);
                    } else {
                        System.out.println("해당 아이디는 사용 가능합니다.");
                    }
                    break;
                case 4:
                	// 비밀번호 변경
                    System.out.print("아이디: ");
                    String updateId = sc.nextLine();
                    User userToUpdate = userField.findByUserId(updateId);
                    if (userToUpdate != null) {
                        System.out.print("새 비밀번호: ");
                        String newPassword = sc.nextLine();
                        userField.updatepassword(updateId, newPassword);
                        System.out.println("비밀번호 변경 완료");
                    } else {
                        System.out.println("존재하지 않는 아이디입니다.");
                    }
                    break;
                case 5:
//                    // 인증번호 전송
//                    System.out.print("전화번호: ");
//                    String certPhone = scanner.nextLine();
//                    String certNumber = userField.sendCertificatedNumber(certPhone);
//                    System.out.println("인증번호 전송 완료: " + certNumber);
//                    break;
                case 6:
                    // 개인정보 수정
                    System.out.print("이름: ");
                    String updateName = sc.nextLine();
                    System.out.print("아이디: ");
                    String updateUserId = sc.nextLine();
                    System.out.print("비밀번호: ");
                    String updatePassword = sc.nextLine();
                    System.out.print("전화번호: ");
                    String updatePhone = sc.nextLine();
                    User updatedUser = new User(updateName, updateUserId, updatePassword, updatePhone);
                    userField.update(updatedUser);
                    System.out.println("개인정보 수정 완료: " + updatedUser);
                    break;
                case 7:
                	// 전체 조회
                	System.out.println(DBConnecter.users);
                	break;
                default:
                	System.out.println("잘못 눌렀습니다.");
                	 break;
            }
        }
    }
}
