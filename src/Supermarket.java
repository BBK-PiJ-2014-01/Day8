/**
 * Created by PierreM on 17/11/2014.
 */
public class Supermarket {

    private PersonQueue queue;

    public static void main(String[] args) {
        Supermarket s = new Supermarket();
        s.run();
    }

    public void run() {
        queue = new PersonQueueImpl2();
        addPerson(new Person(1, "John", 32));
        addPerson(new Person(2, "Bob", 64));
        addPerson(new Person(3, "Basil", 12));
        addPerson(new Person(3, "Pierre", 24));
        addPerson(new Person(3, "Jess", 75));
        addPerson(new Person(3, "Sarah", 27));
        addPerson(new Person(3, "Billy", 52));

        servePerson();
        servePerson();
        servePerson();
    }

    public void addPerson(Person person) {
        System.out.println("New person in the Queue: "+person.getName());
        queue.insert(person);
    }

    public void servePerson() {
        System.out.println("Serving: "+queue.retrieve().getName());
    }

}
