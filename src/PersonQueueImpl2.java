/**
 * Created by PierreM on 17/11/2014.
 */
public class PersonQueueImpl2 implements PersonQueue {

    private Person head;
    private Person tail;

    public PersonQueueImpl2() {
        head = null;
        tail = null;
    }

    public void insert(Person person) {
        if (head == null) {
            head = person;
            tail = person;
        } else {
            tail.setNextPerson(person);
            tail = tail.getNextPerson();
        }
    }

    public Person retrieve() {
        Person retrievedPerson = head;
        head = head.getNextPerson();
        return(retrievedPerson);
    }
}
