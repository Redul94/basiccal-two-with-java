package com.example.basecal2;


//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Double num1,num2,answer;
    EditText num1Edit,num2Edit;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1Edit = findViewById(R.id.fNumId);
        num2Edit = findViewById(R.id.sNumId);
        result = findViewById(R.id.displayId);

    }

    public void basicCalFunction(View view) {
        num1 = Double.parseDouble(num1Edit.getText().toString());
        num2 = Double.parseDouble(num2Edit.getText().toString());
        if(view.getId()==R.id.addButt){
            answer = num1+num2;
        }
        else if(view.getId()==R.id.minusButt){
            answer = num1-num2;
        }
        else if(view.getId()==R.id.mulButt){
            answer = num1*num2;
        }
        else {
            answer =num1/ num2;
        }

     result.setText(answer.toString());

    }

}