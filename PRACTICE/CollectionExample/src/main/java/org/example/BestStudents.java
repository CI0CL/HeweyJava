package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class BestStudents {

    //8. Define a Student class with name, birth year and the number of passed exams.
    //Create a collection of students and find the list of students
    //with 20 passed exams and sort with name and print on console.

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Emma", 1992, 3));
        students.add(new Student("Steve", 2010, 20));
        students.add(new Student("Nani", 2012, 13));
        students.add(new Student("Rob", 1942, 34));
        students.add(new Student("Matt", 2010, 2));

        List<Student> bestStudents = students.stream()
                .filter(student -> student.getPassedExams() >= 20)
                .collect(Collectors.toList());

        Collections.sort(bestStudents, Comparator.comparing(Student::getName));
        bestStudents.forEach(student -> System.out.println(student.getName()));
    }
}
