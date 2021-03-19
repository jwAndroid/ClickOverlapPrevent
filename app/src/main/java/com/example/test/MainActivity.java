package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity" ;
    private boolean firstClick = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_test = findViewById(R.id.btn_test);

        btn_test.setOnClickListener(v -> {

            if (firstClick){
                firstClick = false;
                Log.d(TAG , "구현부 안 firstClick ? : " + firstClick);
                //TODO :
                Log.d(TAG , "3초대기");

                new Handler().postDelayed(() -> {

                    firstClick = true;
                    Log.d(TAG , "Handler 안 firstClick ? : " + firstClick);

                }, 3000);

            }

        });


    }
}