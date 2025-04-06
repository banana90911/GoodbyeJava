package practice03;

public class FriendEmail extends Friend {
    public String email;

    public FriendEmail(String name, String phone, String email) {
        super(name, phone);
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void showInfo() {
        System.out.println("이름: " + name + "  전화번호: " + phone + "  이메일: " + email);
    }
}
