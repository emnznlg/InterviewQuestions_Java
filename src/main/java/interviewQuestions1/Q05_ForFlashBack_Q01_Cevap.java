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

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        String harf = scan.next();

        String arr[] = cumle.toLowerCase().split("");
        int count = 0;
        for (String w : arr) {
            if(w.equals(harf)) {
                count++;
            }
        }
        System.out.println("Girdiginiz cumlede " + harf + " harfi " + count + " kere kullanilmistir.");




















    }


}
