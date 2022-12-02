package interviewQuestions5;

import java.util.Scanner;

public class Q06_CountsOfRepeatingElement_Cevap {

    public static void main(String[] args) {

        /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
        */

        int arr[] = {1, 1, 1, 22, 23, 85, 58, 77, 66, 22, 23, 77};
        Scanner scan = new Scanner(System.in);
        System.out.println("Num pls?");
        int num = scan.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println(num + " repetead " + count + " times...");
    }

}
