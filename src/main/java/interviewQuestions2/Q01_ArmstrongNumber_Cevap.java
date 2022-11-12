package interviewQuestions2;

import java.util.Scanner;

public class Q01_ArmstrongNumber_Cevap {

        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
            Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

    */

    public static void main(String[] args) {
        armstrongBul();
    }

    public static void armstrongBul() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        String sayiStr = String.valueOf(sayi);
        for (int i = 0; i < sayiStr.length(); i++) {
            int sayiInt = Integer.parseInt(sayiStr.substring(i, i + 1));
            sum += (sayiInt * sayiInt * sayiInt);
        }

        String sonuc = (sayi == sum) ? "Armstrongdur" : "Armstrong degildir";
        System.out.println(sonuc);

    }


}
