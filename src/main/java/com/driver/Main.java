package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Now proceed with Task 4, 5, and 6 as described
        // Attempt to directly access private member (Task 4)
        obj.name = "Direct Access";  // This will cause a compile-time error
        System.out.println(obj.name);  // This will also cause a compile-time error
        // Using getter and setter (Task 6)
        obj.setName("John Doe");  // Using setter to set the value
        System.out.println(obj.getName());  // Using getter to retrieve and print the value
}