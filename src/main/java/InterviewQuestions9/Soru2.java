package InterviewQuestions9;

public class Soru2 {

    public static void main(String[] args) {

        //How do you swap two numbers without using a third variable in Java?
        int a = 5;
        int b = 1;
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println(a);
        System.out.println(b);

    }

}
