package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b_suma;
    private Button b_resta;
    private Button b_multiplicacion;
    private Button b_division;

    private EditText et_num1;
    private EditText et_num2;
    private TextView tv_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_suma = findViewById(R.id.button_suma);
        b_resta = findViewById(R.id.button_resta);
        b_multiplicacion = findViewById(R.id.button_multiplicacion);
        b_division = findViewById(R.id.button_division);
        tv_result = findViewById(R.id.textView_result);
        et_num1 = findViewById(R.id.editText_num1);
        et_num2 = findViewById(R.id.editText_num2);

        b_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double decimal_num1 = Double.parseDouble(et_num1.getText().toString());
                double decimal_num2 = Double.parseDouble(et_num2.getText().toString());

                tv_result.setText(String.valueOf(decimal_num1+decimal_num2));

            }
        });
        b_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double decimal_num1 = Double.parseDouble(et_num1.getText().toString());
                double decimal_num2 = Double.parseDouble(et_num2.getText().toString());

                tv_result.setText(String.valueOf(decimal_num1-decimal_num2));

            }
        });
        b_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double decimal_num1 = Double.parseDouble(et_num1.getText().toString());
                double decimal_num2 = Double.parseDouble(et_num2.getText().toString());

                tv_result.setText(String.valueOf(decimal_num1*decimal_num2));

            }
        });
        b_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double decimal_num1 = Double.parseDouble(et_num1.getText().toString());
                double decimal_num2 = Double.parseDouble(et_num2.getText().toString());

                tv_result.setText(String.valueOf(decimal_num1/decimal_num2));

            }
        });

    }
}