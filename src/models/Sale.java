package models;


public class Sale {
    public final Gold gold;
    public final iPayment payment;
    
    public Sale(Gold gold, iPayment payment) {
        this.gold = gold;
        this.payment = payment;
    }
    
    public boolean makeSale() {
        return payment.payFor(gold.getPrice());
    }
    
    public void recordSale() {
        //TODO: Implement recipt and logging.
    }
}
