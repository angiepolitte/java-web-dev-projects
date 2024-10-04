package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Menu private List<MenuItem> menuItems;
//private LocalDate lastUpdated;

//public class Menu {
//    ArrayList<String> items = new ArrayList<>();


//
public class Menu {

        private ArrayList<MenuItem> menuItems = new ArrayList<>();
        private LocalDate lastUpdated;

//        public Menu(List<MenuItem> menuItems, LocalDate lastUpdated){
//            this.menuItems = menuItems;
//            this.lastUpdated = lastUpdated;
//        }

//      Allow for default constructor

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


//        public void setLastUpdated(LocalDate lastUpdated){
//            this.lastUpdated = lastUpdated;
//        }
//        public LocalDate getLastUpdated(){
//            return this.lastUpdated;
//        }
//
//        public List<MenuItem> getMenuItems(){
//            return this.menuItems;
//        }
//        public void addMenuItem(MenuItem menuItem){
//            this.menuItems.add(menuItem);
//        }
////        public void setMenuItems(List<MenuItem> menuItems){
////            this.menuItems = menuItems;
////        }
}
