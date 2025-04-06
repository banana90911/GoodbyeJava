package practice03;

public class FriendSchool extends Friend {
    public String school;

    public FriendSchool(String name, String phone, String school) {
        super(name, phone);
        this.school = school;
    }

    @Override
    public void showInfo() {
        System.out.println("이름: " + name + "  전화번호: " + phone + "  학교: " + school);
    }
}
