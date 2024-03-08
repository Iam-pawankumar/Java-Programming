package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class JavaCollections {

    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Ball", "Cat");
        System.out.println("List of words : "+ words);

        List<String> wordsArrayList = new ArrayList<>(words);
        wordsArrayList.add("Dog");
        System.out.println("wordsArrayList :" + wordsArrayList);

        List<String> wordsLinkedList = new LinkedList<>(words);
        wordsLinkedList.add("Dog");
        System.out.println("wordsLinkedList :" + wordsLinkedList);

        List<String> wordsVector = new Vector<>(words);
        wordsVector.add("Dog");
        System.out.println("wordsVector :" + wordsVector);

        List<List<String>> mergedList = List.of(wordsArrayList, wordsLinkedList, wordsVector);
        System.out.println("Merged lists: " + mergedList);
    }
}
