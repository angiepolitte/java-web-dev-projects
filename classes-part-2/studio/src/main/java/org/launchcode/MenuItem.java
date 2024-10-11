package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String name;
    private int price;
    private String description;
    private String category;
    private LocalDate dateAdded;
    private boolean isNew;


    public MenuItem(String name, int price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
//        this.isNew = true;
        this.dateAdded = LocalDate.now();
    }
//    Setters
    public void setName(String name) {
        this.name = name; }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

//    Getters
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public boolean getIsNew() {
        return isNew;
    }
    public LocalDate getDateAdded() {
        return dateAdded;
    }

//Instance Methods
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }
//    Special Methods
    @Override
    public String toString() {
        String newText = isNew()? " ~New Item~" : "";
        return name + newText + "\n" + description + " | $" + price;
    };

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        MenuItem otherItem = (MenuItem) toBeCompared;
        return this.name.equals(otherItem.getName());

    }

}

