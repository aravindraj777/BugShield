package calculator;

import org.buildlive.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void testAdd(){

        int result = calculator.add(6,3);
        Assertions.assertEquals(9,result);
    }

    @Test
    void testSubtract(){

        int result = calculator.subtract(20,5);
        Assertions.assertEquals(15,result);
    }
}
