package interviewQuestions5;

import java.util.Scanner;

public class Q05_UsingDoWhileWithCondition_Cevap {

    public static void main(String[] args) {

        /*
            Ask user to enter an integer.
            If the integer is less than 100, tell user "Won!"
            Otherwise, tell user "Lost!"
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("int pls: ");
        int i = scanner.nextInt();

        if (i < 100) {
            System.out.println("Won!");
        }else {
            System.out.println("Lost!");
        }

    }

}
