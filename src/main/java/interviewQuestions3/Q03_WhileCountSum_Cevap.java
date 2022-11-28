package interviewQuestions3;

import java.util.Scanner;

public class Q03_WhileCountSum_Cevap {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar isteyin
        // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
        // bu kadar sayi yeter
        // ".. adet sayi girdin, toplami..." yazdirin

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        do {
            System.out.println("Sayi gir:");
            int sayi = scan.nextInt();
            if (sum < 500 || count != 10) {
                sum += sayi;
                count++;
            }
        } while (sum < 500 && count != 10);
        System.out.println(count + " adet sayi girdin, toplami " + sum + " etti...");


    }

}
