package org.launchcode;

import java.util.ArrayList;

public class ArrayListPractice {

    public static int findSumEvenNumbers(ArrayList<Integer> arr){
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
//    public static String wordsWithFiveLetters(ArrayList<String> arr){
//        String wordList = "";
//        for (String word : arr) {
//            if (word.length() == 5) {
//                wordList += word;
//            }
//        }
//        return wordList;
//    }
public static String wordsWithFiveLetters(ArrayList<String> arr) {
    StringBuilder wordList = new StringBuilder(); // Use StringBuilder for better performance
    for (String word : arr) {
        if (word.length() == 5) {
            wordList.append(word).append("\n"); // Append the word and a newline
        }
    }
    return wordList.toString(); // Convert StringBuilder to String
}

    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.add(42);
        numArray.add(422);
        numArray.add(4254);
        numArray.add(424);
        numArray.add(4);
        numArray.add(72);
        numArray.add(428);
        numArray.add(9);
        numArray.add(422);

        System.out.println(findSumEvenNumbers(numArray));

        int totalSumEvenNumbers = findSumEvenNumbers(numArray);

        System.out.println("The total when adding all the even numbers is " + totalSumEvenNumbers);

        ArrayList<String> randomWords = new ArrayList<>();
        randomWords.add("tacos");
        randomWords.add("mate");
        randomWords.add("steak");
        randomWords.add("fish");
        randomWords.add("toilet");
        randomWords.add("purple");
        randomWords.add("meats");
        randomWords.add("legos");

        System.out.println(wordsWithFiveLetters(randomWords));

        String wordList = wordsWithFiveLetters(randomWords);

        System.out.println("Below is a list of words with 5 letters: \n" + wordList);

            }

}
