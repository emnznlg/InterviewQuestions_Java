package interviewQuestions2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q03_FibonacciListNumber_Cevap {

    /*
         Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
         0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        fibo.add(0);
        fibo.add(1);

        System.out.println("Lutfen Fibonacci dizisinin kacinci sayiya kadar devam etmesini istediginizi belirtiniz");
        int userInp = scan.nextInt();

        do {
            if (userInp > 1) {
                for (int i = 1; i < userInp; i++) {
                    fibo.add(fibo.get(i - 1) + fibo.get(i));
                }
                for (int i = 1; i < fibo.size(); i++) {
                    if (fibo.get(i) > userInp) {
                        fibo.remove(fibo.get(i));
                        i--;
                    }
                }
                System.out.println(fibo);
                break;
            } else {
                System.out.println("Sayi 2 den kucuk olamaz... Tekrar sayi giriniz...");
                userInp = scan.nextInt();
            }
        } while (true);


    }


}
