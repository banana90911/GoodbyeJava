package practice3;

public class Book {
	private int i;
	private String name;
	private String auth;
	private int stat = 1;
	private String statStr;

	public Book(int i, String string, String string2) {
		this.i = i;
		this.name = string;
		this.auth = string2;
	}
	
	public int getNum() {
		return this.i;
	}
	
	public String getName() {
		return name;
	}                                                                                                                                              

	public int getStat() {
		return this.stat;
	}
	
	public void setStatRent() {
		this.stat = 0;
	}
	public void setStatReturn() {
		this.stat = 1;
	}
	
	public void showInfo() {
		if (stat == 1) {
			System.out.println(i + " 책제목 : " + name + " 저자 : " + auth + " 대여유무 : " + "재고있음");
		} else {
			System.out.println(i + " 책제목 : " + name + " 저자 : " + auth + " 대여유무 : " + "대여중");
		}
	}

	

	

    
}
