package com.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @Before
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testNumber() {
        int number = 1;
        String playReturn = fizzBuzz.play(number);
        Assert.assertEquals("1", playReturn);
    }

    @Test
    public void testFizz() {
        int number = 3;
        String playReturn = fizzBuzz.play(number);
        Assert.assertEquals("Fizz", playReturn);
    }

    @Test
    public void testFizzDivisibleBy3() {
        int number = 6;
        String playReturn = fizzBuzz.play(number);
        Assert.assertEquals("Fizz", playReturn);
    }

    @Test
    public void testBuzzDivisibleBy5() {
        int number = 10;
        String playReturn = fizzBuzz.play(number);
        Assert.assertEquals("Buzz", playReturn);
    }
}
