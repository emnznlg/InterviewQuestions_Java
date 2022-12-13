package InterviewQuestions9;

import java.util.*;

public class Soru1 {

    public static void main(String[] args) {
        //Find missing number in the array.
        int[] arr1 = {5,6,8,7,6,1,2,3,8,9};

        //1.Way
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length-1; i++) {
            if (arr1[i] - arr1[i + 1] != -1) {
                System.out.println("Missing Num : " + ( arr1[i] + 1));
            }
        }
        //2.Way
        Set<Integer> set = new TreeSet<>();
        for (int w : arr1) {
            set.add(w);
        }
        List<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) - list.get(i + 1) != -1) {
                System.out.println("Missing Num : " + (list.get(i) + 1));
            }
        }

    }

}
