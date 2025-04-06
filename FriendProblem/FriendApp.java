package practice03;

import java.util.Scanner;

public class FriendApp {
    public static void main(String[] args) {
        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("친구 3명을 등록해 주세요");

        for (int i = 0; i < 3; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            friendArray[i] = new FriendSchool(arr[0], arr[1], arr[2]);
        }

        for (Friend friend : friendArray) {
            friend.showInfo(); // 다형성 활용
        }

        sc.close();
    }
}