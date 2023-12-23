package FrescoPlayChallenges.GenericClass;

public class StudentClass {

    public String getQuery(String studentData, String query) {

        StudentList<String> studentList = new StudentList<>();
        ScoreList<Number> scoreList = new ScoreList<>();

        String[] queryInp = query.split(",");
        int queryNum = Integer.parseInt(queryInp[0]);

        switch(queryNum){
            case 1: studentList.setStudentData(studentData);
                    return studentList.beginsWith(queryInp[1].toUpperCase());
            case 2: studentList.setStudentData(studentData);
                return studentList.bloodGroupOf(queryInp[1].split(" "), queryInp[2]);
            case 3: scoreList.setScores(studentData);
                    return (scoreList.thresholdScore(Integer.parseInt(queryInp[1]))) + " students scored " + Integer.parseInt(queryInp[1]) + " above";
            case 4: scoreList.setScores(studentData);
                    return String.format("%.2f", scoreList.averageValues());
            case 5: scoreList.setScores(studentData);
                    return String.format("%.2f", scoreList.averageCGPAValues());
            default: break;
        }
        return null;
    }

}
