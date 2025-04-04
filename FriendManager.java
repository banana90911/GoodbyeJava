package practice3;

import java.util.Scanner;

public class FriendManager {

	public static void main(String[] args) {
        Friend[] friendArray = new Friend[10];
        int numPeop = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("----------------------");
			System.out.println("1.추가 2.목록 3.수정 4.종료");
			System.out.println("----------------------");
        	System.out.print("선택>");
            int num = scanner.nextInt();
            
            if (num == 1) {
            	System.out.print("이름: ");
				String name = scanner.nextLine();
				System.out.print("전화번호: ");
				String phone = scanner.nextLine();
				System.out.print("이메일: ");
				String email = scanner.nextLine();
				
				friendArray[numPeop] = new Friend(name, phone, email);
				
				System.out.println("결과: 친구가 추가되었습니다.");
				numPeop++;
            }
		}

	}

}
