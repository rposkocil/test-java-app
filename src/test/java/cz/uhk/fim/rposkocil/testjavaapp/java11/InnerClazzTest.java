package cz.uhk.fim.rposkocil.testjavaapp.java11;

import cz.uhk.fim.rposkocil.testjavaapp.Categories;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;

/**
 * JUnit test of InnerClazz
 */
public class InnerClazzTest {

    @Category({Categories.Java7Tests.class, Categories.Java8Tests.class})
    @Test
    public void usingInnerClassTest() {

        InnerClazz innerClass = new InnerClazz();
        innerClass.createGlass(100);
        innerClass.halfFilledGlass();

        Assert.assertEquals("Volume of glass is not 50 units.", 50, innerClass.getGlassVolume());
    }
}
