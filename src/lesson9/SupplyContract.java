package lesson9;

import java.util.Date;

public class SupplyContract extends AbstractDocument {
    private String goodsType;
    private int quantity;

    public SupplyContract(String documentNumber, Date date, String goodsType, int quantity) {
        super(documentNumber, date);
        this.goodsType = goodsType;
        this.quantity = quantity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Goods type:" + goodsType);
        System.out.println("Quantity:" + quantity);
    }

    @Override
    public Date getDate() {
        return null;
    }
}