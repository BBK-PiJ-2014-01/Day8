/**
 * Created by PierreM on 17/11/2014.
 */
public class PersonQueueImpl3 implements PersonQueue {

    private Person head;

    public PersonQueueImpl3() {
        head = null;
    }

    public void insert(Person person) {
        Person pointer = null;
        Person previous = null;

        if (head == null) {
            head = person;
        } else {
            pointer = head;
            while ((pointer.getAge() >= person.getAge()) && (pointer.getNextPerson() != null)) {
                previous = pointer;
                pointer = pointer.getNextPerson();
            }
            if ((pointer == head) && (pointer.getAge() <= person.getAge())) {
                person.setNextPerson(head);
                head = person;
            } else {
                if ((pointer.getNextPerson() == null) && (pointer.getAge() >= person.getAge())) {
                    pointer.setNextPerson(person);
                } else {
                        previous.setNextPerson(person);
                        person.setNextPerson(pointer);
                }
            }
        }
    }

    public Person retrieve() {
        Person retrievedPerson = head;
        head = head.getNextPerson();
        return(retrievedPerson);
    }
}
