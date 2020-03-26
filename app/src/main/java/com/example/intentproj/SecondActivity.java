package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Intent intent = getIntent();

        int num1 = intent.getIntExtra(FirstActivity.EXTRA_NUMBER1,0);
        int num2 = intent.getIntExtra(FirstActivity.EXTRA_NUMBER2,0);

        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView)findViewById(R.id.textView2);

        textView.setText(""+num1);
        textView2.setText(""+num2);

    }
}

