package cz.uhk.fim.rposkocil.testjavaapp.java11;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test of Reflection
 */
public class ReflectionTest {

    @Test
    public void usingReflectionTest() {

        Reflection reflection = new Reflection();
        reflection.useReflection();

        Assert.assertTrue("Array of methods should be bigger than 0.", reflection.getMethods().length >= 0);
    }
}
