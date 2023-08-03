package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Teacher {

    private String name;
    private List<Student> students;

    public Teacher(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudents(Student student){
        students.add(student);
    }

    public void takeAttendance() {
        if (students.isEmpty()) {
            System.out.printf("Sorry, there are no students in %s's class", this.name);
        }

        ArrayList<String> studentNames = new ArrayList<>();
        students.forEach(student -> studentNames.add(student.getName()));
        System.out.println("This class consists of: " + studentNames.stream().collect(Collectors.toList()));
    }


    public Double getAverageStudents() {
        List<Double> totalAverages = new ArrayList<>();
        students.forEach(student -> totalAverages.add(student.averageExamResults()));
        double classResult = totalAverages
                .stream()
                .reduce(0.00, (result, item) -> result + item / totalAverages.size());

        System.out.printf("The average score in %s's class is: %.1f\n", this.name, classResult);
        return classResult;

    }
    public double getLowestAverage(){

        Map<String, Double> results = new HashMap<>();
        students.stream().forEach(student -> results.put(student.getName(), student.averageExamResults()));
        double minValueInMap = (Collections.min(results.values()));
        

        System.out.printf("The lowest average score in %s's class is: %.1f\n", this.name, minValueInMap);
        return minValueInMap;
    }


    public double getHighestAverage(){

        Map<String, Double> results = new HashMap<>();
        students.stream().forEach(student -> results.put(student.getName(), student.averageExamResults()));
        double maxValueInMap = (Collections.max(results.values()));

        System.out.printf("The highest average score in %s's class is: %.1f\n", this.name, maxValueInMap);
        return maxValueInMap;
    }




}
