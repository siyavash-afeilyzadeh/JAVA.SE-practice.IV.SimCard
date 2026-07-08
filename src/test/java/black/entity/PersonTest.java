package black.entity;

public class PersonTest {
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

        System.out.println(person1);
        System.out.println(person2);
    }
}
