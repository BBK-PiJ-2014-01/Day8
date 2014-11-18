/**
 * Created by PierreM on 17/11/2014.
 */
public class UnfairQueue {

    private PersonQueue queue;

    public static void main(String[] args) {
        UnfairQueue uq = new UnfairQueue();
        uq.run();
    }

    public void run() {
        queue = new PersonQueueImpl3();
        addPerson(new Person(1, "John", 32));
        addPerson(new Person(2, "Bob", 69));
        addPerson(new Person(3, "Basil", 18));
        addPerson(new Person(3, "Pierre", 24));
        addPerson(new Person(3, "Jess", 75));
        addPerson(new Person(3, "Sarah", 27));
        addPerson(new Person(3, "Billy", 52));
        addPerson(new Person(3, "Tara", 76));
        addPerson(new Person(3, "Luda", 37));
        addPerson(new Person(3, "Bill", 18));


        servePerson();
        servePerson();
        servePerson();
        servePerson();
        servePerson();
        servePerson();
        servePerson();
        servePerson();
        servePerson();
        servePerson();

    }

    public void addPerson(Person person) {
        System.out.println("New person in the Queue: "+person.getName());
        queue.insert(person);
    }

    public void servePerson() {
        Person retrievedPerson = queue.retrieve();
        System.out.println("Serving: "+retrievedPerson.getName()+" age: "+retrievedPerson.getAge());
    }

}
