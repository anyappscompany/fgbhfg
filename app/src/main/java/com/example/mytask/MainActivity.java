package com.example.mytask;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "666";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator calculator = new Calculator(3, 3);
        calculator.Remainder(4f, 3.2f);

        float resultf = calculator.addWithRemainder();
        float result2f = calculator.subtractionWithRemainder();
        float result3f = calculator.divisionWithRemainder();
        float result4f = calculator.multiplicationWithRemainder();

        int result = calculator.add();
        int result2 = calculator.subtraction();
        int result3 = calculator.division();
        int result4 = calculator.multiplication();
    }
}