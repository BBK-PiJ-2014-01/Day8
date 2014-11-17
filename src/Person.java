/**
 * Created by PierreM on 17/11/2014.
 */
public class Person {
    private int idNumber;
    private String name;
    private Person nextPerson;

    public Person(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
        this.nextPerson = null;
    }

    public void setNextPerson(Person person) {
        nextPerson = person;
    }

    public Person getNextPerson() {
        return(nextPerson);
    }

    public String getName() {
        return(name);
    }

}
