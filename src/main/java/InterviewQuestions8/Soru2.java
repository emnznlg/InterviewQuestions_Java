package InterviewQuestions8;

public class Soru2 {

    public static void main(String[] args) {

        //Question 7 : Find all substrings of String in java?
        String str = "abc";
        for (int i = 0; i < str.length(); i++) {
            for(int j = i +1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }

    }

}
