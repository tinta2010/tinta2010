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
Button sum,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        num1 = findViewById(R.id.editNumber1);
        num2 = findViewById(R.id.editNumber2);
        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);

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
                Intent i = new Intent(MainActivity.this,SecondActivity.class);

                Bundle bundle = new Bundle();
                bundle.putFloat("tv",addition);
                bundle.putFloat("number", 7000);
                bundle.putString("person","Bwalya");

                i.putExtras(bundle);

                startActivity(i);

            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Float number1,number2,sub;

                String str1=num1.getText().toString();
                number1 = Float.parseFloat(str1);

                String str2=num2.getText().toString();
                number2 = Float.parseFloat(str2);
                sub = number1 - number2;

                tv.setText("The difference between\n" +number1+ "and\n" +number2+ "\nis" +sub);

            }
        });


    }
}