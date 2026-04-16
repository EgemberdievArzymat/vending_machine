package model;

import java.util.Scanner;

public class CardAcceptor implements PaymentAcceptor{

    private int amount;

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void addMoney() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер карты:");
        String card = sc.nextLine();

        System.out.println("Введите код подтверждения:");
        String code = sc.nextLine();


        amount += 100;
        System.out.println("Оплата прошла успешно (+100)");
    }

    @Override
    public void deduct(int amount) {
        this.amount -= amount;
    }
}
