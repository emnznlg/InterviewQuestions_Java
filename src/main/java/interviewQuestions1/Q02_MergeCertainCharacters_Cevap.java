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
        System.out.println("Lutfen bir kelime giriniz");
        String str = scan.nextLine();
        System.out.println("Tekrar sayisini giriniz");
        int tekrar = scan.nextInt();

        System.out.println(stringiOlusturVeDondur(str, tekrar));
    }

    public static String stringiOlusturVeDondur(String str, int tekrar) {
        return (str.substring(0,1) + str.substring(str.length()-1)).repeat(tekrar);
    }

}
