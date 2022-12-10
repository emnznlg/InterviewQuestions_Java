package InterviewQuestions8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Soru6 {

    public static void main(String[] args) {
        //Find second-largest number in an array
        int[] arr1 = {1, 5, 6, 78, 9, 4, 36, 4, 6, 14, 0, 98, 1, 5, 68, 5, 5, 98, 98, 78};
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list.get(list.size() - 2));
    }

}
