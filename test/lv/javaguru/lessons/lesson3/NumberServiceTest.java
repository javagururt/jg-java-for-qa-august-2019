package lv.javaguru.lessons.lesson3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    private NumberService victim;

    @Before
    public void setUp() {
        victim = new NumberService();
    }

    @Test
    public void shouldReturnFalseWhenNumberIsZero() {
        boolean result = victim.isPrimeNumber(0);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseWhenNumberIsOne() {
        boolean result = victim.isPrimeNumber(1);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnTrueWhenNumberIs199() {
        boolean result = victim.isPrimeNumber(199);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseWhenNumberIs500() {
        boolean result = victim.isPrimeNumber(500);
        assertEquals(false, result);
    }
}