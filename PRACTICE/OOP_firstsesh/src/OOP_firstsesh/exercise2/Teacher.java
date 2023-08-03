package OOP_firstsesh.exercise2;

public class Teacher {
    private String name ="Vlad";
    private String company = "Code Nomads";

    public String getName() {
        return name;

    }

    public void setName(String newName) {
        name = newName;

    }

    public String getCompany() {
        return company;

    }

    public void setCompany(String newCompany) {
        company = newCompany;

    }


    @Override
    public String toString(){
        return name;
    }
}
