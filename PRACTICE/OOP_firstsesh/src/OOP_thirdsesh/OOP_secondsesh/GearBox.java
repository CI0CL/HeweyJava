package OOP_thirdsesh.OOP_secondsesh;

public abstract class GearBox {
    protected int gears;
    protected int currentGear;

    public final void changeGear(int gear) {

        if (gear <= gears) {
            currentGear = gear;
            System.out.println("Your gear changer to " + gear);
        } else {
            System.out.println("You either turned off your vroom vroom.");
        }
    }

    protected abstract void setGear(int gear);


    @Override
    public String toString() {
        return "Basic Gear Box";
    }
}




