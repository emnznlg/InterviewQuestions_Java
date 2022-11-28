package interviewQuestions3;

public class Q06_MultiDimensolArray_Cevap {

    public static void main(String[] args) {

    /*
        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
        verilen Array icinde
        --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */
        int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};
        int elemanSayisi = 0;
        for (int[] w : arr) {
            for (int s : w) {
                elemanSayisi++;
            }
        }
        System.out.println(elemanSayisi);
    }
}
