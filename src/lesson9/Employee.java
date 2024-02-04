package lesson9;

import java.util.Date;

public class Employee extends AbstractDocument {
    private Date finishDate;
    private String employeeName;

    public Employee(String documentNumber, Date date, Date finishDate, String employeeName) {
        super(documentNumber, date);
        this.finishDate = finishDate;
        this.employeeName = employeeName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Finish Date:" + finishDate);
        System.out.println("Name:" + employeeName);
    }

    @Override
    public Date getDate() {
        return null;
    }
}