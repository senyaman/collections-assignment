package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Replacer {

    public static void replaceElement(List<Integer> list, int index, int newValue) {
        list.set(index, newValue);
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);

        System.out.println("Initial list: " + numbers);

        replaceElement(numbers, 1, 20);
        System.out.println("New list: " + numbers);

    }

}
