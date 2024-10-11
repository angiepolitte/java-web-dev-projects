package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem menuItem1 = new MenuItem("Tiramisu", 12, "Lady fingers and coffee liqueur", "dessert");
        MenuItem menuItem2 = new MenuItem("Braised Lamb", 24, "Lamb in a red wine sauce", "main course");
        MenuItem menuItem3 = new MenuItem("Shrimp Puffs", 14, "Shrimp baked in puff pastry", "appetizer");
        MenuItem menuItem4 = new MenuItem("Bananas Foster", 15, "Sweet, fiery, frozen delight", "dessert");
        MenuItem menuItem5 = new MenuItem("Chilean Sea Bass", 37, "Wild caught deliciousness", "main course");
        MenuItem menuItem6 = new MenuItem("Cheese Plate", 22, "Assorted cheeses", "appetizer");


//        System.out.println(menuItem1.isNew());
        System.out.println(menuItem1);
//        System.out.println(menuItem2);
//        System.out.println(menuItem3);
//        System.out.println(menuItem4);
//        System.out.println(menuItem5);
//        System.out.println(menuItem6);


//        Create menu
        Menu menu = new Menu();
//
//Add items to menu
        menu.addItem(menuItem1);
        menu.addItem(menuItem2);
        menu.addItem(menuItem3);
        menu.addItem(menuItem4);
        menu.addItem(menuItem5);
        menu.addItem(menuItem6);

        System.out.println(menu);

//        Remove item
        menu.removeItem(menuItem2);
        System.out.println(menu);

        System.out.println(menuItem1.equals(menuItem2));
    }

}
