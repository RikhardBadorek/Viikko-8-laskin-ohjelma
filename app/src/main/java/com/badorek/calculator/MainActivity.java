package com.badorek.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numberInput1;
    private EditText numberInput2;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput1 = findViewById(R.id.numberInput1);
        numberInput2 = findViewById(R.id.numberInput2);
        output = findViewById(R.id.OutputTextField);
    }

    public void addition (View view) {
        int x = Integer.parseInt(numberInput1.getText().toString());
        int y = Integer.parseInt(numberInput2.getText().toString());

        int z =  x + y;
        output.setText(String.valueOf(z));
    }
    public void subtraction (View view) {
        int x = Integer.parseInt(numberInput1.getText().toString());
        int y = Integer.parseInt(numberInput2.getText().toString());

        int z = x - y;
        output.setText(String.valueOf(z));
    }

    public void multiplication (View view) {
        int x = Integer.parseInt(numberInput1.getText().toString());
        int y = Integer.parseInt(numberInput2.getText().toString());

        int z = x *  y;
        output.setText(String.valueOf(z));
    }

    public void division (View view) {
        int x = Integer.parseInt(numberInput1.getText().toString());
        int y = Integer.parseInt(numberInput2.getText().toString());

        float z = (float) x / (float) y;
        output.setText(String.valueOf(z));
    }
}