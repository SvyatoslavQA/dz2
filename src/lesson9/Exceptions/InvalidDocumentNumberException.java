package lesson9.Exceptions;

public class InvalidDocumentNumberException extends RuntimeException {
    public InvalidDocumentNumberException(String message) {
        super(message);
    }
}
