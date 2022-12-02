package interviewQuestions5;

import java.util.Scanner;

public class Q04_PrintVowelsOfString_cevap {

    public static void main(String[] args) {
        //Get String from user and print just vowels(aeiou) inside String on the console
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a String pls");
        String str = input.nextLine().toLowerCase();
        String s = str.replaceAll("[^aeiou]", "");
        System.out.println(s);


    }

}
