package OOP_thirdsesh.OOP_secondsesh;

public class AutomaticGearBox extends GearBox {

    public AutomaticGearBox(int gears){
        this.gears = gears;
    }
    @Override
    protected void setGear(int gear){
        System.out.println("Manually changing gear to " + gear);
    }
}
