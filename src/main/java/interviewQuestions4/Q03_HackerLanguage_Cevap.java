package interviewQuestions4;

public class Q03_HackerLanguage_Cevap {

    public static void main(String[] args) {

        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
        //    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        //    s -> 5
        //    a -> 4
        //    e -> 3
        //    i -> 1
        //    o -> 0
        //    Test data
        //    hackerDili("java ile hersey guzel")
        //    j4v4 1l3 h3r53y guz3l
        //    İpucu harfleri değiştirin ve ekrana yazdırın.

        degistir("java ile hersey guzel");

    }

    public static void degistir(String str) {
        String arr[] = str.split("");
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "s":
                    arr[i] = "5";
                    break;
                case "a":
                    arr[i] = "4";
                    break;
                case "e":
                    arr[i] = "3";
                    break;
                case "i":
                    arr[i] = "1";
                    break;
                case "o":
                    arr[i] = "0";
                    break;
            }
        }
        for (String w : arr) {
            System.out.print(w);
        }
    }


}
