package org.launchcode;

import javax.xml.transform.Source;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {

        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numArray = new ArrayList<>();

        numArray.add(1);
        numArray.add(5);
        numArray.add(6);
        numArray.add(23);
        numArray.add(7);
        numArray.add(34);
        numArray.add(67);
        numArray.add(2);
        numArray.add(8);
        numArray.add(90);
        numArray.add(32);
        numArray.add(45);

        int evenSum = sumEven(numArray);
        System.out.println("The total sum of even numbers: " + evenSum);


    }
//    public static void main(String[] args)  {
//
//        String words[] = {"bike", "tacos", "tiger", "ring", "celebrate", "candy", "cat", "dogs"};
//        int searchTerm = 5;
////        iterate through the array, if each word's length is equal to number of characters input then print out'
//        for (String index : words) {
//            if ()
//        }
//list result, print out results
//
////        ArrayList<String> wordsWithThatAmountOfLetters = new ArrayList<>();
//////        ArrayList<Integer> wordLength = new ArrayList<>();
////        Scanner input = new Scanner(System.in);
////        String numChars;
////
////        for (wordsWithThatAmountOfLetters  : arr);
////
////        do {
////            numChars = input.nextInt();
////            if (numChars == wordlength) {
////                System.out.println(wordsWithThatAmountOfLetters);
////            }
////        }
////
////        for (char i : arr) {
////            if (word.length() == 5) {
////                System.out.println(Arrays.toString(word));
////            }
////        }
//
//    }
}
