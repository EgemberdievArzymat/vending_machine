package model;

public interface PaymentAcceptor {
    int getAmount();
    void addMoney();
    void deduct(int amount);
}
