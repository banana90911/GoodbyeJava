package ch04.sec08.practice;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("=======================");
			System.out.println("   [숫자맞추기게임 시작]     ");
			System.out.println("=======================");
			System.out.print(">>");
					
			int rand = (int)(Math.random()*100) + 1;

			while (true) {
				Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();
				int input = Integer.parseInt(str);
				
				if (input < rand) {
					System.out.println("더 높게\n>>");
				} else if (input > rand) {
					System.out.println("더 낮게\n>>");
				} else {
					break;
				}
				
			}
			System.out.print("맞았습니다.\n게임을 종료하시겠습니까? (y / n) >>");
			Scanner sc = new Scanner(System.in);
			String ans = sc.nextLine();
			
			if (ans.equals("y")) {
				System.out.println("=======================");
				System.out.println("   [숫자맞추기게임 종료]     ");
				System.out.println("=======================");
				break;
			} else if (ans.equals("y")) {
				continue;
			}
			
		}
		
	}

}
