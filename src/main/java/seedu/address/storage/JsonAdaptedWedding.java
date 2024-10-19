package seedu.address.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.person.Person;
import seedu.address.model.wedding.Wedding;

public class JsonAdaptedWedding {
    public static final String MISSING_FIELD_MESSAGE_FORMAT = "Wedding's %s field is missing!";

    private final String name;
    private final List<JsonAdaptedPersonId> contacts = new ArrayList<>();

    /**
     * Constructs a {@code JsonAdaptedWedding} with the given wedding details.
     */
    @JsonCreator
    public JsonAdaptedWedding(@JsonProperty("name") String name,
                             @JsonProperty("contacts") List<JsonAdaptedPersonId> contacts) {
        this.name = name;
        if (contacts != null) {
            this.contacts.addAll(contacts);
        }
    }

    /**
     * Converts a given {@code Wedding} into this class for Jackson use.
     */
    public JsonAdaptedWedding(Wedding source) {
        name = source.getName();
        contacts.addAll(source.getContacts().stream()
                        .map(Person::getId)
                .map(JsonAdaptedPersonId::new)
                .collect(Collectors.toList()));
    }


    //TODO
    /**
     * Converts this Jackson-friendly adapted person object into the model's {@code Person} object.
     *
     * @throws IllegalValueException if there were any data constraints violated in the adapted person.
     */
    public Wedding toModelType() throws IllegalValueException {
        return null;
    }

}
