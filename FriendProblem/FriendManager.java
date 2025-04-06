package practice03;

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
			System.out.print("선택> ");
			int num = Integer.parseInt(scanner.nextLine());

			if (num == 1) {
				System.out.print("이름: ");
				String name = scanner.nextLine();
				System.out.print("전화번호: ");
				String phone = scanner.nextLine();
				System.out.print("이메일: ");
				String email = scanner.nextLine();

				friendArray[numPeop++] = new FriendEmail(name, phone, email);

			} else if (num == 2) {
				for (int i = 0; i < numPeop; i++) {
					friendArray[i].showInfo();
				}

			} else if (num == 3) {
				System.out.print("수정할 이름 입력: ");
				String targetName = scanner.nextLine();

				boolean found = false;
				for (int i = 0; i < numPeop; i++) {
					if (friendArray[i].getName().equals(targetName)) {
						System.out.print("새 전화번호: ");
						String newPhone = scanner.nextLine();
						friendArray[i].setPhone(newPhone);

						if (friendArray[i] instanceof FriendEmail) {
							System.out.print("새 이메일: ");
							String newEmail = scanner.nextLine();
							((FriendEmail) friendArray[i]).setEmail(newEmail);
						}
						System.out.println("수정 완료!");
						found = true;
						break;
					}
				}

				if (!found) {
					System.out.println("그런이름의 친구는 없습니다.");
				}

			} else if (num == 4) {
				System.out.println("종료합니다.");
				break;
			}
		}

		scanner.close();
	}
}
