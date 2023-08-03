package org.example;

public class ExamRecordMain {

    // exam record which has a grade (integer from 0 to 10) the constructor throws an exception Done!
    // if we try to create an exam with a grade that is not between those numbers
    // a student has a list of exams function on student that calculates his average score test

    public static void main(String[] args) {

        //Exam exam1 = new Exam("History", -2);
        Student emma = new Student("Emma", 1940);
        Student steve = new Student("Steve", 1410);
        Student thomas = new Student("Thomas", 1820);

        emma.addExam(new Exam("History", 2));
        emma.addExam(new Exam("French", 5));

        steve.addExam(new Exam("History", 9));
        steve.addExam(new Exam("French", 10));
        thomas.addExam(new Exam("Math", 3));

        thomas.addExam(new Exam("History", 3));
        thomas.addExam(new Exam("French", 4));
        thomas.addExam(new Exam("Math", 8));

        Teacher newTeacher = new Teacher("Egon");

        newTeacher.addStudents(emma);
        newTeacher.addStudents(steve);
        newTeacher.addStudents(thomas);
        newTeacher.takeAttendance();

        newTeacher.getAverageStudents();
        newTeacher.getHighestAverage();
        newTeacher.getLowestAverage();





    }
}
