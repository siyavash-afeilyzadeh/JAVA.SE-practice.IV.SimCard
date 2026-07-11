package black.service;

import black.entity.Document;
import black.entity.Person;
import black.entity.SimCard;
import black.utils.Operator;


public class DocumentServiceTest {
    public static void main(String[] args) {
        Person person1 = Person
                .builder()
                .id(1)
                .name("Sia")
                .family("Afil")
                .age(32)
                .build();

        Person person2 = Person
                .builder()
                .id(2)
                .name("Hoda")
                .family("Kal")
                .age(16)
                .build();

        SimCard simcard1 = SimCard
                .builder()
                .id(1)
                .number("234")
                .operator(Operator.MCI)
                .build();

        SimCard simcard2 = SimCard
                .builder()
                .id(2)
                .number("156")
                .operator(Operator.Irancell)
                .build();

        SimCard simcard3 = SimCard
                .builder()
                .id(3)
                .number("754")
                .operator(Operator.Rightel)
                .build();

        System.out.println(person1);
        System.out.println(simcard1);
        System.out.println(simcard2);
        System.out.println(simcard3);

        Document document1 = Document
                .builder()
                .id(1)
                .person(person1)
                .simCard(simcard1)
                .price(231.21)
                .build();

        Document document2 = Document
                .builder()
                .id(2)
                .person(person1)
                .simCard(simcard2)
                .price(234.21)
                .build();

        Document document3 = Document
                .builder()
                .id(3)
                .person(person2)
                .simCard(simcard1)
                .price(254.21)
                .build();



        System.out.println(document1);
        System.out.println(document2);
        System.out.println(document3);
        System.out.println("*".repeat(20));

        DocumentService documentService = new DocumentService();
        documentService.saveDocument(document1);
        documentService.saveDocument(document2);
//        documentService.saveDocument(document3);
        System.out.println("*".repeat(20));
//
//        System.out.println(person1);
//        System.out.println("*".repeat(20));
//        System.out.println(document1);
//        System.out.println(document2);
//        System.out.println(document3);
        DocumentService.findByPersonId(1);
        System.out.println("*".repeat(10));
        DocumentService.findByPersonName("Sia");
        System.out.println("*".repeat(10));
        DocumentService.findByPersonFamily("Afil");
        System.out.println("*".repeat(20));
        DocumentService.findBySimCardId(1);
        System.out.println("*".repeat(10));
        DocumentService.findBySimCardNumber("156");

    }
}