package InterviewQuestions8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Soru5 {

    public static void main(String[] args) {

        //Find missing number in the array.
        int[] arr1 = {1,2,3,4,5,6,8,9,10};
        Arrays.sort(arr1);
        for (int i = arr1.length - 1; i > 0; i--) {
            if (arr1[i] - arr1[i - 1] != 1) {
                System.out.println(arr1[i] - 1);
            }
        }

    }

}
