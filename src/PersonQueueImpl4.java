/**
 * Created by PierreM on 18/11/2014.
 */
public class PersonQueueImpl4 implements PersonQueue {
    private Person head;

    public PersonQueueImpl4() {
        head = null;
    }

    public void insert(Person person) {
        if (head == null) {
            head = person;
        } else {
            Person pointer = head;
            while (pointer.getNextPerson() != null) {
                pointer = pointer.getNextPerson();
            }
            pointer.setNextPerson(person);
        }
    }

    public Person retrieve() {
        Person pointer = head;
        Person previous = null;
        Person retrievedPerson = null;

        boolean found = false;
        while ((pointer != null) && (!found)) {
            if (pointer.getAge() < 65) {
                previous = pointer;
                pointer = pointer.getNextPerson();
            }
            else
                found = true;
        }
        if (found) {
            retrievedPerson = pointer;
            previous.setNextPerson(pointer.getNextPerson());
            return (retrievedPerson);
        } else {
            retrievedPerson = head;
            head = head.getNextPerson();
            return(retrievedPerson);
        }
    }
}
