package OOP_firstsesh.exercise1;

public class Programme {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();

        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Student3 = new Student();

        Student1.name = "Coco";
        Student2.name = "Steffano";
        Student3.name = "Kevin";
        ;
        Student1.profession = "Security Operations Officer";
        Student2.profession = "TBD";
        Student3.profession = "Application consultant";

        System.out.println(Student1);
        System.out.println(Student2);
        System.out.println(Student3);

    }
}
