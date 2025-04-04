package practice3;
import java.util.Scanner;
public class BookShop {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new Book(1, "트와일라잇", "스테파니메이어");
        books[1] = new Book(2, "뉴문", "스테파니메이어");
        books[2] = new Book(3, "이클립스", "스테파니메이어");
        books[3] = new Book(4, "브레이킹던", "스테파니메이어");
        books[4] = new Book(5, "아리랑", "조정래");
        books[5] = new Book(6, "젊은그들", "김동인");
        books[6] = new Book(7, "아프니깐 청춘이다", "김난도");
        books[7] = new Book(8, "귀천", "천상병");
        books[8] = new Book(9, "태백산맥", "조정래");
        books[9] = new Book(10, "풀하우스", "원수연");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        	System.out.println("*****도서 정보 출력하기******");
            displayBookInfo(books);
            
        	System.out.println("대여: 1 | 반납: 2 | 리스트: 3 | 종료: 4");
        	System.out.print("선택>>>");
            int in = scanner.nextInt();
            
            if (in == 1) {
            	System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
            	int num = scanner.nextInt();
            	
            	for (Book book : books) {
            		if (book.getNum() == num) {
            			if (book.getStat() < 1) {
                			System.out.println("ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ재고 없음ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ");
                			break;
                		}
            			
            			book.setStatRent();
            			System.out.println(book.getName() + "이(가) 대여되었습니다.");
            		} 
            	}
            } else if (in == 2) {
            	System.out.print("반납 하고 싶은 책의 번호를 입력하세요:");
            	int num = scanner.nextInt();
            	
            	for (Book book : books) {
            		if (book.getNum() == num) {
            			if (book.getStat() == 1) {
                			System.out.println(book.getName() + "이(가) 이미 반납되었습니다.");
                			break;
                		}
            			
            			book.setStatReturn();
            			System.out.println(book.getName() + "이(가) 반납되었습니다.");
            		} 
            	}
            } else if (in == 3) {
            	System.out.println("*****도서 정보 출력하기******");
                displayBookInfo(books);
            } else if (in == 4) {
            	break;
            }
        }
    }
    
    private static void displayBookInfo(Book[] books) {
    	for (Book book : books) {
    		book.showInfo();
    	}
    }
}