package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FibonacciTest {
    Fibonacci fib = null;
    @BeforeEach
    public void setUp(){
        fib = new Fibonacci();

    }
    @AfterEach
    public void tearDown(){
        fib = null;

    }

    @Test
    public void givenOneReturnOne()
    {

        assertEquals( 1,fib.fibonacci(1));
    }
    @Test
    public void givenZeroReturnOne()
    {

        assertEquals( 0,fib.fibonacci(0));
    }
    @Test
    public void givenANegativeIntegerReturnOne()
    {

        assertEquals( -1,fib.fibonacci(-8));
        assertNotEquals(34,fib.fibonacci(-9));
    }
}
