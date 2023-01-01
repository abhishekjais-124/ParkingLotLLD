package CostComputation;


import ParkingLot.Ticket;
import ParkingLot.VehicleType;

public class CostComputeFactory {

    public CostCompute findCostCompute(Ticket ticket){
        if (ticket.getVehicle().getVehicleType() == VehicleType.TWOWHEELER){
            return new TwoWheelerCostCompute(ticket);
        }else if (ticket.getVehicle().getVehicleType() == VehicleType.FOURWHEELER){
            return new FourWheelerCostCompute(ticket);
        }
        return null;
    }
}
