package com.ebarvia.ebarviaquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityThree extends AppCompatActivity {

    Button btn_Home;
    Button btn_CS;
    Button btn_IS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        btn_Home = (Button) findViewById(R.id.btnHome);
        btn_CS = (Button) findViewById(R.id.CSP);
        btn_IS = (Button) findViewById(R.id.ISP2);
    }

    public void callHome (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void callCS (View view){
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }

    public void callIS (View view){
        Intent intent = new Intent(this, Activity_Four.class);
        startActivity(intent);
    }

}
