package org.launchcode;
//Imports

import java.time.LocalDate;
import java.util.ArrayList;



public class Menu {

    //Fields
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;


//    default constructor

//    public Menu(LocalDate lastUpdated, ArrayList<MenuItem> menuItems) {
//        this.lastUpdated = lastUpdated;
//        this.menuItems = menuItems;
//    }

    //    Getters
//    public LocalDate getLastUpdated() {
//        return lastUpdated;
//    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

//    Setters

//    public void setLastUpdated(LocalDate lastUpdated) {
//        this.lastUpdated = lastUpdated;
//    }
//
//    public void setMenuItems(ArrayList<MenuItem> menuItems) {
//        this.menuItems = menuItems;
//    }

    //Special Methods
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\n***** Angelina's Cucina *****\n\n" +
                "Appetizers" + appetizers.toString() + "\n" +
                "Main Courses" + mainCourses.toString() + "\n" +
                "Desserts" + desserts.toString() + "\n";

    }

//    Instance Methods
void addItem(MenuItem newItem) {
    String message = "That item has already been added to the menu.";
    if (menuItems.contains(newItem)) {
        System.out.println(message);
        return;
    }
    for (MenuItem item : menuItems) {
        if (item.equals(newItem)) {
            System.out.println(message);
            return;
        }
    }
    menuItems.add(newItem);
    lastUpdated = LocalDate.now();
}
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}



