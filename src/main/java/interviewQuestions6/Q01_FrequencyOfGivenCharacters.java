package interviewQuestions6;

import java.util.HashSet;
import java.util.Set;

public class Q01_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */

    public static void main(String[] args) {

        String str = "AAABBCDD";
        String strArr[] = str.split("");
        Set<String> mySet = new HashSet<>();
        int count = 0;
        for (String w : strArr) {
            mySet.add(w);
        }
        for (String w : mySet) {
            for (int i = 0; i < strArr.length; i++) {
                if (w.equals(strArr[i])) {
                    count++;
                }
            }
            System.out.print(w + count + " ");
            count = 0;
        }


    }


}
