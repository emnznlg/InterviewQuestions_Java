package interviewQuestions7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Soru3 {

    public static void main(String[] args) {

        //Write a program to check if String has all unique characters in java?
        //1.Way
        String str = "abc";
        String strArr[] = str.split("");
        Set<String> mySet = new HashSet<>(Arrays.asList(strArr));
        boolean allUnique = mySet.size() == strArr.length;
        String result = allUnique ? "All characters are unique" : "All characters are not unique";
        System.out.println(result);

        //2.Way
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i));
            if (!isUnique) {
                break;
            } else {
                count++;
            }
        }
        String result2 = count == str.length() ? "All characters are unique" : "All characters are not unique";
        System.out.println(result2);
    }

}
