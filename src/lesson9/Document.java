package lesson9;

import java.util.Date;

public interface Document {
    default void displayInfo() {
    }

    Date getDate();
}