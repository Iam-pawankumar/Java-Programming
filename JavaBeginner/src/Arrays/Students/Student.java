package Arrays.Students;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

    private String studentName;
    private int[] marksList;

    public Student(String studentName, int... marks) {
        this.studentName = studentName;
        this.marksList = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getNumberOfMarks(){
        return marksList.length;
    }

    public BigDecimal getAverageOfMarks(){
        int total = getSumOfMarks();
        int noOfMarks = getNumberOfMarks();
        return new BigDecimal(total).divide(new BigDecimal(noOfMarks), 2, RoundingMode.UP);
    }

    public int getMinimumOfMarks(){
        int minMark = 100;

        for (int mark: marksList){
            if(minMark < mark){
                minMark = mark;
            }
        }
        return minMark;
    }

    public int getMaximumOfMarks(){
        int maxMark = 0;

        for (int mark: marksList){
            if(mark > maxMark){
                maxMark = mark;
            }
        }
        return maxMark;
    }

    public int getSumOfMarks(){
        int totalMarks = 0;
        for (int mark: marksList){
            totalMarks += mark;
        }
        return totalMarks;
    }


}
