package com.driver;


    /
    public class Main {
        public static void main(String[] args) {
            // Step 4: Create an object of RWOnly class
            RWOnly obj = new RWOnly();

            // Trying to set and print directly (Step 4)

            // Trying to set and print directly (Step 4)
            obj.name = "John"; // Compile-time error because 'name' is private
            System.out.println(obj.name); // Compile-time error because 'name' is private

            // Step 6: Using getter and setter methods
            obj.setName("John"); // Setting value using setter
//            System.out.println("Name: " + obj.getName()); // Getting value using getter
        }
    }