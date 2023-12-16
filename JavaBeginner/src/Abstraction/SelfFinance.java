package Abstraction;

public class SelfFinance extends Student{

    private String[] subjectMarks;
    private String[] sportsMarks;

    public String grade(double marks){
        if (marks >= 75 && marks <= 100) {
            return String.format("%.1f", (9.0 + (marks - 75) * 0.04));
        } else if (marks >= 60 && marks <= 74) {
            return String.format("%.1f", (8.0 + (marks - 60) * 0.06));
        } else if (marks >= 50 && marks <= 59) {
            return String.format("%.1f", (7.0 + (marks - 50) * 0.1));
        } else if (marks >= 40 && marks <= 49) {
            return String.format("%.1f", (6.0 + (marks - 40) * 0.1));
        } else {
            return String.format("%.1f", 0.0);
        }
    }

    @Override
    public String result(String allMarks) {
        String[] marksSet = allMarks.split("\\|");
        subjectMarks = marksSet[0].split(",");
        sportsMarks = marksSet[1].split(",");

        double totalCredits = 0;
        double gradePoint = 0;
        for(String mrk: subjectMarks){
            String[] subMark = mrk.split("\\s+");
            gradePoint += Double.parseDouble(grade(Double.parseDouble(subMark[0]))) * Double.parseDouble(subMark[1]);
            totalCredits += 5;
        }

        if(Integer.parseInt(sportsMarks[0]) == 1){
            gradePoint += Double.parseDouble(grade(Double.parseDouble(sportsMarks[1]))) * Double.parseDouble(sportsMarks[2]);
            totalCredits += 5;
        }

        double CGPA = gradePoint/totalCredits ;
        return String.format("%.2f", CGPA);
    }

}