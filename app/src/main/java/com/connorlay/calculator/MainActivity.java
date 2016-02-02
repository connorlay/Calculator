package com.connorlay.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView digitDisplay, opDisplay;

    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();

        digitDisplay = (TextView) findViewById(R.id.activity_main_digit_display);
        opDisplay = (TextView) findViewById(R.id.activity_main_op_display);

        findViewById(R.id.activity_main_zero_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickZeroButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_one_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickOneButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_two_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickTwoButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_three_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickThreeButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_four_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickFourButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_five_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickFiveButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_six_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickSixButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_seven_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickSevenButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_eight_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickEightButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_nine_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickNineButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_dot_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickDotButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_plus_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickAddButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_minus_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickSubtractButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_multiply_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickMultiplyButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_divide_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickDivideButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_equals_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clickEqualsButton();
                drawCalculator();
            }
        });
        findViewById(R.id.activity_main_ac_button).setOnClickListener(new View.OnClickListener() {
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
