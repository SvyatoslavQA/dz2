package lesson9;

import java.util.Date;

import lesson9.Exceptions.InvalidDocumentNumberException;

public abstract class AbstractDocument implements Document {
    public String documentNumber;
    public Date date;

    public AbstractDocument(String documentNumber, Date date) throws InvalidDocumentNumberException {
        if (!containsSequenceAbc(documentNumber)) {
            throw new InvalidDocumentNumberException("Document contains 'abc'");
        }
        if (!startsWithSequence555(documentNumber)) {
            throw new InvalidDocumentNumberException("Document start '555'");
        }
        if (!endsWithSequence1a2b(documentNumber)) {
            throw new InvalidDocumentNumberException("Document end with '1a2b'");
        }
        this.documentNumber = documentNumber;
        this.date = date;
    }

    private boolean containsSequenceAbc(String documentNumber) {
        return documentNumber.contains("abc");
    }

    private boolean startsWithSequence555(String documentNumber) {
        return documentNumber.startsWith("555");
    }

    private boolean endsWithSequence1a2b(String documentNumber) {
        return documentNumber.endsWith("1a2b");
    }
}