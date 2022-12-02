package interviewQuestions4;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05_SpecialCharRemoveArray_Cevap {

    public static void main(String[] args) {

            /*
               Problem Tanımı :
               getSum isminde bir method oluşturun.
               Parametresi ArrayList'tir.
               Dizideki tüm $ ları kaldır ve tüm sayıları topla
               return yaptğımız veri tipi 'int' olmalıdır.
               sonuç 0'dan küçükse, -1 yazdırın.

               Örnek1:
               ArrayList = $13, $15, $20
               Cevap = 48 olmalı

               Örnek 2 :
               ArrayList= $-13, $0, $0
               Cevap = -1 olmalı.
            */

        ArrayList<String> arrlist = new ArrayList<>(Arrays.asList("$13", "$15", "$-30"));
        int sum = getSum(arrlist);
        if (sum < 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
        }

    }

    public static int getSum(ArrayList<String> list) {
        int sum = 0;
        for (String w : list) {
            sum += Integer.parseInt(w.replaceAll("\\$", ""));
        }
        return sum;
    }

}
