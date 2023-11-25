package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {
    private ShoppingCart cart;

    @Before
    public void createAndFillCart() {
        this.cart = new ShoppingCart(0.1);
        cart.add(new Book("Dynamics of Software Development", "Jim McCarthy", 10.00));
        cart.add(new Movie("Free Guy", "PG-13", 115, 20.00));
        cart.add(new Coffee("Jumbo", "Bold", new String[]{"cream"}, 10.00));
    }

    @Test
    public void subtotal_should_equal_sum_of_all_items() {
        // Arrange - Create a shopping cart with items

        //ShoppingCart cart = createAndFillCart();
        double subtotal = cart.getSubtotalPrice();
        Assert.assertEquals(40.00, subtotal, 0.00);
    }

    @Test
    public void tax_should_equal_tax_on_taxable_items() {
        // Arrange - the @Before method creates a cart
        // Act - gets the tax
        double tax = cart.getTax();
        Assert.assertEquals(3.00, tax, 0.00);
    }

    @Test
    public void total_should_equal_sum_of_items_plus_tax() {
        // Arrange - the @Before method creates a cart every test
        // Act - gets the total

        double total = cart.getTotalPrice();
        Assert.assertEquals(43.00, total, 0.00);
    }
}
