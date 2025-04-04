package ch06.sec15;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		int accountLoc = 0; // 계좌 수

		// 배열 생성
		Account[] accountArr = new Account[100];
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			
			// 선택
			System.out.print("선택> ");
			String str = scanner.nextLine();
			int n = Integer.parseInt(str);
			
			
			if (n == 1) { // 계좌생성
				

				System.out.println("------\n계좌생성\n------");
				
				System.out.print("계좌번호: "); // 계좌번호
				String accountNum = scanner.nextLine();
				System.out.print("계좌주: "); // 계좌주
				String accountName = scanner.nextLine();
				System.out.print("초기입금액: "); // 초기입금액
				String accountAmountStr = scanner.nextLine();
				int accountAmount = Integer.parseInt(accountAmountStr);
				
				// 배열에 계좌 생성
				accountArr[accountLoc] = new Account(accountNum, accountName, accountAmount);
				
				System.out.println("결과: 계좌가 생성되었습니다.");
				accountLoc++;
			} else if (n == 2) { // 계좌목록
				System.out.println("------\n계좌목록\n------");
				
				for (int i = 0; i < accountLoc; i++) {

					String accountNum = accountArr[i].getAccountNum(); // 계좌번호 가져오기
					String accountName = accountArr[i].getAccountName(); // 계좌주 가져오기
					int accountBalance = accountArr[i].getBalance(); // 잔고 가져오기
					
					System.out.println(accountNum + "\t" + accountName + "\t" + accountBalance);
				}
				
			} else if (n == 3) { // 예금
				System.out.println("------\n예금\n------");
				
				System.out.print("계좌번호: ");
				String accountNum = scanner.nextLine();
				
				System.out.print("예금액: ");
				String accountAmountPlusStr = scanner.nextLine();
				int accountAmountPlus = Integer.parseInt(accountAmountPlusStr);
				
				for (int i = 0; i < accountLoc; i++) {
					if (accountArr[i].getAccountNum().equals(accountNum)) {
						int accountBalance = accountArr[i].getBalance(); // 잔고 가져오기
						accountArr[i].setBalance(accountBalance + accountAmountPlus); // setBalance
					}
					
				}
				
			} else if (n == 4) { // 출금
				System.out.println("------\n출금\n------");
				
				System.out.print("계좌번호: ");
				String accountNum = scanner.nextLine();
				
				System.out.print("출금액: ");
				String accountAmountPlusStr = scanner.nextLine();
				int accountAmountPlus = Integer.parseInt(accountAmountPlusStr);
				
				for (int i = 0; i < accountLoc; i++) {
					if (accountArr[i].getAccountNum().equals(accountNum)) {
						int accountBalance = accountArr[i].getBalance(); // 잔고 가져오기
						accountArr[i].setBalance(accountBalance - accountAmountPlus); // setBalance
						System.out.println("결과: 출금이 성공되었습니다.");
					}
					
				}
				
			} else if (n == 5) {
				System.out.println("프로그램 종료");
				break;
			} 
			
		}

	}

}
