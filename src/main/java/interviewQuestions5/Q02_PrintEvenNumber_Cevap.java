package interviewQuestions5;

public class Q02_PrintEvenNumber_Cevap {

    public static void main(String[] args) {
        /*
            Write a method named isEven that accepts an integer argument.
            The method should return true if the argument is even, or false otherwise.
        */

        System.out.println(isEven(10));
        System.out.println(isEven(11));

    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
