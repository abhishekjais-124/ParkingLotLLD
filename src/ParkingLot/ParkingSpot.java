package ParkingLot;

public class ParkingSpot {
    int id;
    boolean isEmpty;
    Vehicle vehicle;

    public ParkingSpot(int id) {
        this.id = id;
        isEmpty = true;
    }
}
