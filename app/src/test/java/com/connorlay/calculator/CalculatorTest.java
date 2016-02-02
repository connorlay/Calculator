package com.connorlay.calculator;

import org.junit.Before;
import org.junit.Test;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
       calculator = new Calculator();
    }

    @Test
    public void testClickDigitButtons() {
        calculator.clickOneButton();
        calculator.clickTwoButton();
        calculator.clickThreeButton();
        calculator.clickFourButton();
        calculator.clickFiveButton();
        calculator.clickSixButton();
        calculator.clickSevenButton();
        calculator.clickEightButton();
        calculator.clickNineButton();
        calculator.clickZeroButton();

        assert(calculator.getDigitDisplay()).equals("1234567890");
    }

    @Test
    public void testClickDotButton() {
        calculator.clickDotButton();

        assert(calculator.getDigitDisplay()).equals(".");

        calculator.clickDotButton();

        assert(calculator.getDigitDisplay()).equals(".");
    }

    @Test
    public void testSwitchingOperations() {
        calculator.clickOneButton();
        calculator.clickAddButton();

        assert(calculator.getDigitDisplay()).equals("1");
        assert(calculator.getStoredOperation()).equals("+");

        calculator.clickSubtractButton();

        assert(calculator.getDigitDisplay()).equals("1");
        assert(calculator.getStoredOperation()).equals("-");

        calculator.clickMultiplyButton();

        assert(calculator.getDigitDisplay()).equals("1");
        assert(calculator.getStoredOperation()).equals("*");

        calculator.clickDivideButton();

        assert(calculator.getDigitDisplay()).equals("1");
        assert(calculator.getStoredOperation()).equals("/");

        calculator.clickAddButton();
        calculator.clickTwoButton();
        calculator.clickEqualsButton();

        assert(calculator.getDigitDisplay()).equals("3.0");
        assert(calculator.getStoredOperation()).equals("");
    }

    @Test
    public void testChainingOperations() {
        calculator.clickOneButton();
        calculator.clickAddButton();
        calculator.clickTwoButton();

        assert(calculator.getDigitDisplay()).equals("2");
        assert(calculator.getStoredOperation()).equals("+");

        calculator.clickAddButton();

        assert(calculator.getDigitDisplay()).equals("3.0");
        assert(calculator.getStoredOperation()).equals("+");

        calculator.clickFourButton();
        calculator.clickSubtractButton();

        assert(calculator.getDigitDisplay()).equals("7.0");
        assert(calculator.getStoredOperation()).equals("-");

        calculator.clickFiveButton();
        calculator.clickMultiplyButton();

        assert(calculator.getDigitDisplay()).equals("2.0");
        assert(calculator.getStoredOperation()).equals("*");
    }

    @Test
    public void testChainingExecutions() {
        calculator.clickOneButton();
        calculator.clickAddButton();
        calculator.clickTwoButton();
        calculator.clickEqualsButton();

        assert(calculator.getDigitDisplay()).equals("3.0");
        assert(calculator.getStoredOperation()).equals("");

        calculator.clickAddButton();
        calculator.clickOneButton();
        calculator.clickEqualsButton();

        assert(calculator.getDigitDisplay()).equals("4.0");
        assert(calculator.getStoredOperation()).equals("");

        calculator.clickOneButton();
        calculator.clickAddButton();
        calculator.clickFiveButton();
        calculator.clickEqualsButton();

        assert(calculator.getDigitDisplay()).equals("6.0");
        assert(calculator.getStoredOperation()).equals("");
    }
}