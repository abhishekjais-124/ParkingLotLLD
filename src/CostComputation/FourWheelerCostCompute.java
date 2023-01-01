package CostComputation;

import ParkingLot.Ticket;

public class FourWheelerCostCompute extends CostCompute{
    public FourWheelerCostCompute(Ticket ticket) {
        super(ticket, new HourlyPricingStrategy());
    }
}
