package OOP_secondsesh;

public class Engine {

    //Acts the same as private, except for extended classes (like  ElectricEngine)
    protected String model;
    private String engine = "\"default\"";


    public Engine(String model){
        this.model = model;
    }
    public Engine(){
        this.engine = engine;
    }


    public void move(){
        System.out.println("\"Vroom vroom\"");
    }


    @Override
    public String toString(){
        return engine;
    }
}

