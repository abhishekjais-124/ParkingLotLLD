import ParkingLot.*;

public class Main {
    public static void main(String[] args) {

        ParkingSpotManager parkingSpotManager = new ParkingSpotManager(10);
        ParkingSpot parkingSpot = new ParkingSpot(1);
        parkingSpotManager.addParkingSpot(parkingSpot);

        Vehicle vehicle = new Vehicle("12eAB4", VehicleType.TWOWHEELER);

        EntranceGate entranceGate = new EntranceGate(parkingSpotManager);
        Ticket ticket = entranceGate.generateTicket(12L, vehicle, parkingSpot);
        ParkingSpot foundParkingSpot = entranceGate.findParkingSpace();
        entranceGate.parkVehicle(vehicle, foundParkingSpot);

        System.out.println("Parking done");

        ExitGate exitGate = new ExitGate(ticket, parkingSpotManager);
        int fare = exitGate.priceCalculate();
        exitGate.startPayment(fare);
        exitGate.removeVehicle();

        System.out.println("Vehicle removed successfully.");

    }
}