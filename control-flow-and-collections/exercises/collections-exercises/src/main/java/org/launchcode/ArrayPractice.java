package org.launchcode;


import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i : integerArray)
//            System.out.println(i);
            if (i % 2 != 0) {






                System.out.println(i);
            }


        String greenEggsAndHam = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = greenEggsAndHam.split(" ");
        String[] wholeSentences = greenEggsAndHam.split("\\.");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(wholeSentences));


    }


}