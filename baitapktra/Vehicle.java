package baitapktra;

public interface Vehicle {

    String gettype();

    double calculateMaintenanceCost();

    void displayInfo();

    void move(int distance);

    void refuel(double amount);

}
