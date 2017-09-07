package com.ebarvia.ebarviaquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_CS;
    Button btn_IT;
    Button btn_IS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void callCS (View view){
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }

    public void callIT (View view){
        Intent intent = new Intent(this, ActivityThree.class);
        startActivity(intent);
    }

    public void callIS (View view){
        Intent intent = new Intent(this, Activity_Four.class);
        startActivity(intent);
    }
}
