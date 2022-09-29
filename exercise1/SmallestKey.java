package exercise1;

import java.util.*;

public class SmallestKey {

    public static void main(String[] args) {

        Map<Integer, String> numbers = new HashMap<>();

        numbers.put(11, "eleven");
        numbers.put(1000, "thousand");
        numbers.put(7, "seven");
        numbers.put(5, "five");
        numbers.put(9, "nine");
        numbers.put(100, "hundred");

        List<Integer> numbersList = new ArrayList<>(numbers.keySet());
        Collections.sort(numbersList);

        int smallestKey = numbersList.get(0);
        System.out.println(smallestKey + ":" + numbers.get(smallestKey));

        numbers.remove(smallestKey);

    }

}
