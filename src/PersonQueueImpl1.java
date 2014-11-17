/**
 * Created by PierreM on 17/11/2014.
 */
public class PersonQueueImpl1 implements PersonQueue {

    private Person head;

    public PersonQueueImpl1() {
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
        Person retrievedPerson = head;
        head = head.getNextPerson();
        return(retrievedPerson);
    }
}
