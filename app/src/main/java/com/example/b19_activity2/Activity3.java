package com.example.b19_activity2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    private Button successBtn, failureBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_layout);

        successBtn = (Button) findViewById(R.id.successBtn);
        failureBtn = (Button) findViewById(R.id.failureBtn);

        successBtn.setOnClickListener(clickListener);
        failureBtn.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.successBtn:
                    setResult(RESULT_OK);
                    finish();
                    break;

                case R.id.failureBtn:
                    setResult(RESULT_CANCELED);
                    break;
            }
        }
    };


}
