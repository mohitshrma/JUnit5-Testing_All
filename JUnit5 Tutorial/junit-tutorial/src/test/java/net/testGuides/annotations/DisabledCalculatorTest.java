package net.testGuides.annotations;

import net.testGuides.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Disable Calculations Operations Test")
public class DisabledCalculatorTest {

    @Disabled("Disabled until a bug is fixed")
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
