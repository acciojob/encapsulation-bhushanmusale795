package com.driver;





// Main.java

public class Main {
    public static void main(String[] args) {
        // Create an object of RWOnly
        RWOnly obj = new RWOnly();

        // Use the setter method to set the name
        obj.setName("John");

        // Use the getter method to retrieve the name and print it
        String retrievedName = obj.getName();
        System.out.println("Name retrieved using getter: " + retrievedName);
    }
}
