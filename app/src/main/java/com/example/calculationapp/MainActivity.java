package com.example.calculationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String num1,operator,num2,result;
    Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,divide,multiple,btnC,equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = num2 = operator ="";
//        one = (Button) findViewById(R.id.one);
//        one.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                inputString += "1";
//            }
//        });

    }
    public void ButtonClick(View view){
        int id  = view.getId();
        EditText input = (EditText) findViewById(R.id.input);
        if(input.getText().toString().contains("+")
        ||input.getText().toString().contains("-")
        ||input.getText().toString().contains("*")
        ||input.getText().toString().contains("/")) {
            if (id == R.id.one) num2 += "1";
            if (id == R.id.two) num2 += "2";
            if (id == R.id.three) num2 += "3";
            if (id == R.id.four) num2 += "4";
            if (id == R.id.five) num2 += "5";
            if (id == R.id.six) num2 += "6";
            if (id == R.id.seven) num2 += "7";
            if (id == R.id.eight) num2 += "8";
            if (id == R.id.nine) num2 += "9";
            if (id == R.id.zero) num2 += "0";
        }
        else {
            if (id == R.id.one) num1 += "1";
            if (id == R.id.two) num1 += "2";
            if (id == R.id.three) num1 += "3";
            if (id == R.id.four) num1 += "4";
            if (id == R.id.five) num1 += "5";
            if (id == R.id.six) num1 += "6";
            if (id == R.id.seven) num1 += "7";
            if (id == R.id.eight) num1 += "8";
            if (id == R.id.nine) num1 += "9";
            if (id == R.id.zero) num1 += "10";
        }
            if (id == R.id.plus) operator = "+";
            if (id == R.id.minus) operator = "-";
            if (id == R.id.multiple) operator = "*";
            if (id == R.id.divide) operator = "/";

        result = num1 + operator + num2;
        String equal = "";
        if(id == R.id.equal) {
            switch (operator) {
                case "+":
                    equal = " = " + (Double.parseDouble(num1) + Double.parseDouble(num2)) + "";
                    break;
                case "-":
                    equal = " = " + (Double.parseDouble(num1) - Double.parseDouble(num2)) + "";
                    break;
                case "*":
                    equal = " = " + (Double.parseDouble(num1) * Double.parseDouble(num2)) + "";
                    break;
                case "/":
                    equal = " = " + (Double.parseDouble(num1) / Double.parseDouble(num2)) + "";
                    break;
            }
        }
        if(id == R.id.C) {
            recreate();
        }
        input.setText(result +  equal);
    }
}
