package interviewQuestions6;

public class Q02_AtbashCode {
    /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */

    public static void main(String[] args) {

        String cumle = "Ali ata bak".toLowerCase();
        String str = "abcdefghijklmnopqrstuvwxyz";

        char cumleArr[] = cumle.toCharArray();
        StringBuilder cumleRev = new StringBuilder();

        for (char w : cumleArr) {
            if (str.indexOf(w) == -1) {
                cumleRev.append(" ");
            } else {
                cumleRev.append((char) ('z' - str.indexOf(w)));
            }
        }
        System.out.println(cumleRev);
    }


}