package cz.uhk.fim.rposkocil.testjavaapp.java17;

import cz.uhk.fim.rposkocil.testjavaapp.Categories;
import cz.uhk.fim.rposkocil.testjavaapp.java11.InnerClazz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * JavaVersionTest
 */
public class JavaVersionTest {

    @Category(Categories.Java7Tests.class)
    @Test
    public void usingInnerClassTest() {

        String javaVersion = System.getProperty("java.version").toString();
        System.out.println(javaVersion);

        Assert.assertTrue("Not build on JAVA 7!", javaVersion.contains("1.7."));
    }
}
