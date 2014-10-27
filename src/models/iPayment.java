package models;

public interface iPayment {
    public String getPaymentType();
    public boolean payFor(Price price);
}
