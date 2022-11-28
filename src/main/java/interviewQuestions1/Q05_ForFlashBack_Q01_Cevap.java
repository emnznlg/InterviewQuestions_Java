package interviewQuestions1;

import java.util.Scanner;

public class Q05_ForFlashBack_Q01_Cevap {

    public static void main(String[] args) {

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Cumle?");
        String cumle = input.nextLine();
        System.out.println("Harf?");
        String harf = input.next();
        String strArr[] = cumle.split("");
        int counter = 0;

        for (String w : strArr) {
            if (w.equals(harf)) {
                counter++;
            }
        }
        System.out.println("Girdiginiz cumlede" + harf + " harfi " + counter + " kere kullanilmistir.");

    }


}
