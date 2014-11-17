/**
 * Created by PierreM on 17/11/2014.
 */
public class Supermarket implements PersonQueue {
    private Person head;

    public Supermarket() {
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

    public void addPerson(Person person) {
        System.out.println("New person in the Queue: "+person.getName());
        insert(person);
    }

    public void servePerson() {
        System.out.println("Serving: "+retrieve().getName());
    }

    public static void main(String[] args) {
        Supermarket s = new Supermarket();
        s.run();
    }

    public void run() {
        Person p = new Person(1, "John");
        addPerson(p);
        p = new Person(2, "Bob");
        addPerson(p);
        p = new Person(3, "Basil");
        addPerson(p);

        servePerson();
        servePerson();
        servePerson();
    }

}
