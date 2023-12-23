package FrescoPlayChallenges.GenericClass;

import java.util.ArrayList;

public class ScoreList<T extends Number> {
    private ArrayList<T> list = new ArrayList<>();

    public void setScores(String scores) {
        for (String score : scores.split("\\s+")) {
            try {
                Double parsedScore = Double.parseDouble(score);
                this.list.add((T) parsedScore);
            } catch (NumberFormatException e) {
                System.err.println("Invalid score: " + score);
            }
        }
    }
    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T getElement(int index) {
        return list.get(index);
    }

    public int thresholdScore(int threshold) {
        int count = 0;
        for (T score : this.list) {
            if (score.doubleValue() >= Double.valueOf(threshold)) {
                count++;
            }
        }
        return count;
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

    public double averageCGPAValues() {
        return averageValues();
    }
}
