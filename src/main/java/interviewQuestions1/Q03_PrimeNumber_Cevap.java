package interviewQuestions1;

import java.util.Scanner;

public class Q03_PrimeNumber_Cevap {

    public static void main(String[] args) {

        /*
            Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int counter = 0;

        for(int i = 1; i <= sayi; i++) {
            if(sayi != 1) {
                if(sayi%i == 0) counter++;
            }
        }

        if(counter == 2) {
            System.out.println("Asal sayidir.");
        }else {
            System.out.println("Asal sayi degildir");
        }

    }

}
