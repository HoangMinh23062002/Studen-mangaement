package projectIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {
    static Scanner bc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int choise;

        do {
            showMenu();
            choise = Integer.parseInt(bc.nextLine());
            switch (choise) {
                case 1:
                    inputStudent(studentList);
                    break;
                case 2:
                    displayStudent(studentList);
                    break;
                case 3:
                    showMinMax(studentList);
                    break;
                case 4:
                    searchStudent(studentList);
                    break;
                case 5:
                    displaySortByName(studentList);
                    break;
                case 6:
                    displayscholaship(studentList);
                    break;
                case 7:
                    System.out.println("Say: Thanks and see you soon");
                    break;
                default:
                    System.out.println("Retype!!!");
                    break;
            }
        } while (choise != 7);
    }

    static void showMenu() {
        System.out.println("Welcome to the information student system");
        System.out.println(" Please enter your number!");
        System.out.println("|-------------------MENU-------------------------------|");
        System.out.println("|1.Enter the information                               |");
        System.out.println("|2.Indicate student information                        |");
        System.out.println("|3.Students have the highest and lowest scores         |");
        System.out.println("|4.Look for the ID student                             |");
        System.out.println("|5.Display from A to Z of the student                  |");
        System.out.println("|6.Display the information of student have scholarship |");
        System.out.println("|7.Exit                                                |");
        System.out.println("|.Choosen                                              |");
        System.out.println("|------------------------------------------------------|");
    }

    static void inputStudent(ArrayList<Student> studentList) {
        System.out.println(" Enter the quantity need to add: ");
        int n = Integer.parseInt(bc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Student of location is " + (i + 1) + " la:");
            Student std = new Student();
           
            std.input();

            studentList.add(std);
        }
    }

    static void displayStudent(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            student.display();
        }
    }

    static void showMinMax(ArrayList<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMark() > o2.getMark()) {
                    return 1;
                }
                return -1;
            }
        });
        System.out.println("The information of student has highest score");
        studentList.get(studentList.size() - 1).display();

        System.out.println("The information of student has lowest score ");
        studentList.get(0).display();
    }

    static void searchStudent(ArrayList<Student> studentList) {
        System.out.println("Enter the ID student: ");
        String masvSearch = bc.nextLine();

        boolean tim = false;
        for (Student student : studentList) {
            if (student.getmasv().equalsIgnoreCase(masvSearch)) {
                student.display();
                tim = true;
                break;
            }
        }
        if (!tim) {
            System.out.println("Cann't find the ID student= " + masvSearch);
        }
    }

    static void displaySortByName(ArrayList<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {
             @Override
            public int compare(Student o1, Student o2) {
                return o1.getFullname().compareToIgnoreCase(o2.getFullname());
            }

        });

        displayStudent(studentList);
    }

    static void displayscholaship(ArrayList<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {
             @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMark() > o2.getMark()) {
                    return -1;
                }
                return 1;
            }

        });
        for (Student student : studentList) {
            if (student.checkCerfiticate()) {
                student.display();
            } else {
                break;
            }
        }
    }
}
