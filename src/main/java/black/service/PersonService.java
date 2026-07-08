package black.service;

import black.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public static List<Person> persons = new ArrayList<>();
    public void savePerson(Person person){
        persons.add(person);
        System.out.println("Person Successfully Registered!");
    }
    public void deletePerson(Person person){
        persons.remove(person);
        System.out.println("Person Successfully Deleted!");
    }

    public void printPersonList(){
        for(Person person : persons){
            System.out.println(person);
        }
    }
}
