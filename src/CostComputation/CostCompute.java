package CostComputation;

import ParkingLot.Ticket;

public class CostCompute {

    PricingStrategy pricingStrategy;
    Ticket ticket;

    public CostCompute(Ticket ticket,PricingStrategy pricingStrategy) {
        this.ticket = ticket;
        this.pricingStrategy = pricingStrategy;
    }

    public int calculateCost(){
        System.out.println("calculating price");
        return pricingStrategy.price(ticket);
    }
}
