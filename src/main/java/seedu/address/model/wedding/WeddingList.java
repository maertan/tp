package seedu.address.model.wedding;

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;

import seedu.address.model.person.exceptions.DuplicatePersonException;

public class WeddingList {
    //TODO: Convert to ObservableList
    private final ArrayList<Wedding> weddings = new ArrayList<>();

    public void add(Wedding toAdd) {
        requireNonNull(toAdd);
        weddings.add(toAdd);
    }

}
