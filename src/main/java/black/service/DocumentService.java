package black.service;

import black.entity.Document;
import black.entity.Person;
import black.entity.SimCard;

import black.utils.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DocumentService {
    public static List<Document> documents = new ArrayList<>();

    public void saveDocument(Document document) {
        if (document.getSimCard().getStatus() == Status.NotActive) {
            if (document.getPerson().getDocuments().size() < 10) {
                documents.add(document);
                document.getPerson().getDocuments().add(document);
                document.getSimCard().setStatus(Status.Active);
                document.setPurchaseDate(LocalDate.now());
                System.out.println("SimCard Successfully Sold!");
            } else {
                System.out.println("Not allowed over 10 SimCard!");
            }
        } else {
            System.out.println("SimCard is already Sold!");
        }
    }

    public void printDocuments() {
        for (Document document : documents) {
            System.out.println(document);
        }
    }

    public static SimCard findByPersonId(int id) {
        for (Document document : documents) {
            if (document.getSimCard().getStatus().equals(Status.Active)) {
                if (document.getPerson().getId() == id) {
                    System.out.println(document.getSimCard());
                }
            }
        }
        return null;

    }

    public static SimCard findByPersonName(String name) {
        for (Document document : documents) {
            if (document.getSimCard().getStatus().equals(Status.Active)) {
                if (document.getPerson().getName().equals(name)) {
                    System.out.println(document.getSimCard());
                }
            }
        }
        return null;
    }

    public static SimCard findByPersonFamily(String family) {
        for (Document document : documents) {
            if (document.getSimCard().getStatus().equals(Status.Active)) {
                if (document.getPerson().getFamily().equals(family)) {
                    System.out.println(document.getSimCard());
                }
            }
        }
        return null;
    }

    public static Person findBySimCardId(int id) {
        for (Document document : documents) {
            if(document.getSimCard().getStatus().equals(Status.Active)){
                if(document.getSimCard().getId() == id){
                    System.out.println(document.getPerson());
                }
            }
        }
        return null;
    }

    public static Person findBySimCardNumber(String number) {
        for (Document document : documents) {
            if(document.getSimCard().getStatus().equals(Status.Active)){
                if(document.getSimCard().getNumber().equals(number)){
                    System.out.println(document.getPerson());
                }
            }
        }
        return null;
    }
}





