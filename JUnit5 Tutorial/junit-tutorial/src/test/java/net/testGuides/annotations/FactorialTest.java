package net.testGuides.annotations;

import net.testGuides.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void factorialTest()
    {
        Factorial obj = new Factorial();
        int actualResult = obj.factorial(5);

        assertEquals(120, actualResult);


    }

}