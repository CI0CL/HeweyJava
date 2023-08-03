package OOP_secondsesh;

public class Car {
    private Engine engine;
    private GearBox gearBox;
    private String color = "default white";
    private String model;


    public Car(String model){
        this.model = model;
    }

    // Construction has same name as class! = empty construction
    // " this. == whatever class object I've created, assign this to that.
    public Car(String brand, String color, Engine engine, GearBox gearBox){
        this.model = brand;
        this.color = color;
        this.engine = engine;
        this.gearBox = gearBox;
    }

    public void start(){
        if (engine!= null) {

            gearBox.changeGear(0);
            gearBox.changeGear(1);
            gearBox.changeGear(2);

            System.out.print("My " + model + " does ");
            engine.move();


        } else {
            System.out.println("Uhm, no engine, no Vroom Vroom.");
        }
    }

    @Override
    public String toString() {
        return "Car model = " + model + "\nwith colour = " + color + "\nand engine type = " + engine;
    }
}
