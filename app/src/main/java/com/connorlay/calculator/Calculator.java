package com.connorlay.calculator;

/**
 * Created by connorlay on 1/30/16.
 */
public class Calculator {

    String digitDisplay;
    Character storedOperation;
    Double storedValue;

    boolean waitingForUserInput;

    public Calculator() {
        digitDisplay = "0.0";
        waitingForUserInput = true;
    }

    public String getDigitDisplay() {
        return digitDisplay;
    }

    public String getStoredOperation() {
        if (storedOperation == null) {
            return "";
        }
        return String.valueOf(storedOperation);
    }

    public void clickZeroButton() {
        appendToDigitDisplay('0');
    }

    public void clickOneButton() {
        appendToDigitDisplay('1');
    }

    public void clickTwoButton() {
        appendToDigitDisplay('2');
    }

    public void clickThreeButton() {
        appendToDigitDisplay('3');
    }

    public void clickFourButton() {
        appendToDigitDisplay('4');
    }

    public void clickFiveButton() {
        appendToDigitDisplay('5');
    }

    public void clickSixButton() {
        appendToDigitDisplay('6');
    }

    public void clickSevenButton() {
        appendToDigitDisplay('7');
    }

    public void clickEightButton() {
        appendToDigitDisplay('8');
    }

    public void clickNineButton() {
        appendToDigitDisplay('9');
    }

    public void clickDotButton() {
        if(digitDisplay.contains(".")) {
            return;
        }
        appendToDigitDisplay('.');
    }

    public void clickAddButton() {
        handleOpButton('+');
    }

    public void clickSubtractButton() {
        handleOpButton('-');
    }

    public void clickMultiplyButton() {
        handleOpButton('*');
    }

    public void clickDivideButton() {
        handleOpButton('/');
    }

    public void clickEqualsButton() {
        if(digitDisplay.equals("") || storedOperation == null) {
            return;
        }
        executeOperation();
        waitingForUserInput = true;
    }

    public void clickACButton() {
        clearDigitDisplay();
        storedValue = null;
        storedOperation = null;
    }

    private void handleOpButton(char op) {
        if (digitDisplay.equals("")) {
            return;
        }
        if (waitingForUserInput) {
            storedOperation = op;
            return;
        }
        clickEqualsButton();
        storedOperation = op;
        storeCurrentValue();
        waitingForUserInput = true;
    }

    private void appendToDigitDisplay(char digit) {
        if(waitingForUserInput) {
            clearDigitDisplay();
        }
        digitDisplay += digit;
    }

    private void storeCurrentValue() {
        storedValue = Double.parseDouble(digitDisplay);
    }

    private void executeOperation() {
        double currentValue = Double.parseDouble(digitDisplay);
        double finalValue;

        switch(storedOperation) {
            case '+':
                finalValue = storedValue + currentValue;
                break;
            case '-':
                finalValue = storedValue - currentValue;
                break;
            case '*':
                finalValue = storedValue * currentValue;
                break;
            case '/':
                finalValue = storedValue / currentValue;
                break;
            default:
                finalValue = currentValue;
        }

        digitDisplay = String.valueOf(finalValue);
        storedOperation = null;
    }

    private void clearDigitDisplay() {
        waitingForUserInput = false;
        digitDisplay = "";
    }
}
