package org.launchcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
    int[] numArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 != 0) {
                System.out.println(numArray[i]);
            }
        }

    String phrase = "I would not, could not, in a box. " +
            "I would not, could not with a fox. " +
            "I will not eat them in a house. " +
            "I will not eat them with a mouse." ;
        String[] sentences = phrase.split("\\.");
            for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].trim();
        }
//        System.out.println(Arrays.toString(sentences));
        for (String sentence : sentences){
            System.out.println(sentence + ".");
        }

    }

}

