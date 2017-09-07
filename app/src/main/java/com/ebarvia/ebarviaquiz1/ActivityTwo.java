package com.ebarvia.ebarviaquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {


    Button btn_Home;
    Button btn_IT;
    Button btn_IS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btn_Home = (Button) findViewById(R.id.btnHome);
        btn_IT = (Button) findViewById(R.id.btnITP);
        btn_IS = (Button) findViewById(R.id.btnISP);
    }

    public void callHome (View view){
        Intent intent = new Intent(this, MainActivity.class);
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
