package org.launchcode;



import java.util.ArrayList;

import java.util.Collections;

public class ArrayPlayground {
//    public static void main(String [] args) {
//        for (int i = 0; i < 10; i++ ) {
//            System.out.println(i);
//        }
//    }
//    public static void main(String [] args) {
//        for (int i = 100; i >= 0; i -= 5) {
//            System.out.println(i);
//        }
//    }
//public static void main(String[] args) {
//    int nums[] = {1,1,2,3,5,8,13,21};
//
//    for (int i : nums) {
//        System.out.println(i);
//    }
//}
//public static void main(String[] args) {
//    String msg = "Hello World";
//
//    for (char c : msg.toCharArray()) {
//        System.out.println(c);
//    }
//}
//public static void main(String [] args) {
//    int i = 0;
//    while (i < 3) {
//        i++;
//    }
//}
//public static void main(String [] args) {
//    do {
//        System.out.println("Hello, World");
//    } while (false);
//}
//public static void main(String[] args) {
//    int[] someInts = {1,10,2,3,5,8,10};
//    int searchTerm = 10;
//    for (int oneInt : someInts) {
//        if (oneInt == searchTerm) {
//            System.out.println("Found it!");
//            break;
//        }
//    }
//}
//    public static void main(String[] args) {
//        int[] someInts = {1,10,2,3,5,8,10};
//        int searchTerm = 10;
//        for (int oneInt : someInts) {
//            if (oneInt == searchTerm) {
//                System.out.println("Found it!");
//                continue;
//            }
//            System.out.println("Not found");
//        }
//    }
//public static void main(String[] args) {
//    char[] chars = {'p', 'l', 'r', 's', 't'};
//
//    for (char i : chars) {
//        System.out.println(i);
//    }
//}
//
public static void main(String[] args) {

    ArrayList<String> planets = new ArrayList<>();
    String[] planetsArray = new String[planets.size()];
    planets.toArray(planetsArray);
    planets.add("Mercury");
    planets.add("Venus");
    planets.add("Earth");
    planets.add("Mars");
    planets.add("Jupiter");
    planets.add("Saturn");
    planets.add("Uranus");
    planets.add("Neptune");
    System.out.println(planets);
}
}

