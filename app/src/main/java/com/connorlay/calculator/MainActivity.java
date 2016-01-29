package com.connorlay.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton,
            eightButton, nineButton, zeroButton, dotButton, plusButton, minusButton, multiplyButton,
            divideButton, equalsButton, acButton;

    TextView digitDisplay;

    Double storedValue;
    String storedOperation;
    boolean resetOnNextClick, clearOnNextClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        digitDisplay = (TextView) findViewById(R.id.activity_main_digit_display);

        oneButton = (Button) findViewById(R.id.activity_main_one_button);
        twoButton = (Button) findViewById(R.id.activity_main_two_button);
        threeButton = (Button) findViewById(R.id.activity_main_three_button);
        fourButton = (Button) findViewById(R.id.activity_main_four_button);
        fiveButton = (Button) findViewById(R.id.activity_main_five_button);
        sixButton = (Button) findViewById(R.id.activity_main_six_button);
        sevenButton = (Button) findViewById(R.id.activity_main_seven_button);
        eightButton = (Button) findViewById(R.id.activity_main_eight_button);
        nineButton = (Button) findViewById(R.id.activity_main_nine_button);
        zeroButton = (Button) findViewById(R.id.activity_main_zero_button);
        dotButton = (Button) findViewById(R.id.activity_main_dot_button);

        final Button[] digitButtons = {oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton,
                sevenButton, eightButton, nineButton, zeroButton, dotButton};

        for (Button button : digitButtons) {
            final Button fButton = button;
            fButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (resetOnNextClick) {
                        resetCalculator();
                    }
                    if (clearOnNextClick) {
                        digitDisplay.setText("");
                        clearOnNextClick = false;
                    }
                    digitDisplay.setText(digitDisplay.getText() + fButton.getText().toString());
                }
            });
        }

        plusButton = (Button) findViewById(R.id.activity_main_plus_button);
        minusButton = (Button) findViewById(R.id.activity_main_minus_button);
        multiplyButton = (Button) findViewById(R.id.activity_main_multiply_button);
        divideButton = (Button) findViewById(R.id.activity_main_divide_button);
        equalsButton = (Button) findViewById(R.id.activity_main_equals_button);
        acButton = (Button) findViewById(R.id.activity_main_ac_button);

        Button[] operationButtons = {plusButton, minusButton, multiplyButton, divideButton};

        for(Button button : operationButtons) {
            final Button fButton = button;
            fButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (resetOnNextClick) {
                        resetCalculator();
                        return;
                    }
                    if (storedValue == null || storedOperation == null) {
                        storedValue = getDisplayValue();
                        storedOperation = fButton.getText().toString();
                        clearOnNextClick = true;
                        return;
                    }
                    executeStoredOperation();
                }
            });
        }

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storedValue == null || storedOperation == null) {
                    return;
                }
                executeStoredOperation();
            }
        });

        acButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
            }
        });
    }

    private void executeStoredOperation() {
        double result;
        switch(storedOperation) {
            case("+"):
                result = storedValue + getDisplayValue();
                break;
            case("-"):
                result = storedValue - getDisplayValue();
                break;
            case("*"):
                result = storedValue * getDisplayValue();
                break;
            case("/"):
                result = storedValue / getDisplayValue();
                break;
            default:
                result = getDisplayValue();
        }
        digitDisplay.setText(String.valueOf(result));
        resetOnNextClick = true;
    }

    private void resetCalculator() {
        resetOnNextClick = false;
        storedValue = null;
        storedOperation = null;
        digitDisplay.setText("");
    }

    private double getDisplayValue() {
        return Double.parseDouble(digitDisplay.getText().toString());
    }
}
