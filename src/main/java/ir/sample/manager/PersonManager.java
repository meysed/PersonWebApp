package ir.sample.manager;

import ir.sample.entity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonManager {
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public  String getFullName(){
        return person.getFirstName() + " " + person.getLastName();
    }
}
