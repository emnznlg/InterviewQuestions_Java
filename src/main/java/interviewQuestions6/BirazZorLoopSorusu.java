package interviewQuestions6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirazZorLoopSorusu {

    public static void main(String[] args) {


        /*
           Problemin Tanımı
           Kullanıcıdan A'dan Z'ye kadar bir harf girmesini isteyin ve
           girilen harflere kadar olan harflerden oluşan bir piramit şeklinde çıktı oluşturun

           Örnek Ekran Çıktısı
           Harf girin: E
           A
           ABA
           ABCBA
           ABCDCBA
           ABCDEDCBA
        */


        Scanner input = new Scanner(System.in);
        System.out.println("Harf gir: ");
        char harf = input.next().charAt(0);

        for (int i = 'A'; i <= harf; i++) {
            for (int j = 'A'; j <= i; j++) {
                System.out.print((char) j);
            }
            for (int j = i - 1; j >= 'A'; j--) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }


}
