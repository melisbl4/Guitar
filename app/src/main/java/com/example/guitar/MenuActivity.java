package com.example.guitar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);
        Button play = (Button)findViewById(R.id.button);
        Button settings = (Button)findViewById(R.id.button2);
        Button authors = (Button)findViewById(R.id.button3);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}