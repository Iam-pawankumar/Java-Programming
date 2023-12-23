package FrescoPlayChallenges.GenericClass;

import java.util.ArrayList;
import java.util.List;

public class ScoreList<T extends Number> {
    private List<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T getElement(int index) {
        return list.get(index);
    }

    public double averageValues() {
        if (list.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (T value : list) {
            sum += value.doubleValue();
        }

        return sum / list.size();
    }
}
