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

    String operator;
    Double operand;

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

        Button[] buttons = {oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton,
                            sevenButton, eightButton, nineButton, zeroButton, dotButton};

        for(Button button : buttons) {
            final Button fButton = button;
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
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

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                executeOperation();
                operand = Double.parseDouble(digitDisplay.getText().toString());
                clearDisplay();
                operator = "+";
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                executeOperation();
                operand = Double.parseDouble(digitDisplay.getText().toString());
                clearDisplay();
                operator = "-";
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                executeOperation();
                operand = Double.parseDouble(digitDisplay.getText().toString());
                clearDisplay();
                operator = "*";
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                executeOperation();
                operand = Double.parseDouble(digitDisplay.getText().toString());
                clearDisplay();
                operator = "/";
            }
        });

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                executeOperation();
            }
        });

        acButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearOperation();
                clearDisplay();
            }
        });
    }

    private void executeOperation() {
        if (operator == null || operand == null) {
            return;
        }

        double base = Double.parseDouble(digitDisplay.getText().toString());
        double result = base;

        switch(operator) {
            case "+":
                result = base + operand;
                break;
            case "-":
                result = base - operand;
                break;
            case "*":
                result = base * operand;
                break;
            case "/":
                result = base / operand;
                break;
        }

        digitDisplay.setText(String.valueOf(result));
        clearOperation();
    }

    private void clearOperation() {
        operator = null;
        operand = null;
    }

    private void clearDisplay() {
        digitDisplay.setText("");
    }
}
