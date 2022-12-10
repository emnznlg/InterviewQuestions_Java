package interviewQuestions7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Soru5 {

    public static void main(String[] args) {
        //How to find duplicate characters in String in java?
        String str1 = "Ali ata bak ve eve gel";
        String strDup = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.indexOf(str1.charAt(i)) != str1.lastIndexOf(str1.charAt(i))) {
                strDup += str1.charAt(i);
            }
        }
        Set<String> mySet = new HashSet<>(Arrays.asList(strDup.split("")));
        System.out.println(mySet);
    }

}
