package FrescoPlayChallenges.GenericClass;

public class StudentClass {

    public void setStudentData(String studentData){
        StudentList<String> studentList = new StudentList<>();
        for (String name : studentData.split("\\s+")) {
            studentList.addElement(name);
        }
    }

    public String getQuery(String studentData, String query) {

        StudentClass studentClass = new StudentClass();
        StudentList<String> studentList = new StudentList<>();
        ScoreList<Number> scoreList = new ScoreList<>();

//        for (Number[] num: Integer.parseInt(studentData.split(" "))){
//            scoreList.addElement(num);
//        }

        String[] queryInp = query.split(",");
        int queryNum = Integer.parseInt(queryInp[0]);

        switch(queryNum){
            case 1: studentClass.setStudentData(studentData);
                    studentList.beginsWith(queryInp[1].toUpperCase());
                    break;
            case 2: studentClass.setStudentData(studentData);
                    studentList.bloodGroupOf(queryInp[1].split(" "), queryInp[2]);
                    break;
            case 3: studentClass.setStudentData(studentData);
                    studentList.thresholdScore(Integer.parseInt(queryInp[1]));
                    break;
            case 4: studentClass.setStudentData(studentData);
                    scoreList.averageValues();
                    break;
            default: break;
        }
        return null;
    }

    public static void main(String []args){
        StudentClass studentClass = new StudentClass();
        String expected = "Ram\nRahul\n";
        String actual = studentClass.getQuery("Ram Vijay Vinay Rahul Arun", "1,r");
        System.out.println(actual);
    }

}

/*
A generic type is a class or interface that is parameterized over types. In this challenge,
you have to create two generic classes for an Array List. There are three
classes, StudentClass, StudentList, and ScoreList.
In StudentClass, there is a getQuery() function that contains the input data. In getQuery
(String studentData, String query), studentData is a dataset that differs based on the
query type. Query is the conditional string to perform an operation.
There are five types of queries:
Query Type 1:
Find student names beginning with a particular letter.
Query Type 2:
Find students who have a specific blood group that is given in the input.
Query Type 3:
Find the number of students who scored higher than the specified threshold score.
Query Type 4:
Find the average of student marks.
Query Type 5:
Find the average of student CGPA values.
Note: In studentData, student data is separated by space (""). In a query string, query
data is separated by comma (""). The first character refers to the query type, and the
second character refers to the conditional string (based on the query type).

For Query Type 1:
Sample input:
studentData = Raja Ravi Vinay Rahul Arun
query = 1,r
Sample output:
Raja
Ravi
Rahul
Note: The output for query type 1 should end with a new line character.
For Query Type 2:
Sample input:
studentData = Raja Ravi Vinay Rahul Arun
query = 2,B- AB- B+ 0+ B+,B+
Sample output :
Vinay
Arun
Note: The output for query type 2 should end with a new line character.
Explanation: In the studentData, "Raja Ravi Vinay Rahul Arun" are student names. In the
query, "2" is query type and "B- AB- B+ 0+ B+" are the respective blood groups of student
names and B+ is the blood group we have to find. Hence Vinay and Arun are the students
who have "B+" blood group.

Sample input:
studentData = 96 78 93 45 90 42 69
query = 3,90
Sample output:
3 students scored 90 above
For Query Type 4:
Sample input:
studentData = 96 78 93 45 90 42 69
query = 4
Sample output:
73.29
For Query Type 5:
Sample input:
studentData = 5.6 6.7 8.9 5.8
query = 5
Sample output:
6.75
In the StudentList class, you have to implement the functionalities for the first three types
of queries using an Array List. Type should be generic. Create 6 methods.
In the ScoreList Class, you have to implement the functionalities of the next two types of
queries using an Array List. Type should be generic. It must extend from the Numbers
class, and restrict the type (int, float, double, and long). Create 4 methods.

The first three methods are common for both classes:
1. void addElement(Type) - Must reflect the add() function of the Array List.
2. void removeElement(Type) - Must reflect the remove() function of the Array List.
3. Type getElement(int) - Must reflect the get() function of the Array List.
In StudentList,
4. beginsWith(String) - Must return the names of students starting with the specified
letter, for the names in the list.
5. bloodGroupOf(String[],String) - Must return the names of students with the
specified blood group, for the names in the list.
6. int thresholdScore(int) - Must return the count of the number of students whose
score is higher than the specified threshold score, for the scores in the list.
In ScoreList,
4. double averageValues) - Must return the average of the set of values in the list.
Note: The methods mentioned above should be defined as public methods.

* */
