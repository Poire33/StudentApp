package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, email, course;
        Student first = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter student's name: ");
        name = scanner.nextLine();
        first.setStudent_name(name);

        System.out.println("Please enter student's email: ");
        email = scanner.nextLine();
        first.setStudent_email(email);

        System.out.println("Please enter student's course: ");
        course = scanner.nextLine();
        first.setCourse_name(course);
    }
}