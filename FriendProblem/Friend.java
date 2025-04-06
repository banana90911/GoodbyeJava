package practice03;
public class Friend {
    public String name;
    public String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("이름: " + name + "  전화번호: " + phone);
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
