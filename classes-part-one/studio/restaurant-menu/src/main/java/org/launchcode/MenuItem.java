package org.launchcode;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;
    private boolean isNew;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    //    public MenuItem(String name, String description, double price, String category, LocalDate dateAdded) {
//        this.name = name;
//        this.description = description;
//        this.price = price;
//        this.category = category;
//        this.isNew = true;
//        this.dateAdded = dateAdded;
//    }
//    public void setDateAdded(){
//        this.dateAdded = dateAdded;
//            }
//
//    public void setName(){
//        this.name = name;
//    }
//
//    public void setDescription(String description){
//        this.description = description;
//    }
//
//    public void setPrice(double price){
//        this.price = price;
//    }
//
//    public void setCategory(String category){
//        this.category = category;
//    }
//
//    public void setIsNew(boolean isNew){
//        this.isNew = isNew;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public String getDescription(){
//        return this.description;
//    }
//
//    public double getPrice(){
//        return this.price;
//    }
//
//    public String getCategory(){
//        return this.category;
//    }
//
//    public boolean getIsNew() {
//        return this.isNew;
//    }
//
//    public LocalDate getDateAdded() {
//        return this.dateAdded;
//    }
}