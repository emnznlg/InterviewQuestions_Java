package interviewQuestions6;


import java.util.HashSet;
import java.util.Set;

public class Q06_DuplicateValue {
       /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
        String str = "Javaisalsoeasy";
        Set<String> mySet = new HashSet<>();

        for (String w : str.split("")) {
            if (str.indexOf(w) != str.lastIndexOf(w)) {
                mySet.add(w);
            }
        }
        System.out.println(mySet);
    }


}

