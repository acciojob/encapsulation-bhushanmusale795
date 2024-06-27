package com.driver;

public class Main {

    // Step 3: Create Main class with main function
    public class Main {
        public static void main(String[] args) {
            // Step 4: Create an object of RWOnly class
            RWOnly obj = new RWOnly();

            // Trying to set and print directly (Step 4)
            // obj.name = "John"; // This will give a compile-time error because 'name' is private
            // System.out.println(obj.name); // This will also give a compile-time error

            // Step 6: Using getter and setter methods
            obj.setName("John"); // Setting value using setter
            System.out.println("Name: " + obj.getName()); // Getting value using getter
        }
    }