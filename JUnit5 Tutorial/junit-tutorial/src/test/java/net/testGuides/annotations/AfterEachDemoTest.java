package net.testGuides.annotations;

import net.testGuides.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfterEachDemoTest {

    private Calculator calculator;
    @BeforeEach
    void setUp()
    {
        calculator = new Calculator();
        System.out.println("Setup method calling..");
    }

    @AfterEach
    void tearDown()
    {
        calculator = null;
        System.out.println("tearDown method calling");
    }

    @Test
    void addTest()
    {
        int addition = calculator.add(10, 20);

        assertEquals(30, addition);
        System.out.println("add test method calling..");
    }


    @Test
    void subtractTest()
    {
        int subtraction = calculator.subtract(10, 20);

        assertEquals(-10, subtraction);
        System.out.println("subtract test method calling..");
    }

}
