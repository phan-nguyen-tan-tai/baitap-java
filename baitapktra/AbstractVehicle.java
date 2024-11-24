package baitapktra;

public abstract class AbstractVehicle implements Vehicle {

    protected String name;
    protected double baseMaintenanceCost;
    protected int mileage;

    public AbstractVehicle(String name,double baseMaintenanceCost){
        this.name=name;
        this.baseMaintenanceCost=baseMaintenanceCost;
    }       //Chi phí bảo trì cơ bản.

    abstract double calculatateFuelCost();
                // chi phi nhien lieu

    @Override
    public void move(int distance) { //khoang cach
        mileage+=distance;
    }

    @Override
    public void displayInfo(){ //thong tin hien thi
        System.out.println("Name: "+name);
        System.out.println("type"+ gettype());
        System.out.println("Base maintenance cost: "+baseMaintenanceCost);
        System.out.println("mileage: "+mileage);
    }
}
