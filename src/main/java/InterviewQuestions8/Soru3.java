package InterviewQuestions8;

public class Soru3 {

    public static void main(String[] args) {

        //Find length of String without using any inbuilt method in java?

        //1.Yol
        String str = "Abizittin";
        int count = 0;
        for (char w : str.toCharArray()) {
            count++;
        }
        System.out.println(count);


        //2.Yol
        int i = 0;
        try {
            for (i = 0; ; i++) {
                str.charAt(i);
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(i);
        }

    }

}
