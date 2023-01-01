package CostComputation;

import ParkingLot.Ticket;

public class MinutePricingStrategy extends PricingStrategy{
    @Override
    public int price(Ticket ticket) {
        return 3;
    }
}
