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

    TextView digitDisplay, opDisplay;

    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();

        digitDisplay = (TextView) findViewById(R.id.activity_main_digit_display);
        opDisplay = (TextView) findViewById(R.id.activity_main_op_display);

        zeroButton = (Button) findViewById(R.id.activity_main_zero_button);
        oneButton = (Button) findViewById(R.id.activity_main_one_button);
        twoButton = (Button) findViewById(R.id.activity_main_two_button);
        threeButton = (Button) findViewById(R.id.activity_main_three_button);
        fourButton = (Button) findViewById(R.id.activity_main_four_button);
        fiveButton = (Button) findViewById(R.id.activity_main_five_button);
        sixButton = (Button) findViewById(R.id.activity_main_six_button);
        sevenButton = (Button) findViewById(R.id.activity_main_seven_button);
        eightButton = (Button) findViewById(R.id.activity_main_eight_button);
        nineButton = (Button) findViewById(R.id.activity_main_nine_button);
        dotButton = (Button) findViewById(R.id.activity_main_dot_button);

        plusButton = (Button) findViewById(R.id.activity_main_plus_button);
        minusButton = (Button) findViewById(R.id.activity_main_minus_button);
        multiplyButton = (Button) findViewById(R.id.activity_main_multiply_button);
        divideButton = (Button) findViewById(R.id.activity_main_divide_button);
        equalsButton = (Button) findViewById(R.id.activity_main_equals_button);

        acButton = (Button) findViewById(R.id.activity_main_ac_button);

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickZeroButton();
                drawCalculator();
            }
        });
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickOneButton();
                drawCalculator();
            }
        });
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickTwoButton();
                drawCalculator();
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickThreeButton();
                drawCalculator();
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickFourButton();
                drawCalculator();
            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickFiveButton();
                drawCalculator();
            }
        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickSixButton();
                drawCalculator();
            }
        });
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickSevenButton();
                drawCalculator();
            }
        });
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickEightButton();
                drawCalculator();
            }
        });
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickNineButton();
                drawCalculator();
            }
        });
        dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickDotButton();
                drawCalculator();
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickAddButton();
                drawCalculator();
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickSubtractButton();
                drawCalculator();
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickMultiplyButton();
                drawCalculator();
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickDivideButton();
                drawCalculator();
            }
        });
        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickEqualsButton();
                drawCalculator();
            }
        });
        acButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickACButton();
                drawCalculator();
            }
        });
    }

    private void drawCalculator() {
        digitDisplay.setText(calculator.getDigitDisplay());
        opDisplay.setText(calculator.getStoredOperation());
    }
}
