package projectIT;

import java.util.Scanner;

public class Student extends People {
    private String masv, email;
    private float mark;

    public Student() {
    }

    public Student(String masv, String email, float mark, String fullname, String gender, String birthday,
            String address) {
        super(fullname, gender, birthday, address);
        this.masv = masv;
        this.email = email;
        this.mark = mark;
    }

    public String getmasv() {
        return masv;
    }

    public void setmasv(String masv) {
        this.masv = masv;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email!= null &&email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            System.out.println("The format was wrong ...!@@");
        }
        return false;
    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
            return true;
        } else {
            System.out.println("Requiment: mark >= 0 & mark <= 10");
        }
        return false;
    }

    @Override
    public void input() {
        super.input();

        Scanner bn = new Scanner(System.in);

        System.out.println("Enter ID number: ");
        masv = bn.nextLine();

        System.out.println("Enter email: ");
        while (true) {
            String inputEmail = bn.nextLine();
            if (setEmail(inputEmail)) {
                break;
            }
            System.out.println("Enter email again!!!");
        }

        System.out.println("Enter mark: ");
        while (!setMark(Float.parseFloat(bn.nextLine()))) {
            System.out.println("Enter mark again!!!");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("| ID student: %s | mark: %f | email: %s |\n", masv, mark, email);
    }

    public boolean checkCerfiticate() {
        if( mark >= 8){
            return true;
        }
        return false;
    }
}