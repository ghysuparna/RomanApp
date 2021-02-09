package com.example.romanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeAllVariables();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.clearComposingText();
                if(!editText.getText().toString().isEmpty()){
                    Integer value=RomanToInteger.romanToInt(editText.getText().toString().toUpperCase());
                    textView.setText("Roman to Integer value:"+String.valueOf(value));
                }else {
                    Toast.makeText(MainActivity.this,"Please add roman values", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void initializeAllVariables()
    {
        textView=findViewById(R.id.outputText);
        editText=findViewById(R.id.inputEdittext);
        submit=findViewById(R.id.submit);

    }
}