package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Exercise: Declare a new Java Collection of type ArrayList which will store Integer objects.
        // Write a loop that will add the integers 1 to 5 (inclusive) into this collection.
        // Finally, print out each element of the collection.

        Collection collection = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            collection.add(i);
        }
        for (Object num : collection) {
            System.out.print(num);

        }
        System.out.println("\n");

        //Exercise: Given a List of Integer values from 1 to 5 (inclusive),
        //write a for-each loop that prints each value on a separate line.

        List<Integer> integerValues = new ArrayList<>();
        integerValues.add(1);
        integerValues.add(2);
        integerValues.add(3);
        integerValues.add(4);
        integerValues.add(5);

        new ArrayList<>(Arrays.asList(1,2,3,4,5));


        for (int num : integerValues) {
            System.out.print(num);

        }
        System.out.print("\n");

        // Exercise: Create an ArrayList of Integer and a LinkedList of Integer, each containing the values 1, 2, 3, 4, 5.
        //Write code to access the third element (index 2) from both the ArrayList and LinkedList and print these values.

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(arrayList.get(2));
        System.out.println(linkedList.get(2));

        for (int i = 0; i < integerValues.size(); i++) {
            System.out.println(integerValues.get(i));
        }
        System.out.println("\n");


        //Exercise: Create a HashSet of Integer and add the integers 1 to 5 (inclusive) to the set.
        // Attempt to add the integer 3 to the set a second time. After this, print the contents of the set.
        //(The purpose of this exercise is to understand that sets do not allow duplicate elements.)

        HashSet<Integer> integers = new HashSet<>();

        for (int i = 1; i <= 5; i++) {
            integers.add(i);
        }
        System.out.println("\nHashSet: " + integers);

        integers.add(3); //


    }





}