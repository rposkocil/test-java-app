package cz.uhk.fim.rposkocil.testjavaapp.java18;

import cz.uhk.fim.rposkocil.testjavaapp.Categories;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * JavaVersionTest
 */
public class JavaVersionTest {

    @Category(Categories.Java8Tests.class)
    @Test
    public void usingInnerClassTest() {

        String javaVersion = System.getProperty("java.version").toString();
        System.out.println(javaVersion);

        Assert.assertTrue("Not build on JAVA 8!", javaVersion.contains("1.8."));
    }
}
