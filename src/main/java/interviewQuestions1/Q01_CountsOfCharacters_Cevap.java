package interviewQuestions1;

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
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle = scan.nextLine().toLowerCase();
        String arr[] = cumle.split("");
        String ch = "";
        String allCh = "";
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!ch.contains(arr[i])) {
                ch = arr[i];
            }
            for (String w : arr) {
                if (w.equals(ch)) {
                        count++;
                }
            }
            if(!allCh.contains(ch)) {
                allCh += ch;
                System.out.println(ch + " elemani Array'de " + count + " adet vardir");

            }
            count = 0;
        }

    }


}
