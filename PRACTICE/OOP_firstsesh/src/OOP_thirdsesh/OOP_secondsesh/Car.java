package OOP_thirdsesh.OOP_secondsesh;

public class Animal {
    private String name;
    private int age;

    private int numOfLegs;

    private String sound;
    
    private String color;



    // Construction has same name as class! = empty construction
    // " this. == whatever class object I've created, assign this to that.
    public Car(String name, int age, Engine engine, GearBox gearBox){
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
