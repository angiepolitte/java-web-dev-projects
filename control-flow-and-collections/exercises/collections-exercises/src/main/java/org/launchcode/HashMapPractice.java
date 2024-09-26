package org.launchcode;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter the students (or ENTER to finish): ");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("ID: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);

                //Read in the newline before looping back
                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();

        System.out.println("\nStudents and ID's: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
        System.out.println("Number of students in roster: " + students.size());


    }
}
