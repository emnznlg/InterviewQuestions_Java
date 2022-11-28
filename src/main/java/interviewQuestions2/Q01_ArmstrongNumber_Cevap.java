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
        System.out.println("Enter a 3 digits number: ");
        int num = scan.nextInt();
        int sum = 0;
        String numStr = String.valueOf(num);

        for (int i = 0; i < numStr.length(); i++) {
            sum += Math.pow(Integer.parseInt(numStr.substring(i, i + 1)), 3);
        }

        if (sum == num) {
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not Armstrong number");
        }

    }


}
