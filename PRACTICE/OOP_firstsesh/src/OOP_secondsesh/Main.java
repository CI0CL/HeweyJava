package OOP_secondsesh;

// psvm
public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine("model");
        ElectricEngine electricEngine = new ElectricEngine("AAA");
        GearBox manual = new ManualGearBox(6);
        GearBox notManual = new AutomaticGearBox(6);

        Car fiat = new Car("Fiat");
        Car bwm = new Car("BWM", "black", engine, manual);
        Car mercedes = new Car("Mercedes", "yellow", engine, notManual);
        Car ford = new Car("Ford", "black", engine, manual);
        Car tesla = new Car("Tesla", "silver", electricEngine, manual);
        Car audi = new Car("Audi", "white", electricEngine, manual);

        //System.out.println(ford);
        //System.out.println(audi);

        ford.start();
        mercedes.start();
        fiat.start();
        tesla.start();
        audi.start();



    }
}
