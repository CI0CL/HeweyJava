package OOP_firstsesh.exercise2;

import java.util.*;

public class Group {

    Student[] students;
    Teacher teacher;

    void printTrainer(){
        System.out.println("Teacher:" + teacher);

    }

    public void printStudent(){
        String studs = "";

        for (int i = 0; i < students.length; i++) {
            studs += students[i] + ", ";
        }
        System.out.println(studs);
    }
}
