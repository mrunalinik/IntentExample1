package com.example.b19_activity2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by chethan on 12/3/2015.
 */
public class Activity2 extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity2_layout);

        String value = getIntent().getStringExtra("intentKey");

        Toast.makeText(Activity2.this, "MSG received: "+value, Toast.LENGTH_LONG).show();

    }
}
