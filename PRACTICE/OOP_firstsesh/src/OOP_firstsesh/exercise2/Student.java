package OOP_firstsesh.exercise2;

public class Student {

    private String studentName;
    private String profession;

    public String getName() {
        return studentName;
    }

    public void setName(String newName) {
       studentName = newName;

    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String newProfession) {
        profession = newProfession;

    }

    @Override
    public String toString(){
        return studentName;

    }
}