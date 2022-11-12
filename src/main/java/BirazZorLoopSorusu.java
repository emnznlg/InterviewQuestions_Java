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

        Scanner scan = new Scanner(System.in);
        System.out.println("Harf gir");
        char harf = scan.next().charAt(0);

        for (int i = 'A'; i <= harf; i++) {
            for (int j = 'A'; j <= i; j++) {
                System.out.print((char) j);
            }
            for (int k = i - 1; k >= 'A'; k--) {
                System.out.print((char) k);
            }
            System.out.println();
        }

    }

}
