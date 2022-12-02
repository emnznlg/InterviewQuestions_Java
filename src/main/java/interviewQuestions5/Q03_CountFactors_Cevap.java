package interviewQuestions5;

public class Q03_CountFactors_Cevap {

    public static void main(String[] args) {

        /*
           Type java code by using while loop,
           Write a program to count the factors of an integer which is entered by user.
           Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
           Factors of 8  = 1, 2, 4, 8 ==> 4
        */

        findFactors(12);
        System.out.println();
        findFactors(8);
    }

    public static void findFactors(int num) {
        int idx = 1;
        while (idx <= num) {
            if (num % idx == 0) {
                System.out.print(idx + " ");
            }
            idx++;
        }
    }

}
