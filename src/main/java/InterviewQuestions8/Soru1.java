package InterviewQuestions8;

public class Soru1 {

    public static void main(String[] args) {

        //Find first non-repeated character in String in java?
        String str = "izittin";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

}
