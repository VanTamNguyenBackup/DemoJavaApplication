package com.tamco.javademo;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {

    @Test
    public void testAdd1() {
        Assert.assertEquals(9, new Addition().add(4, 5));
    }
}
