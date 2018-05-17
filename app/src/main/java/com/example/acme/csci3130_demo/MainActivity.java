package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //widget declarations
        final Button button=findViewById(R.id.button_id);
        final EditText input = findViewById(R.id.textIn);
        final TextView display = findViewById(R.id.display);

        //button process and text grab
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //get text from text field
                String inText = input.getText().toString();
                //display text
                display.setText(inText);
            }
        });
    }


}
