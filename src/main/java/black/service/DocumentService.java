package black.service;

import black.entity.Document;
import black.entity.Person;
import black.utils.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DocumentService {
    public static List<Document> documents = new ArrayList<>();

    public void saveDocument(Document document) {
        if (document.getPerson().getDocuments().size() < 2) {
            documents.add(document);
            document.getPerson().getDocuments().add(document);
            document.getSimCard().setStatus(Status.Active);
            document.setPurchaseDate(LocalDate.now());
            System.out.println("SimCard Successfully Sold!");
        } else {
            System.out.println("Not allowed over 10 SimCard!");
        }
    }

    public void printDocuments() {
        for (Document document : documents) {
            System.out.println(document);
        }
    }

}
