package fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzz() {
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
    }

    @Test
    void fizz() {
        assertEquals("Fizz",FizzBuzz.fizzBuzz(27));
    }

    @Test
    void buzz() {
        assertEquals("Buzz",FizzBuzz.fizzBuzz(45));
    }

    @Test
    void notFizzBuzz() {
        assertEquals("4",FizzBuzz.fizzBuzz(4));
    }


}
