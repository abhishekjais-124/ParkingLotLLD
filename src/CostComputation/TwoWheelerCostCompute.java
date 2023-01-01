package CostComputation;

import ParkingLot.Ticket;

public class TwoWheelerCostCompute extends CostCompute{
    public TwoWheelerCostCompute(Ticket ticket) {
        super(ticket, new MinutePricingStrategy());
    }
}
