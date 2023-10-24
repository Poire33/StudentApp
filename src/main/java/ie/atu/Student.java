package ie.atu;

import java.util.Scanner;

public class Student {
    private String student_name;
    private String student_email;
    private String course_name;

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Student() {
        this.student_name = "";
        this.student_email = "";
        this.course_name = "";
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter student's name: ");
        this.student_name = scanner.nextLine();

        System.out.println("Please enter student's email: ");
        this.student_email = scanner.nextLine();

        System.out.println("Please enter student's course: ");
        this.course_name = scanner.nextLine();
    }
}
