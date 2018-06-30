package com.jayant.secondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends LoginActivity {
    Button add, sub, mul, div,clr;
    TextView result;
    EditText input1, input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        clr = (Button) findViewById(R.id.clr);
        result = (TextView) findViewById(R.id.result);
        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)) {
                    double n1 = Integer.valueOf(input1.getText().toString());
                    double n2 = Integer.valueOf(input2.getText().toString());

                    double add = n1 + n2;

                    result.setText("Add = " + add);
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)) {

                    double n1 = Integer.valueOf(input1.getText().toString());
                    double n2 = Integer.valueOf(input2.getText().toString());

                    double sub = n1 - n2;

                    result.setText("Sub = " + sub);
                }

                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)) {


                    double n1 = Integer.valueOf(input1.getText().toString());
                    double n2 = Integer.valueOf(input2.getText().toString());

                    double mul = n1 * n2;

                    result.setText("Mul = " + mul);
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)) {

                    double n1 = Integer.valueOf(input1.getText().toString());
                    double n2 = Integer.valueOf(input2.getText().toString());

                    double div = n1 / n2;

                    result.setText("Div = " + div);
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText("");
                input2.setText("");
                result.setText("Result");            }
        });
    }
}
