package com.example.muyhengsong.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText txt_num1,txt_num2;
    TextView txt_show;
    Button btn_sum,btn_min,btn_mul,btn_div;
    double num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_num1 = (EditText) findViewById(R.id.txt_num1);
        txt_num2 = (EditText) findViewById(R.id.txt_num2);
        txt_show = (TextView) findViewById(R.id.txt_show);

        txt_show.setText("0");

        btn_sum = (Button) findViewById(R.id.btn_sum);
        btn_min = (Button) findViewById(R.id.btn_min);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_div = (Button) findViewById(R.id.btn_div);


        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isNotEmpty()) {
                    num1 = Double.parseDouble(txt_num1.getText().toString());
                    num2 = Double.parseDouble(txt_num2.getText().toString());
                    result = num1 + num2;
                    txt_show.setText(Double.toString(result));
                }else{
                    txt_show.setText("This filed cannot be blank!");
                }
            }
        });

        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNotEmpty()){
                    num1 = Double.parseDouble(txt_num1.getText().toString());
                    num2 = Double.parseDouble(txt_num2.getText().toString());
                    result = num1 - num2;
                    txt_show.setText(Double.toString(result));
                }else {
                    txt_show.setText("This filed cannot be blank!");
                }
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isNotEmpty()){
                    num1 = Double.parseDouble(txt_num1.getText().toString());
                    num2 = Double.parseDouble(txt_num2.getText().toString());
                    result = num1 * num2;
                    txt_show.setText(Double.toString(result));
                }else {
                    txt_show.setText("This filed cannot be blank!");
                }
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isNotEmpty()){
                    num1 = Double.parseDouble(txt_num1.getText().toString());
                    num2 = Double.parseDouble(txt_num2.getText().toString());
                    result = num1 / num2;
                    txt_show.setText(Double.toString(result));
                }else {
                    txt_show.setText("This filed cannot be blank!");
                }
            }
        });

    }

    public boolean isNotEmpty(){
        return !txt_num1.getText().toString().isEmpty() && !txt_num2.getText().toString().isEmpty();
    }

}
