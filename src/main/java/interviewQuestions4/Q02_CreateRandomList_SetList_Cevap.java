package interviewQuestions4;

import java.util.ArrayList;

public class Q02_CreateRandomList_SetList_Cevap {

    public static void main(String[] args) {

        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemanının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        ArrayList<Integer> list = new ArrayList<>();
        randomEkle(list);
    }

    public static void randomEkle(ArrayList<Integer> list) {
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            int deger = (int) (Math.random() * 20);
            if (deger % 2 == 0) {
                list.add(111);
            } else {
                list.add(deger);
                counter++;
            }
        }
        if (counter == list.size()) {
            System.out.println("Cift sayi yoktur...");
        }
        System.out.println(list);
    }

}
