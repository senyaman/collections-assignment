package exercise3;

import java.util.LinkedList;
import java.util.List;

public class Merger {

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2, int value) {

        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) == value) {
                list1.addAll(i+1, list2);
            }
        }

        return list1;

    }

    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);

        System.out.println(mergeLists(list1, list2, 3));

    }

}
