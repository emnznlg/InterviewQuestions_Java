package interviewQuestions1;

import java.util.Scanner;

public class Q03_PrimeNumber_Cevap {

    public static void main(String[] args) {

        /*
            Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
        boolean asalMi = true;

        if (sayi >= 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
        } else {
            asalMi = false;
        }
        String sonuc = asalMi ? "Sayi asaldir" : "Sayi asal degildir";
        System.out.println(sonuc);

    }

}
