/**
 * Created by PierreM on 17/11/2014.
 */
public class Person {
    private int idNumber;
    private String name;
    private int age;
    private Person nextPerson;

    public Person(int idNumber, String name, int age) {
        this.idNumber = idNumber;
        this.name = name;
        this.age = age;
        this.nextPerson = null;
    }

    public void setNextPerson(Person person) {
        nextPerson = person;
    }

    public Person getNextPerson() {
        return(nextPerson);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return(age);
    }

    public String getName() {
        return(name);
    }

}
