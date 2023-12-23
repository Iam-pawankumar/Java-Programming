package FrescoPlayChallenges.GenericClass;

import java.util.ArrayList;
import java.util.List;

class StudentList<T extends String> {
    private List<T> list = new ArrayList<>();

    public void addElement(String name) {
        this.list.add((T) name);
    }

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
                res += name;
            }
            res += "\n";
        }
        return res;
    }

    public void bloodGroupOf(String[] studentBloodGroups, String bloodGroupToFind) {
        for (int i = 0; i < this.list.size(); i++) {
            String studentName = this.list.get(i);
            String studentBloodGroup = studentBloodGroups[i];
            if (studentBloodGroup.equals(bloodGroupToFind)) {
                System.out.println(studentName);
            }
        }
        System.out.println();
    }

    public int thresholdScore(int threshold) {
        int count = 0;
        for (String score : this.list) {
            if (Integer.parseInt(score) > threshold) {
                count++;
            }
        }
        return count;
    }
}