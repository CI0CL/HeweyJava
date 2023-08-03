package OOP_firstsesh.exercise2;

import java.util.HashMap;
import java.util.Map;

public class Programme {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        teacher.setName("Bob");
        teacher.setCompany("Createment");

        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Student3 = new Student();
        Student Student4 = new Student();
        Student Student5 = new Student();

        Student1.setName("Coco");
        Student2.setName("Steffano");
        Student3.setName("Irene");
        Student4.setName("Phillip");
        Student5.setName("Kevin");

        Student[] students1 = {Student1, Student2, Student3};
        Student[] students2 = {Student4, Student5};

        Group July_group = new Group();
        July_group.teacher = teacher;
        July_group.students = students1;


        Group August_group = new Group();
        August_group.teacher = teacher;
        August_group.students = students2;

        July_group.printTrainer();
        July_group.printStudent();

        August_group.printTrainer();
        August_group.printStudent();









    }
}
