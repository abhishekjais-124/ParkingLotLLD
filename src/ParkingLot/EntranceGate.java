package ParkingLot;

public class EntranceGate {
    ParkingSpotManager parkingSpotManager;
    Ticket ticket;

    public EntranceGate(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }

    public ParkingSpot findParkingSpace(){
        ParkingSpot parkingSpot = parkingSpotManager.findParkingSpot();
        if (parkingSpot == null){
            System.out.println("No parking space available now");
            return null;
        }
        return parkingSpot;
    }

    public Ticket generateTicket(long entryTime, Vehicle vehicle, ParkingSpot parkingSpot){
        return new Ticket(entryTime, vehicle, parkingSpot);
    }

    public boolean parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot){
        return parkingSpotManager.parkVehicle(vehicle, parkingSpot);
    }
}
