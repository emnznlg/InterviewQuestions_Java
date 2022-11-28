package interviewQuestions3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_FrequencyOfCertainChar_Cevap {

    public static void main(String[] args) {

            /*
                Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
                char ch= 'e'
                String name ="Sevecen" => Tekrar Sayisi = 3
            */

        Scanner input = new Scanner(System.in);
        System.out.println("Isım girin");
        String isim = input.nextLine();
        System.out.println("Karakter gir?");
        char ch = input.next().charAt(0);

        char arr[] = isim.toCharArray();
        int count = 0;
        for (char w : arr) {
            if(w == ch) {
                count++;
            }
        }
        System.out.println("String name = " + isim + " ==> Tekrar Sayisi = " + count);

    }
}
