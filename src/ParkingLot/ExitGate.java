package ParkingLot;

import CostComputation.CostCompute;
import CostComputation.CostComputeFactory;

public class ExitGate {

    Ticket ticket;
    ParkingSpotManager parkingSpotManager;
    //CostComputeFactory costComputeFactory;

    public ExitGate(Ticket ticket, ParkingSpotManager parkingSpotManager) {
        this.ticket = ticket;
        this.parkingSpotManager = parkingSpotManager;
        //this.costComputeFactory = new CostComputeFactory();
    }

    public int priceCalculate(){
        //CostCompute costCompute = costComputeFactory.findCostCompute(ticket);
        //return parkingSpotManager.spotBasePrice + costCompute.calculateCost();
        return parkingSpotManager.spotBasePrice;
    }

    public boolean startPayment(int fare){
        System.out.println("Fare " + fare + " paid.");
        return true;
    }

    public boolean removeVehicle(){
        return parkingSpotManager.freeParkingSpot(ticket.parkingSpot);
    }
}
