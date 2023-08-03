package OOP_thirdsesh.OOP_secondsesh;

public class Engine {

    //Acts the same as private, except for extended classes (like  ElectricEngine)
    protected String model;

    public Engine(String model){
        this.model = model;
    }

    private String engine = "\"default\"";

    public void move(){
        System.out.println("\"Vroom vroom\"");
    }

    public Engine(){
        this.engine = engine;
    }

    @Override
    public String toString(){
        return engine;
    }
}

