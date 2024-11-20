package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(46,2));
        System.out.println(Divide(10,0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static String Divide(int x, int y)    {
        try {
            int result = x / y;
            return String.valueOf(result);
        } catch (ArithmeticException e) {
            return "Cannot divide by zero!";
        }


    }

//    public static int CheckFileExtension(String fileName)
//    {
//        // Write code here!
//
//    }
}