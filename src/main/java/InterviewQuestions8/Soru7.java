package InterviewQuestions8;

import java.util.HashSet;
import java.util.Set;

public class Soru7 {

    public static void main(String[] args) {

        //Find the number occurring odd number of times in an array
        int arr[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count % 2 == 1) {
                set.add(arr[i]);
            }
            count = 0;
        }
        System.out.println(set);

    }

}
