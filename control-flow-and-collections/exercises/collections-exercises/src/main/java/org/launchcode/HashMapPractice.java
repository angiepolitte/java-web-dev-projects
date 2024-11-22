package org.launchcode;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter a student name (or press Enter to complete) : ");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.println("ID: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);
                input.nextLine();
            }

        } while (!newStudent.equals(""));
        input.close();

        System.out.println("\nStudents and their ID's: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
        System.out.println("Number of students in the roster: " + students.size());

    }
}


//public class HashMapPractice {
//    public static void main(String[] args) {
//        HashMap<Integer, String> students = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        String newStudent;
//
//        System.out.println("Enter the students (or press Enter to finish) : ");
////        prompts the user to enter student names
//        do {
//            System.out.println("Student: ");
//            newStudent = input.nextLine();
////            reads the input from the user and assigns it to the variable newStudent
//
////            for each student, we are inputting an ID number at the same time
//            if (!newStudent.equals("")) {
//                System.out.println("ID: ");
//                Integer newID = input.nextInt();
////                    the input enters is assigned to the newID (above)//
//                students.put(newID, newStudent);
////                    the above line adds the ID as the key and the student name as the value to the collection/HashMap 'students'
//                input.nextLine();
////                    you need the line above as a buffer back into the loop or else it just prints out Student: and stops
//            }
//        } while (!newStudent.equals(""));
//        //The do-while loop continues as long as the user input is not an empty string (look above)
//
//        input.close();
//
//        System.out.println("\nStudents and their ID's: ");
//
//        for (Map.Entry<Integer, String> student : students.entrySet()) {
//            System.out.println(student.getValue() + "'s ID: " + student.getKey());
//        }
//        System.out.println("Number of students in roster: " + students.size());
//
//    }
//}
//
//
//
//
////System.out.println("Enter the students (or press Enter to finish) : ");
////do {
////    System.out.println("Student: ");
////    newStudent = input.nextLine();
////
////    if (!newStudent.equals("")) {
////        System.out.println("ID: ");
////        Integer newID = input.nextInt();
////
////        System.out.println("Team Color: ");
////        String teamColor = input.nextLine(); // Ensure you read this after clearing the buffer
////
////        // Create a new Student object
////        Student student = new Student(newStudent, newID, teamColor);
////        students.put(newID, student);
////
////        input.nextLine(); // Clear buffer for the next iteration
////    }
////} while (!newStudent.equals(""));
