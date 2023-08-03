package org.example;

public class Exam {

    private double grade;
    private String topic;
    private boolean isPassed;

    public Exam (String topic, double grade) {
        if (grade < 0.0 || grade > 10.0) {
            throw new RuntimeException("Hey, that's an invalid grade: " + grade);
        } else {
            this.grade = grade;
            this.topic = topic;
            this.isPassed = (grade < 5.5) ? true : false;
        }
    }

    public double getGrade(){
        return grade;
    }
}
