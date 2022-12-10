package interviewQuestions7;

public class Soru4 {

    public static void main(String[] args) {

        //How to check if one String is rotation of another String in java?

        String str1 = "java2blog";
        String str2 = "blogjava2";
        String str3 = str1 + str1;

        if (str3.contains(str2)) {
            System.out.println("Rotation");
        }else {
            System.out.println("Not rotation");
        }

    }

}
