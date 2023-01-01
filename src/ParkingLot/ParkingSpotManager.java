package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {

    List<ParkingSpot> parkingSpots;
    int spotBasePrice;

    public ParkingSpotManager(int spotBasePrice) {
        this.spotBasePrice = spotBasePrice;
        parkingSpots = new ArrayList<>();
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
    }

    public ParkingSpot findParkingSpot(){
        for(ParkingSpot parkingSpot: parkingSpots){
            if (parkingSpot.isEmpty == true){
                return parkingSpot;
            }
        }
        return null;
    }

    public boolean parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot){
        if (vehicle == null || parkingSpot == null || parkingSpot.isEmpty == false) return false;
        parkingSpot.vehicle = vehicle;
        parkingSpot.isEmpty = false;
        return true;
    }

    public boolean freeParkingSpot(ParkingSpot parkingSpot){
        if (parkingSpot == null) return false;
        parkingSpot.vehicle = null;
        parkingSpot.isEmpty = true;
        return true;
    }
}
