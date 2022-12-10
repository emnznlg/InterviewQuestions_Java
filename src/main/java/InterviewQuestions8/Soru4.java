package InterviewQuestions8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Soru4 {

    public static void main(String[] args) {
        //Write java Program to Find Smallest and Largest Element in an Array.
        int[] arr1 = {7, 5, 6, 1, 4, 2};
        Arrays.sort(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length-1]);
    }

}
