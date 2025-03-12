package week1;

import week1.classactivity.Student;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(1, "John Doe", 20, "S12345", 3.5);
        
        System.out.println(student.getName()); // From Person class
        System.out.println(student.getStudentId());


        System.out.println("My name is mahmood");

    }

}
