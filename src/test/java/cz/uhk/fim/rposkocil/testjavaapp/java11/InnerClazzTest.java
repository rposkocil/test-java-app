package cz.uhk.fim.rposkocil.testjavaapp.java11;

import org.junit.Test;
import org.junit.Assert;

/**
 * JUnit test of InnerClazz
 */
public class InnerClazzTest {

    @Test
    public void usingInnerClassTest() {

        InnerClazz innerClass = new InnerClazz();
        innerClass.createGlass(100);
        innerClass.halfFilledGlass();

        Assert.assertEquals("Volume of glass is not 50 units.", 50, innerClass.getGlassVolume());
    }
}
