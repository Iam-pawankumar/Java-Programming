package ArrayList;

import ArrayList.Students.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class StudentRunner {
    public static void main(String []args){
        Student student = new Student("Chinna", 98, 97, 100);
        Student student1 = new Student("Kittu", 96, 98, 97, 100);
        Student student2 = new Student("Chanti", 95, 96, 98, 97, 100);

        System.out.println("==================================================");
        System.out.println("Details of " + student.getStudentName());
        System.out.println("Max of marks: " +student.getMaximumOfMarks());
        System.out.println("Average of marks: " +student.getAverageOfMarks());
        System.out.println("Minimum of marks:  " +student.getMinimumOfMarks());
        System.out.println("Total Subs : " +student.getNumberOfMarks());
        System.out.println("Sum of total marks: " +student.getSumOfMarks());
        System.out.println(student.toString());
        student.addMarks(93);
        System.out.println(student.toString());
        System.out.println("==================================================");

        System.out.println("==================================================");
        System.out.println("Details of " + student1.getStudentName());
        System.out.println("Max of marks: " +student1.getMaximumOfMarks());
        System.out.println("Average of marks: " +student1.getAverageOfMarks());
        System.out.println("Minimum of marks:  " +student1.getMinimumOfMarks());
        System.out.println("Total Subs : " +student1.getNumberOfMarks());
        System.out.println("Sum of total marks: " +student1.getSumOfMarks());
        System.out.println(student1.toString());
        student1.addMarks(93);
        System.out.println(student1.toString());
        System.out.println("==================================================");

        System.out.println("==================================================");
        System.out.println("Details of " + student2.getStudentName());
        System.out.println("Max of marks: " +student2.getMaximumOfMarks());
        System.out.println("Average of marks: " +student2.getAverageOfMarks());
        System.out.println("Minimum of marks:  " +student2.getMinimumOfMarks());
        System.out.println("Total Subs : " +student2.getNumberOfMarks());
        System.out.println("Sum of total marks: " +student2.getSumOfMarks());
        System.out.println(student2.toString());
        student2.addMarks(93);
        System.out.println(student2.toString());
        System.out.println("==================================================");

    }
}
