package com.ebarvia.ebarviaquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Four extends AppCompatActivity {

    Button btn_Home;
    Button btn_CS;
    Button btn_IT;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__four);

        btn_Home = (Button) findViewById(R.id.btnHome);
        btn_CS = (Button) findViewById(R.id.btnCS);
        btn_IT = (Button) findViewById(R.id.btnIT);
    }

    public void callHome (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void callCS (View view){
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }

    public void callIT (View view){
        Intent intent = new Intent(this, ActivityThree.class);
        startActivity(intent);
    }
}
