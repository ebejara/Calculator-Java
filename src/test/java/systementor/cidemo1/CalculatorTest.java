package systementor.cidemo1;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    private static final Logger logger = Logger.getLogger(CalculatorTest.class.getName());

    private final int a = 1;
    private final int b = 2;



    private final int divideA = 4;
    private final int divideB = 2;


    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }


    @Test
    @SuppressWarnings("unused")
    void divideWithLogging() {
         
      
         logger.info("divide " + divideA + " with " + divideB);

        if (divideB == 0){
            logger.severe("divide by zero!!");
            throw new IllegalArgumentException("divide by zero");
        }

        int result = calculator.divide(divideA,divideB);
         assertEquals(2,result);

    }




    @Test
    void addShouldReturn4() {
        int result = calculator.add(a,b);
        assertEquals(3,result);
          logger.fine("Simple addition - this should work");
         
    }

    @Test
    void subtractShouldReturnNegative1() {
        int result = calculator.subtract(a,b);
        assertEquals(-1,result);
    }

    @Test
    void multiplyShouldReturn2() {
        int result = calculator.multiply(a,b);
        assertEquals(2,result);
    }


    @Test
    void divideShouldReturn0() {
        int result = calculator.divide(a,b);
        assertEquals(0,result);
    }


    @Test
    void divideByZeroThrowsError(){
        logger.fine("Zero divison Exception is expected here!");
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5,0));
    }



}