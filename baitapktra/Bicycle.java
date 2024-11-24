package baitapktra;

public class Bicycle extends AbstractVehicle {
    //ko co thuoc tinh

    public Bicycle(String name, double baseMaintenanceCost) {
        super(name, baseMaintenanceCost);
    }

    @Override
    double calculatateFuelCost() {
        return 0; // chi phi nhien lieu
    }


    @Override
    public String gettype() {
        return "Bycicle";
    }

    @Override
    public double calculateMaintenanceCost() {
        return super.baseMaintenanceCost += 15;
    }                 //chi phi bao tri co ban

    @Override
    public void move(int distance){
        super.move(distance);
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Total maintenance cost: "+ calculateMaintenanceCost());
    }

    @Override
    public void refuel(double amount) {
        //
    }
}
