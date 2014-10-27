package models;


import java.util.Date;

public class CreditCardPayment implements iPayment {
    public final String number;
    public final String ccv;
    public final String name;
    public final Date experation;
    
    public CreditCardPayment(String number, String ccv, Date experation, String name) {
        this.number = number;
        this.ccv = ccv;
        this.experation = experation;
        this.name = name;
    }

    @Override
    public String getPaymentType() {
        return "Credit Card";
    }

    @Override
    public boolean payFor(Price price) {
        if (experation.before(new Date()))
            return false;
        return CreditCardValidator.validate(this, price);
    }
}
