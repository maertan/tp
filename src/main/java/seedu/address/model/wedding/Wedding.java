package seedu.address.model.wedding;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.person.Person;

public class Wedding {
    private final String name;
    private final Set<Person> contacts = new HashSet<>();

    public Wedding(String name, Set<Person> contacts) {
        this.name = name;
        this.contacts.addAll(contacts);
    }
}
