package projectIT;

import java.util.Scanner;

public class People {
    private String fullname, gender, birthday, address;

    public People() {
    }

    public People(String fullname, String gender, String birthday, String address) {
        this.fullname = fullname;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
       
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public void input() {
        Scanner ab = new Scanner(System.in);

        System.out.println("Enter your fullname: ");
        fullname = ab.nextLine();

        System.out.println("Enter your gender: ");
        gender = ab.nextLine();

        System.out.println("Enter your birthday: ");
        birthday = ab.nextLine();

        System.out.println("Enter your address: ");
        address = ab.nextLine();
       
    }

    public void display() {
        System.out.printf("\nFullname: %s | Gender: %s | Birthday: %s | Address: %s ", fullname, gender, birthday, address);
    }
}
