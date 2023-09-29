package lsp2.model;

public class OrderBonus implements Orderable{
    private int quantity;
    private int price;
    public OrderBonus(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return "OrderBonus{" +
                "quantity=" + quantity +
                ", price=" + price +
                '}' + "Это бонусный заказ - он бесплатный";
    }
}
