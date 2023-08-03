package OOP_thirdsesh.OOP_secondsesh;

// "extends" extends from another class, aka is a 'child' of another class
public class ElectricEngine extends Engine {

    public ElectricEngine(String model){
        super(model);
        // applies all from Engine class?
    }

    @Override
    public void move() {
        System.out.println("\"Zoom zoom.\"");

    }

    @Override
    public String toString(){
        return "electric engine with model " + model;

    }
}
