package InterviewQuestions9;

public class Soru3 {

    public static void main(String[] args) {

        // How do you reverse a string in Java?
        String str = "String";
        //1.Way
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        //2.Way
        String arr[] = str.split("");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

}
