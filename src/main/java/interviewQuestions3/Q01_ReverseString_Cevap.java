package interviewQuestions3;

public class Q01_ReverseString_Cevap {

    public static void main(String[] args) {

        /*
            // Stringi ters cevirmek icin bir Java Programi yazin
            //1.Yol: StringBuilder () kullanarak
            //2.Yol: String Classini kullanarak
            //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
        */

        String str = "Bu bir String ifadedir";
        String strArr[] = str.split("");
        String revStr = "";

        for (int i = strArr.length - 1; i >= 0; i--) {
            revStr += strArr[i];
        }
        System.out.println(revStr);

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

        revStr(str);

    }
    public static void revStr(String str) {
        String strArr[] = str.split("");
        String revStr = "";

        for (int i = strArr.length - 1; i >= 0; i--) {
            revStr += strArr[i];
        }
        System.out.println(revStr);
    }
}
