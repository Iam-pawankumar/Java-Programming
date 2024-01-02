package FrescoPlayChallenges.GenericClass;

import java.util.ArrayList;

public class StudentList<T extends String> {
    private ArrayList<T> list = new ArrayList<>();

    public void setStudentData(String studentData) {
        for (T name : (T[]) studentData.split("\\s+")) {
            this.list.add(name);
        }
    }

    public void addElement(T element){ this.list.add(element);}
    public void removeElement(T element) {
        this.list.remove(element);
    }

    public T getElement(int index) {
        return this.list.get(index);
    }

    public String beginsWith(String letter) {
        String res = "";
        for (T name : this.list) {
            if (name.toString().startsWith(letter)) {
                res += name + "\n";
            }
        }
        return res;
    }

    public String bloodGroupOf(String[] studentBloodGroups, String bloodGroupToFind) {
        String students = "";
        for (int i = 0; i < this.list.size(); i++) {
            String studentName = this.list.get(i);
            String studentBloodGroup = studentBloodGroups[i];
            if (studentBloodGroup.equals(bloodGroupToFind)) {
                students += studentName + "\n";
            }
        }
        return students;
    }

    public int thresholdScore() {
        return 0;
    }
}