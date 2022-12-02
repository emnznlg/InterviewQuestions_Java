package interviewQuestions6;

import java.util.Map;
import java.util.Scanner;

public class Q05_ExponentialNumber {
    //Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Num 1?");
        int num1 = input.nextInt();
        System.out.println("Num 1?");
        int num2 = input.nextInt();

        System.out.println((int) Math.pow(num1, num2));

    }

}
