package interviewQuestions1;

import java.util.Scanner;

public class Q04_CountOfEnterCode_Cevap {

    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        String pin = "Emin.123";
        int girisHakki = 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Hosegeldiniz! Lutfen PIN kodunuzu giriniz");
        String userInput = scan.nextLine();
        while (true) {
            if (userInput.equals(pin)) {
                System.out.println("Sisteme giris BASARILI!!!");
                break;
            }else {
                girisHakki--;
                if(girisHakki != 0) {
                    System.out.println("PIN kodunu yanlis girdiniz. Lutfen tekrar deneyiniz. " + girisHakki + " adet giris hakkiniz kaldi.");
                    userInput = scan.nextLine();
                }else  {
                    System.out.println("Uc kere arka arkaya yanlis giris yaptiginiz icin sistem bloke oldu.");
                    break;
                }
            }
        }


    }

}
