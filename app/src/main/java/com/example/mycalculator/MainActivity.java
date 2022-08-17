package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv;
EditText num1,num2;
Button sum,sub,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        num1 = findViewById(R.id.editNumber1);
        num2 = findViewById(R.id.editNumber2);
        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Float number1,number2,addition;

                String str1=num1.getText().toString();
                number1 = Float.parseFloat(str1);

                String str2=num2.getText().toString();
                number2 = Float.parseFloat(str2);
                addition = number1 + number2;



                tv.setText(""+addition);
                //Intent i = new Intent(MainActivity.this,SecondActivity.class);

                Bundle bundle = new Bundle();
                bundle.putFloat("tv",addition);
                bundle.putFloat("number", 7000);

               // i.putExtras(bundle);

                //startActivity(i);

            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Float number1,number2,difference;

                String str1=num1.getText().toString();
                number1 = Float.parseFloat(str1);

                String str2=num2.getText().toString();
                number2 = Float.parseFloat(str2);
                difference = number1 - number2;

               tv.setText(""+difference);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Float number1,number2,division;

                String str1=num1.getText().toString();
                number1 = Float.parseFloat(str1);

                String str2=num2.getText().toString();
                number2 = Float.parseFloat(str2);
                division = number1 / number2;



                tv.setText(""+division);
               // Intent i = new Intent(MainActivity.this,SecondActivity.class);

                Bundle bundle = new Bundle();
                bundle.putFloat("tv",division);
                bundle.putFloat("number", 7000);

               // i.putExtras(bundle);

               // startActivity(i);

            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Float number1,number2,multiplication;

                String str1=num1.getText().toString();
                number1 = Float.parseFloat(str1);

                String str2=num2.getText().toString();
                number2 = Float.parseFloat(str2);
                multiplication = number1 * number2;



                tv.setText(""+multiplication);
                //Intent i = new Intent(MainActivity.this,SecondActivity.class);

                Bundle bundle = new Bundle();
                bundle.putFloat("tv",multiplication);
                bundle.putFloat("number", 7000);

                //i.putExtras(bundle);

                //startActivity(i);

            }
        });

    }
}