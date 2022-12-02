package interviewQuestions5;

public class Q01_UsingDoWhilePrintNumber_Cevap {

    public static void main(String[] args) {

        /*
            create one int
            do while int is less than 100
            print the number
            increment by 5
            for example: 0   5   10  15  20
        */

        int sayi = 0;
        do {
            System.out.print(sayi + " ");
            sayi = sayi + 5;
        }while (sayi < 100);

    }

}
