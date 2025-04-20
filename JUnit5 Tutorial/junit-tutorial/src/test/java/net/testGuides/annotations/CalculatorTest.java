package net.testGuides.annotations;

import net.testGuides.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Calculator Operations Test")
public class CalculatorTest {

    @DisplayName("Test Addition of two numbers")
    @Test
    void addTest()
    {
        Calculator calculator = new Calculator();
        int addition = calculator.add(10, 20);

        assertEquals(30, addition);
    }

    @DisplayName("Test subtraction of two numbers")
    @Test
    void subtractTest()
    {
        Calculator calculator = new Calculator();
        int subtraction = calculator.subtract(10, 20);

        assertEquals(-10, subtraction);
    }
}
