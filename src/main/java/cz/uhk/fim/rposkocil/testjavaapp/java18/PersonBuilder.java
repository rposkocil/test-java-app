package cz.uhk.fim.rposkocil.testjavaapp.java18;

/**
 * PersonBuilder Class
 */
public class PersonBuilder {

    private final Person person;

    private PersonBuilder() {
        this.person = new Person();
    }

    public static PersonBuilder person() {
        return new PersonBuilder();
    }

    public PersonBuilder withGivenName(final String givenName) {
        this.person.setGivenName(givenName);
        return this;
    }

    public PersonBuilder withSureName(final String sureName) {
        this.person.setSureName(sureName);
        return this;
    }

    public PersonBuilder withGender(final String gender) {
        this.person.setGender(gender);
        return this;
    }

    public PersonBuilder withAddress(final String address) {
        this.person.setAddress(address);
        return this;
    }

    public PersonBuilder withAge(final int age) {
        this.person.setAge(age);
        return this;
    }

    public Person build() {
        return this.person;
    }
}
