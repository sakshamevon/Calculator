package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstValue,secondValue;
    Button addition,subtraction,multiplication,division;
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValue = findViewById(R.id.textFirstvalue);
        secondValue = findViewById(R.id.textSecondvalue);
        addition = findViewById(R.id.add);
        subtraction = findViewById(R.id.sub);
        multiplication = findViewById(R.id.mul);
        division= findViewById(R.id.div);
        tView=findViewById(R.id.textView);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first,second,answer;
                first=Integer.parseInt(firstValue.getText().toString());
                second=Integer.parseInt(firstValue.getText().toString());
                answer=first+second;
                tView.setText(answer);
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first,second,answer;
                first=Integer.parseInt(firstValue.getText().toString());
                second=Integer.parseInt(firstValue.getText().toString());
                answer=first-second;
                tView.setText(answer);
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first,second,answer;
                first=Integer.parseInt(firstValue.getText().toString());
                second=Integer.parseInt(firstValue.getText().toString());
                answer=first*second;
                tView.setText(answer);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first,second,answer;
                first=Integer.parseInt(firstValue.getText().toString());
                second=Integer.parseInt(firstValue.getText().toString());
                answer=first/second;
                tView.setText(answer);
            }
        });
    }
}