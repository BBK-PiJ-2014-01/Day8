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
        addPerson(new Person(1, "John"));
        addPerson(new Person(2, "Bob"));
        addPerson(new Person(3, "Basil"));

        servePerson();
        servePerson();
        servePerson();

        addPerson(new Person(2, "Pierre"));
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
