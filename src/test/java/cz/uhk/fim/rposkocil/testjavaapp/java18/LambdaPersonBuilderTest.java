package cz.uhk.fim.rposkocil.testjavaapp.java18;

import cz.uhk.fim.rposkocil.testjavaapp.Categories;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * JavaVersionTest
 */
public class LambdaPersonBuilderTest {

    @Category(Categories.Java8Tests.class)
    @Test
    public void constructAPersonWithLambdaBuilder() {
        Person person =
                LambdaPersonBuilder.build(
                        p -> p.setGivenName("Josef"),
                        p -> p.setSureName("Novak"),
                        p -> p.setAddress("Address"),
                        p -> p.setGender("Male"),
                        p -> p.setAge(42)
                );

        Assert.assertEquals("Person is not called Josef!", "Josef", person.getGivenName());
        Assert.assertEquals("Person is not called Novak!", "Novak", person.getSureName());
        Assert.assertEquals("Not correct address!", "Address", person.getAddress());
        Assert.assertEquals("Not MALE!", "Male", person.getGender());
        Assert.assertEquals("Not 42 aged person!", 42, person.getAge());
    }
}
