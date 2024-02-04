package lesson9;

import java.util.Date;

public class FinanceReport extends AbstractDocument {
    private double sum;
    private String departmentCode;

    public FinanceReport(String documentNumber, Date date, double sum, String departmentCode) {
        super(documentNumber, date);
        this.sum = sum;
        this.departmentCode = departmentCode;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("sum:" + sum);
        System.out.println("Department Code:" + departmentCode);
    }

    @Override
    public Date getDate() {
        return null;
    }
}