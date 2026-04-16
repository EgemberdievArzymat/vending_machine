package model;

public class CoinAcceptor implements PaymentAcceptor {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public void addMoney() {
        amount += 10;
        System.out.println("Вы внесли 10 монет");
    }

    @Override
    public void deduct(int amount) {
        this.amount = amount;
    }
}
