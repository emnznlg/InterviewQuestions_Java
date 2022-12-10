package interviewQuestions7;

public class Soru1 {

    public static void main(String[] args) {

        //Question 1 : How to reverse a String in java? Can you write a program without using any java inbuilt methods?
        String str = "I love Java";
        String strReversed = "";
        String strArr[] = str.split("");
        for (int i = strArr.length - 1; i >= 0; i--) {
            strReversed += strArr[i];
        }
        System.out.println(strReversed);

    }

}
