package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, email, course;
        Student first = new Student();

        Scanner scanner = new Scanner(System.in);

        // First student using setters
        System.out.println("Please enter student's name: ");
        name = scanner.nextLine();
        first.setStudent_name(name);

        System.out.println("Please enter student's email: ");
        email = scanner.nextLine();
        first.setStudent_email(email);

        System.out.println("Please enter student's course: ");
        course = scanner.nextLine();
        first.setCourse_name(course);

        
        // Second student using constructor for name only
        System.out.println("Please enter student's name: ");
        name = scanner.nextLine();
        Student second = new Student(name);

        System.out.println("Please enter student's email: ");
        email = scanner.nextLine();
        second.setStudent_email(email);

        System.out.println("Please enter student's course: ");
        course = scanner.nextLine();
        second.setCourse_name(course);


        // Third student using constructor for all three values
        System.out.println("Please enter student's name: ");
        name = scanner.nextLine();

        System.out.println("Please enter student's email: ");
        email = scanner.nextLine();

        System.out.println("Please enter student's course: ");
        course = scanner.nextLine();

        Student third = new Student(name, email, course);


        // Output student info using getters
        System.out.println(first.getStudent_name());
        System.out.println(first.getStudent_email());
        System.out.println(first.getCourse_name());

        System.out.println(second.getStudent_name());
        System.out.println(second.getStudent_email());
        System.out.println(second.getCourse_name());

        System.out.println(third.getStudent_name());
        System.out.println(third.getStudent_email());
        System.out.println(third.getCourse_name());
    }
}