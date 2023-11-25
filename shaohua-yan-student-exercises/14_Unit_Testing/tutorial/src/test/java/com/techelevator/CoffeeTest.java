package com.techelevator;

import junit.framework.Assert;
import org.junit.Test;

public class CoffeeTest {
    @Test
    public void constructor_should_set_properties() {
        // arrange - testing constructor

        //Act - call the constructor by creating a new object
        Coffee coffee = new Coffee("Large", "Decaf", new String[]{"cream", "sugar"}, 2.99);

        // Assert - verify the properties are set appropriately
        Assert.assertEquals("Large", coffee.getSize());
        Assert.assertEquals("Decaf", coffee.getBlend());
        Assert.assertEquals(2.99, coffee.getPrice(), 0.00);
        Assert.assertEquals(2, coffee.getAdditions().length);
    }
}
