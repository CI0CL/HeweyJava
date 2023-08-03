package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ArraylistAs {

    public static void main(String[] args) {
        List oldList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        oldList.stream().forEach(num -> System.out.println(num));
        System.out.println("\n");

        //Exercise: Given an ArrayList of Integer values: 5, 1, 3, 4, 2.
        //Use the Collections.sort() method to sort this list in descending order (i.e., from highest to lowest).
        // Print the sorted list.

        ArrayList newlist = new ArrayList<>(Arrays.asList(5,1,3,4,2));
        Collections.sort(newlist, Collections.reverseOrder());
        System.out.println(newlist);


        //Exercise: Create a List of Integer values from 1 to 5 (inclusive).
        //Then, create a stream from this list and use the forEach method to print each element of the stream.
        ArrayList newestList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("\nFor Each loop: ");
        newestList.stream().forEach(num -> System.out.println(num));

        System.out.println("\n");

        //Exercise: Given a List of Integer values from 1 to 5 (inclusive),
        //use a stream to filter the list so that it only contains even numbers.
        //Store the filtered elements into a new List and print this new list.

        List<Integer> mostlyNewlist = new ArrayList<>(Arrays.asList(5,1,3,4,2));

        List <Integer> evenNumbers = mostlyNewlist.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        evenNumbers.forEach(integer -> System.out.println(integer));











    }
}
