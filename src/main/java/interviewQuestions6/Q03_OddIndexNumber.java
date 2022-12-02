package interviewQuestions6;

public class Q03_OddIndexNumber {
    public static void main(String[] args) {
        // indexi tek sayi olan karakterleri yazdiran bir code create ediniz
        String str = "01010101010101";
        for (char w : str.toCharArray()) {
            if (str.indexOf(w) % 2 == 1) {
                System.out.print(w);
            }
        }
    }
}
