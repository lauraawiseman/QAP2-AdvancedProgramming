public class Person {
    // Attributes
    private String lastName;
    private String firstName;
    private Address home;

    // Constructors
public Person(String firstName, String lastName, Address home)
{
    this.firstName = firstName;
    this.lastName = lastName;
    this.home = home;
}

// Methods
public String toString() {
    return (this.firstName + " " + this.lastName + this.home);
}
}
