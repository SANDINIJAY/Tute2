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
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

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
        Intent intent = new Intent(this ,SecondActivity.class);
        startActivity(intent);
    }


}
