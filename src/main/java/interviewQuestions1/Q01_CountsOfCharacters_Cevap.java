package interviewQuestions1;

import java.awt.*;
import java.util.Scanner;

public class Q01_CountsOfCharacters_Cevap {

    /*
         Kullanicidan bir String aliniz.
         String'de var olan her character'in sayisini ekrana yazdiriniz.
         Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
                abaa   ==> a=3  b=1
    */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userString = scan.nextLine().toLowerCase();

        String strArr[] = userString.split("");
        String newStr = "";
        int count = 0;

        for (String w : strArr) {
            for (String s : strArr) {
                if (w.equals(s)) {
                    count++;
                }
            }
            if (!newStr.contains(w)) {
                newStr += w;
                System.out.print(w + " = " + count + ", ");
            }
            count = 0;
        }


    }


}
