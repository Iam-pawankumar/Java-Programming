package ArrayList.Students;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

    public void Student(){}
    private String studentName;
    private ArrayList<Integer> marksList = new ArrayList<>() ;

    public Student(String studentName, int... marks) {
        this.studentName = studentName;
        for (int mark: marks){
            this.marksList.add(mark);
        }
    }
    public String getStudentName() {
        return studentName;
    }

    public int getNumberOfMarks(){
        return marksList.size();
    }

    public BigDecimal getAverageOfMarks(){
        int total = getSumOfMarks();
        int noOfMarks = getNumberOfMarks();
        return new BigDecimal(total).divide(new BigDecimal(noOfMarks), 2, RoundingMode.UP);
    }

    public int getMinimumOfMarks(){
        return Collections.min(marksList);
    }

    public int getMaximumOfMarks(){
        return Collections.max(marksList);
    }

    public int getSumOfMarks(){
        int totalMarks = 0;
        for (int mark: marksList){
            totalMarks += mark;
        }
        return totalMarks;
    }

    public String toString(){
        return (this.studentName + marksList);
    }

    public void addMarks(int mark){
        this.marksList.add(mark);
    }

}
