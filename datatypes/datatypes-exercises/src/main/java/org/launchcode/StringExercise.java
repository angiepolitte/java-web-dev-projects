package org.launchcode;

import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args){
        String excerpt = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Search for a term and we'll see if it is in the string: ");
        String searchTerm = input.nextLine();
         if (excerpt.toLowerCase().contains(searchTerm.toLowerCase())) {
             System.out.println("Your word " + searchTerm.toLowerCase() + " is in the excerpt");
         }
         else {
             System.out.println("Your word " + searchTerm.toLowerCase() + " is not in the excerpt");
         }
        Integer index = excerpt.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = excerpt.replace(searchTerm, "");
        System.out.println(modifiedSentence);


    }
}
