package OOP_secondsesh;

public class ManualGearBox extends GearBox {

    public ManualGearBox(int gears){
        this.gears = gears;
    }
    @Override
    protected void setGear(int gear){
        System.out.println("Manually changing gear to " + gear);
    }
}
