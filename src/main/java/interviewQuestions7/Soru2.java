package interviewQuestions7;

import java.util.Arrays;

public class Soru2 {

    public static void main(String[] args) {

        //Write a java program to check if two Strings are anagram in java?
        //Two string are anagrams if they have same characters but in different order. ( Angel and Angle )

        String str1 = "Angel";
        String str2 = "Angle";
        String str1Arr[] = str1.split("");
        Arrays.sort(str1Arr);
        String str2Arr[] = str2.split("");
        Arrays.sort(str2Arr);
        boolean flag = true;
        for (int i = 0; i < str1Arr.length; i++) {
            flag = Arrays.equals(str1Arr, str2Arr);
        }
        String result = flag ? "Anagram" : "Not Anagram";
        System.out.println(result);

    }

}
