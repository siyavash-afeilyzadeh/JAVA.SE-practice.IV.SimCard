package black.service;

import black.entity.Person;

public class PersonServiceTest {
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

        PersonService personService = new PersonService();
        personService.savePerson(person1);
        personService.savePerson(person2);
        personService.printPersonList();
        personService.deletePerson(person1);
        personService.printPersonList();
        personService.savePerson(person1);
        personService.printPersonList();
    }
}
