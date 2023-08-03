package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int birthYear;
    private int passedExam;
    private int exam;
    private List<Exam> examList;

    public Student(String name, int birthYear, int passedExams){
        //, int exams) {
        this.name = name;
        this.birthYear = birthYear;
        this.passedExam = passedExams;
        this.examList = new ArrayList<>();
    }
    public Student(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
        this.examList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPassedExams() {
        return passedExam;
    }

    public void addExam(Exam exam){
        this.examList.add(exam);

    }

    public double averageExamResults(){
        List<Double> resultList = new ArrayList<>();
        examList.forEach(exam -> resultList.add(exam.getGrade()));

        double studentResult = resultList
                .stream()
                .reduce(0.00, (result, item) -> result + item / resultList.size());

        //System.out.printf("%s's average score = %.1f\n", this.name,studentResult);

        return studentResult;
    }

}
