package interviewQuestions4;

import java.text.DecimalFormat;

public class Q06_MultipleMethodVarargs_Cevap {

    public static void main(String[] args) {

        /*
            Problem Tanımı :
            farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
            yazdıran parametreli method yazınız
        */
        hesapla("Ali", 45,78,89,55,65,47);
        hesapla("Veli", 45,78,89,55);
        hesapla("Ayse", 45,78,89);
        hesapla("Fatma", 45,78,89,55,65);

    }

    public static void hesapla(String isim, double... not) {
        double sum = 0;
        for (double w : not) {
            sum += w;
        }
        double ortalama = sum / not.length;
        DecimalFormat format = new DecimalFormat(".##");
        System.out.println(isim + " " + format.format(ortalama));
    }

}
