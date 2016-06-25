package com.example.b19_activity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    private Button startActivity2Button, startActivity3Button;
    private final int REQ_CODE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_layout);

        startActivity2Button = (Button) findViewById(R.id.startActivity2Btn);
        startActivity3Button = (Button) findViewById(R.id.startActivity3Btn);

        startActivity2Button.setOnClickListener(clickListener);
        startActivity3Button.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.startActivity2Btn:

                    //Start the activity 2

                    Intent intent = new Intent(Activity1.this, Activity2.class);
                    intent.putExtra("intentKey", "Value sent from A1");
                    startActivity(intent);
                    break;

                case R.id.startActivity3Btn:
                    Intent intent2 = new Intent(Activity1.this, Activity3.class);
                    startActivityForResult(intent2, REQ_CODE);
                    break;
            }
        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQ_CODE){ //from activity3

            if(resultCode == RESULT_OK){
                Toast.makeText(Activity1.this, "Success", Toast.LENGTH_LONG).show();
            }
            else if(resultCode == RESULT_CANCELED){
                Toast.makeText(Activity1.this, "Failure", Toast.LENGTH_LONG).show();
            }
        }
    }
}
