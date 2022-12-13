package InterviewQuestions9;

public class Soru5 {

    public static void main(String[] args) {

        //Write a Java program to check if the given number is a prime number.
        int num = 11;
        if (num != 2) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("This is not a prime number");
                    break;
                }else {
                    System.out.println("This is a prime number");
                    break;
                }
            }
        } else {
                System.out.println("This is a prime number");
        }

    }

}
