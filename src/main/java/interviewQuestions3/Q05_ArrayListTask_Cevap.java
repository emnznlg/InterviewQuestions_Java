package interviewQuestions3;

import java.util.ArrayList;
import java.util.List;

public class Q05_ArrayListTask_Cevap {

    public static void main(String[] args) {
        // Part1:
        // Create an arraylist of Strings
        // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
        // print out all the elements, each element on new line

        // Part2:
        // Create a method that accepts a String arraylist and a String as parameters
        // method should add the element at the first index of arraylist

        // Part3:
        // Create a method that accepts a String arraylist and a String as parameters
        // it should add element before last element
        // ex:  [1, 2, 3]  -> [1, 2, 4, 3]

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Red");
        arrList.add("Green");
        arrList.add("Blue");
        arrList.add("Yellow");
        arrList.add("Black");
        arrList.stream().forEach(System.out::println);
        System.out.println("**********************");
        method1(arrList, "Orange");
        arrList.stream().forEach(System.out::println);
        System.out.println("***********************");
        method2(arrList, "Brown");
        arrList.stream().forEach(System.out::println);
    }

    public static void method1(ArrayList<String> list, String str) {
        list.add(0, str);
    }

    public static void method2(ArrayList<String> list, String str) {
        list.add(list.size() -1, str);
    }

}
