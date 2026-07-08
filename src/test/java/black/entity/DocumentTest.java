package black.entity;

import black.utils.Operator;
import black.utils.Status;

public class DocumentTest {
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
                .id(1)
                .name("Hoda")
                .family("Kal")
                .age(16)
                .build();

        SimCard simcard1 = SimCard
                .builder()
                .id(1)
                .number("234")
                .operator(Operator.MCI)
                .status(Status.Active)
                .build();

        SimCard simcard2 = SimCard
                .builder()
                .id(2)
                .number("156")
                .operator(Operator.Irancell)
                .status(Status.Active)
                .build();

        Document document1 = Document
                .builder()
                .id(1)
                .person(person1)
                .simCard(simcard1)
                .price(234.55F)
                .build();

        Document document2 = Document
                .builder()
                .id(2)
                .person(person2)
                .simCard(simcard2)
                .price(554.55F)
                .build();

        System.out.println(document1);
        System.out.println(document2);
    }
}
