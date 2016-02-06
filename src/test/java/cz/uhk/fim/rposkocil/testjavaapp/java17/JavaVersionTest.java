package cz.uhk.fim.rposkocil.testjavaapp.java17;

import cz.uhk.fim.rposkocil.testjavaapp.java11.InnerClazz;
import org.junit.Assert;
import org.junit.Test;

/**
 * JavaVersionTest
 */
public class JavaVersionTest {

    @Test
    public void usingInnerClassTest() {

        String javaVersion = System.getProperty("java.version").toString();
        System.out.println(javaVersion);

        Assert.assertTrue("Not build on JAVA 7!", javaVersion.contains("1.7."));
    }
}
