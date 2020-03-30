package com.company.list;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    @Test
    public void nameTest() {
        Bird bird = new Crow("Sally");
        Assert.assertEquals("Wrong name", "Sally", bird.getName());
    }
}
