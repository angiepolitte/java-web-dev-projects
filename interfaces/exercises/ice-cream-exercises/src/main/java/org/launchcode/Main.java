package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

//        Comparator comparator = new FlavorComparator();
//        flavors.sort(comparator);
//        Comparator coneComparator = new ConeComparator;
//        cones.sort(coneComparator);

        System.out.println("\nFlavors Before Sort: \n");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        flavors.sort(new FlavorComparator());
        System.out.println("\nFlavors After Sort: \n");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        System.out.println("\nCones Before Sort: \n");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }

        cones.sort(new ConeComparator());
        System.out.println("\nCones After Sort: \n");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());

        }







        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}