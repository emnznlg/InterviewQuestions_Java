package interviewQuestions1;

import java.util.Scanner;

public class Q02_MergeCertainCharacters_Cevap {

    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kullanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz:");
        String str = scan.nextLine();
        System.out.println("Tekrar sayisini giriniz");
        int tekrar = scan.nextInt();
        ilkSonChTekrarliYazdir(str,tekrar);
    }

    public static void ilkSonChTekrarliYazdir(String str, int tekrar) {
        char ilkCh = str.charAt(0);
        char sonCh = str.charAt(str.length() - 1);
        System.out.println(("" + ilkCh + sonCh).repeat(tekrar));
    }

}
