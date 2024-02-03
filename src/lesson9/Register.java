package lesson9;

import lesson9.Exceptions.InvalidDocumentNumberException;
import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Document> documents;

    public Register() {
        this.documents = new ArrayList<>(10);
    }

    public void saveDocument(Document document) {
        try {
            if (document instanceof AbstractDocument) {
                AbstractDocument abstractDocument = (AbstractDocument) document;
                documents.add(abstractDocument);
                System.out.println("Document saved successfully.");
            } else {
                System.out.println("Unsupported document type.");
            }
        } catch (RuntimeException e) {
            System.out.println("Error saving document: " + e.getMessage());
        }
    }

    public void displayDocumentInfo(Document document) {
        document.displayInfo();
    }
}