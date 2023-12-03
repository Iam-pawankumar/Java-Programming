package Arrays;

import ArrayList.Students.Student;

public class StudentRunner {
    public static void main(String []args){
        Student student = new Student("Chinna", 97, 98, 100, 96);
        Student student1 = new Student("Kittu", 99, 88, 95);
        Student student2 = new Student("Chanti", 93, 99, 79, 75, 78);

        System.out.println("Details of " + student.getStudentName());
        System.out.println(student.getMaximumOfMarks());
        System.out.println(student.getAverageOfMarks());
        System.out.println(student.getMinimumOfMarks());
        System.out.println(student.getNumberOfMarks());
        System.out.println(student.getSumOfMarks());

        System.out.println("Details of " + student1.getStudentName());
        System.out.println(student1.getMaximumOfMarks());
        System.out.println(student1.getAverageOfMarks());
        System.out.println(student1.getMinimumOfMarks());
        System.out.println(student1.getNumberOfMarks());
        System.out.println(student1.getSumOfMarks());

        System.out.println("Details of " + student2.getStudentName());
        System.out.println(student2.getMaximumOfMarks());
        System.out.println(student2.getAverageOfMarks());
        System.out.println(student2.getMinimumOfMarks());
        System.out.println(student2.getNumberOfMarks());
        System.out.println(student2.getSumOfMarks());


    }
}
