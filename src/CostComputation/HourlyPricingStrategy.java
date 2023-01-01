package CostComputation;

import ParkingLot.Ticket;

public class HourlyPricingStrategy extends PricingStrategy{
    @Override
    public int price(Ticket ticket) {
        return 5;
    }
}
