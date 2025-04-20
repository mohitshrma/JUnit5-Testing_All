package net.testGuides.annotations;

import net.testGuides.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeEachDemoTest {

    private Calculator calculator;

    //AfterAll and @BeforeAll annotated method must be static.

//    @BeforeAll
//    static void setUpBeforeClass()
//    {
//        calculator = new Calculator();
//        System.out.println("Setup Before Class method is calling");
//    }

//    @BeforeEach
//    void setUp()
//    {
//        calculator = new Calculator();
//        System.out.println("Setup method calling..");
//    }

//    @AfterAll
//    static void tearDownAfterClass()
//    {
//        calculator = null;
//          System.out.println("TearDownAfterClass is calling");
//    }

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
