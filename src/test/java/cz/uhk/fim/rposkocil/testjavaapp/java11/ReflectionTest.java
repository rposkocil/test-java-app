package cz.uhk.fim.rposkocil.testjavaapp.java11;

import cz.uhk.fim.rposkocil.testjavaapp.Categories;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * JUnit test of Reflection
 */
public class ReflectionTest {

    @Category({Categories.Java7Tests.class, Categories.Java8Tests.class})
    @Test
    public void usingReflectionTest() {

        Reflection reflection = new Reflection();
        reflection.useReflection();

        Assert.assertTrue("Array of methods should be bigger than 0.", reflection.getMethods().length >= 0);
    }
}
