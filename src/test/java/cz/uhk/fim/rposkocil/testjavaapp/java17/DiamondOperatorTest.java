package cz.uhk.fim.rposkocil.testjavaapp.java17;

import cz.uhk.fim.rposkocil.testjavaapp.Categories;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * DiamondOperatorTest
 */
public class DiamondOperatorTest {

    @Category(Categories.Java7Tests.class)
    @Test
    public void usingInnerClassTest() {

        DiamondOperator diamondOperator = new DiamondOperator();

        Assert.assertNotNull("Array list wasn't created!", diamondOperator.getLetters());
        Assert.assertNotNull("Hash set wasn't created!", diamondOperator.getNumbers());
    }
}
