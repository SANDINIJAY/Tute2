package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER1 = "com.example.intentproj.EXTRA_NUMBER1";
    public static final String EXTRA_NUMBER2 = "com.example.intentproj.EXTRA_NUMBER2";


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);



        Context context = getApplicationContext();
        CharSequence message = "Enter two numbers and click OK";

        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

        button =(Button) findViewById(R.id.button);
        button.setOnClickListener((new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivity2();
            }
        }));
    }



    public void openActivity2(){

        EditText editText = (EditText)findViewById(R.id.editText);
        int num1 = Integer.parseInt(editText.getText().toString());

        EditText editText2 = (EditText)findViewById(R.id.editText2);
        int num2 = Integer.parseInt(editText2.getText().toString());



        Intent intent = new Intent(this ,SecondActivity.class);
        intent.putExtra(EXTRA_NUMBER1,num1);
        intent.putExtra(EXTRA_NUMBER2,num2);

        startActivity(intent);
    }


}
