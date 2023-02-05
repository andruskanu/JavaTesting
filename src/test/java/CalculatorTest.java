import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void addTest() {
        //given
        Calculator calculator = new Calculator();
        double firstNumber = 7;
        double secondNumber = 3;
        Double expectedResult = 10d;
        Double unexpectedResult = 15d;
        //when
        Double actualResult = calculator.add(firstNumber, secondNumber);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotNull(actualResult);
        assertNotEquals(unexpectedResult, actualResult, "the results supposed to be different");
    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator();
        double firstNumber = 5;
        double secondNumber = 4;
        Double expectedResult = 1d;

        Double actualResult = calculator.subtract(firstNumber, secondNumber);

        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult);
        assertNotEquals(2d, actualResult);
    }

    @Test
    public void subtractWithSecondParameterHavingANegativeValueTest() {
        Calculator calculator = new Calculator();
        double firstNumber = 10;
        double secondNumber = -6;
        Double expectedResult = null;

        Double actualResult = calculator.subtract(firstNumber, secondNumber);

        assertNull(actualResult);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        double firstNumber = 3;
        double secondNumber = 2;
        Double expectedResult = 6d;

        Double actualResult = calculator.multiply(firstNumber, secondNumber);

        assertEquals(expectedResult, actualResult);
        assertNotNull(actualResult);
        assertNotEquals(5d, actualResult);
    }

    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        double firstNumber = 9;
        double secondNumber = 3;
        Double expectedResult = 3d;

        Double actualResult = calculator.divide(firstNumber, secondNumber);

        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult);
        assertNotEquals(4d, actualResult);
    }

    @Test
    public void reverseSignTest(){
        Calculator calculator = new Calculator();
        double singleNumber = 7;
        Double expectedResult = -7d;

        Double actualResult = calculator.reverseSign(singleNumber);

        assertEquals(expectedResult, actualResult);
        assertNotEquals(7d,actualResult);
    }
}


