package cz.uhk.fim.rposkocil.testjavaapp.java18;

import cz.uhk.fim.rposkocil.testjavaapp.Categories;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static cz.uhk.fim.rposkocil.testjavaapp.java18.PersonBuilder.person;

/**
 * JavaVersionTest
 */
public class PersonBuilderTest {

    @Category(Categories.Java8Tests.class)
    @Test
    public void constructAPersonWithBuilder() {
        Person person = person().withGivenName("Josef")
                .withSureName("Novak")
                .withAddress("Address")
                .withGender("Male")
                .withAge(42)
                .build();

        Assert.assertEquals("Person is not called Josef!", "Josef", person.getGivenName());
        Assert.assertEquals("Person is not called Novak!", "Novak", person.getSureName());
        Assert.assertEquals("Not correct address!", "Address", person.getAddress());
        Assert.assertEquals("Not MALE!", "Male", person.getGender());
        Assert.assertEquals("Not 42 aged person!", 42, person.getAge());
    }
}
