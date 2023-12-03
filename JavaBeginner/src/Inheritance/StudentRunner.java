package Inheritance;

import Inheritance.Student.Student;

public class StudentRunner {
    public static void main(String []args){
        Student student = new Student();
        student.setName("Pawamkumar");
        student.setPhoneNumber("9912696365");
        student.setEmail("pawankumarkaramtoth@gmail.com");
        student.setCollege("RGUKT");

        System.out.println(student);
        System.out.println(student.toString());
    }
}
